package com.ratel.info.controller;

import com.ratel.common.model.base.Result;
import com.ratel.info.api.domain.CityApi;
import com.ratel.info.api.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 说明：
 * 版权所有。
 *
 * @version 1.0 2017-12-29 16:17 by 李浩（lihao@cloud-young.com）创建
 */
@RestController
public class Home {

    @Autowired
    private CityApi cityApi;

    @RequestMapping("/")
    public String get() {

        Result<City> city = cityApi.getCityById(2, "");
        return city.getResult().getName();
    }
}
