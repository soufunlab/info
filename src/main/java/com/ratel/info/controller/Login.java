package com.ratel.info.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 说明：
 * 版权所有。
 *
 * @version 1.0 2018-1-3 16:27 by 李浩（lihao@cloud-young.com）创建
 */
@Controller
public class Login {
    @RequestMapping("/login.html")
    public String index() {
        return "login";
    }

    @ResponseBody
    @RequestMapping("/login.do")
    public String login() {
        return "";
    }
}
