package com.ratel.info.controller;

import com.ratel.common.model.base.Result;
import com.ratel.info.api.annotations.AuthPassport;
import com.ratel.info.api.domain.UserApi;
import com.ratel.info.api.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.servlet.mvc.Controller;

/**
 * 说明：
 * 版权所有。
 *
 * @version 1.0 2017-12-29 16:17 by 李浩（lihao@cloud-young.com）创建
 */
@RestController
@AuthPassport
public class Home {

    @Autowired
    private UserApi userApi;

    @RequestMapping("/")
    public String get() {
        RequestContextHolder.getRequestAttributes();
        Result<User> city = userApi.getUserById(2, "");
        return city.getResult().getMobile();
    }
}
