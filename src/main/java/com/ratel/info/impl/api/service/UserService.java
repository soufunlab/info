package com.ratel.info.impl.api.service;

import com.ratel.info.impl.api.service.BaseService;
import com.ratel.info.api.model.*;
import com.ratel.info.api.query.*;

import java.util.List;

import com.ratel.common.model.page.Pagination;

/*
 * Description:
 * All Rights Reserved.
 * @version 1.0 2018/01/03 03:35  by  李浩（lihao@cloud-young.com）创建
 */

public interface UserService extends BaseService<User, UserExample> {

    /**
     * @param searchVo
     * @return
     * @Description:
     * @version 1.0 2018/01/03 03:35 by 李浩（lihao@cloud-young.com）创建
     */
    List<User> getUserListByCondition(UserSearchParameter searchVo);

    /**
     * @param searchVo
     * @param page
     * @return
     * @Description:
     * @version 1.0 2018/01/03 03:35 by 李浩（lihao@cloud-young.com）创建
     */
    Pagination<User> getUserPageListByCondition(UserSearchParameter searchVo, Pagination page);

    /**
     * 缓存获取用户信息
     * @return
     */
    User getUserFromCache();

    /**
     * 这只用户缓存信息
     * @param user
     */
    void setUserCache(User user);
}
