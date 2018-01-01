package com.ratel.info.config;

import com.ratel.info.api.annotations.AuthPassport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

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
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            AuthPassport methodAnno = handlerMethod.getMethodAnnotation(AuthPassport.class);
            if (methodAnno != null) {

            } else {
                Class<?> type = handlerMethod.getBeanType(); //对应的controller方法
                AuthPassport classAnno = type.getAnnotation(AuthPassport.class);
                if (classAnno != null) {

                }
            }
        }

        return true;
    }
}
