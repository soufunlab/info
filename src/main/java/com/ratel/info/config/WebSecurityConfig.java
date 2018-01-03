package com.ratel.info.config;

import com.ratel.info.api.annotations.AuthPassport;
import com.ratel.info.api.model.User;
import com.ratel.info.api.model.UserExample;
import com.ratel.info.impl.api.service.UserService;
import com.ratel.info.impl.api.utils.AesUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Configuration
public class WebSecurityConfig extends WebMvcConfigurerAdapter {

    @Bean
    public HandlerInterceptorAdapter securityHandler() {
        return new SecurityHandler();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(securityHandler());
    }
}

class SecurityHandler extends HandlerInterceptorAdapter {

    @Autowired
    private AppConfig appConfig;
    @Autowired
    private UserService userService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            AuthPassport methodAnno = handlerMethod.getMethodAnnotation(AuthPassport.class);
            if (methodAnno != null) {
                if (!verifyAuth(request)) {
                    response.sendRedirect("/login.html");
                    return false;
                }
            } else {
                Class<?> type = handlerMethod.getBeanType(); //对应的controller方法
                AuthPassport classAnno = type.getAnnotation(AuthPassport.class);
                if (classAnno != null) {
                    if (!verifyAuth(request)) {
                        response.sendRedirect("/login.html");
                        return false;
                    }
                }
            }
        }

        return true;
    }

    private boolean verifyAuth(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null && cookies.length > 0) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("token") && StringUtils.isNotEmpty(cookie.getValue())) {
                    String decryptStr = AesUtil.decrypt(appConfig.getTokenCode(), cookie.getValue());
                    try {
                        String token = decryptStr.split("|")[0];
                        User user = userService.getUserFromCache();
                        if (user != null && user.getToken().equals(token)) {
                            return true;
                        } else {
                            UserExample example = new UserExample();
                            example.createCriteria().andTokenEqualTo(token);
                            User dbUser = userService.selectByExample(example).get(0);
                            if (dbUser != null) {
                                userService.setUserCache(user);
                                return true;
                            }
                        }
                    } catch (Exception err) {
                    }
                }
            }

        }
        return false;
    }

}
