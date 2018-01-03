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
	* @param sessionId
	* @return
	*/
	Result<User> addUser(User entity, String sessionId);
	
	/**
	* @Description:
	* @version 1.0 2018/01/03 03:35 by 李浩（lihao@cloud-young.com）创建
	* @param id
	* @param sessionId
	* @return
	*/
	Result<Boolean> delUserById(Integer id, String sessionId);
	
	/**
	* @Description:
	* @version 1.0 2018/01/03 03:35 by 李浩（lihao@cloud-young.com）创建
	* @param id
	* @param sessionId
	* @return
	*/
	Result<User> getUserById(Integer id, String sessionId);
	
	/**
	 * @Description:
	 * @version 1.0 2018/01/03 03:35 by 李浩（lihao@cloud-young.com）创建
	 * @param entity
	 * @param sessionId
	 * @return
	 */
	Result<Boolean> updateUser(User entity, String sessionId);
	
	/**
	 * @Description:
	 * @version 1.0 2018/01/03 03:35 by 李浩（lihao@cloud-young.com）创建
	 * @param searchVo
	 * @param sessionId
	 * @return
	 */
	Result<List<User>> getUserListByCondition(UserSearchParameter searchVo,String sessionId);
	
	/**
	 * @Description:
	 * @version 1.0 2018/01/03 03:35 by 李浩（lihao@cloud-young.com）创建
	 * @param searchVo
	 * @param page
	 * @param sessionId
	 * @return
	 */
	Result<Pagination<User>> getUserPageListByCondition(UserSearchParameter searchVo,Pagination page,String sessionId);
}
