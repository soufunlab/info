package com.ratel.info.api.domain;

import com.ratel.common.model.base.Result;
import com.ratel.common.model.page.Pagination;
import com.ratel.info.api.model.*;
import com.ratel.info.api.query.*;

import java.util.List;

/*
 * Description:
 * All Rights Reserved.
 * @version 1.0 2018/01/03 03:35  by  李浩（lihao@cloud-young.com）创建
 */

public interface UserApi {
	
	/**
	* @Description:
	* @version 1.0 2018/01/03 03:35 by 李浩（lihao@cloud-young.com）创建
	* @param entity
	* @return
	*/
	Result<User> addUser(User entity);
	
	/**
	* @Description:
	* @version 1.0 2018/01/03 03:35 by 李浩（lihao@cloud-young.com）创建
	* @param id
	* @return
	*/
	Result<Boolean> delUserById(Integer id);
	
	/**
	* @Description:
	* @version 1.0 2018/01/03 03:35 by 李浩（lihao@cloud-young.com）创建
	* @param id
	* @return
	*/
	Result<User> getUserById(Integer id);
	
	/**
	 * @Description:
	 * @version 1.0 2018/01/03 03:35 by 李浩（lihao@cloud-young.com）创建
	 * @param entity
	 * @return
	 */
	Result<Boolean> updateUser(User entity);
	
	/**
	 * @Description:
	 * @version 1.0 2018/01/03 03:35 by 李浩（lihao@cloud-young.com）创建
	 * @param searchVo
	 * @return
	 */
	Result<List<User>> getUserListByCondition(UserSearchParameter searchVo);
	
	/**
	 * @Description:
	 * @version 1.0 2018/01/03 03:35 by 李浩（lihao@cloud-young.com）创建
	 * @param searchVo
	 * @param page
	 * @return
	 */
	Result<Pagination<User>> getUserPageListByCondition(UserSearchParameter searchVo,Pagination page);
}
