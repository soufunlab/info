package com.ratel.info.api.domain;

import com.ratel.common.model.base.Result;
import com.ratel.common.model.page.Pagination;
import com.ratel.info.api.model.*;
import com.ratel.info.api.query.*;

import java.util.List;

/*
 * Description:
 * All Rights Reserved.
 * @version 1.0 2017/12/31 06:02  by  李浩（lihao@cloud-young.com）创建
 */

public interface CountryApi {
	
	/**
	* @Description:
	* @version 1.0 2017/12/31 06:02 by 李浩（lihao@cloud-young.com）创建
	* @param entity
	* @param sessionId
	* @return
	*/
	Result<Country> addCountry(Country entity, String sessionId);
	
	/**
	* @Description:
	* @version 1.0 2017/12/31 06:02 by 李浩（lihao@cloud-young.com）创建
	* @param id
	* @param sessionId
	* @return
	*/
	Result<Boolean> delCountryById(java.lang.String id, String sessionId);
	
	/**
	* @Description:
	* @version 1.0 2017/12/31 06:02 by 李浩（lihao@cloud-young.com）创建
	* @param id
	* @param sessionId
	* @return
	*/
	Result<Country> getCountryById(java.lang.String id, String sessionId);
	
	/**
	 * @Description:
	 * @version 1.0 2017/12/31 06:02 by 李浩（lihao@cloud-young.com）创建
	 * @param entity
	 * @param sessionId
	 * @return
	 */
	Result<Boolean> updateCountry(Country entity, String sessionId);
	
	/**
	 * @Description:
	 * @version 1.0 2017/12/31 06:02 by 李浩（lihao@cloud-young.com）创建
	 * @param searchVo
	 * @param sessionId
	 * @return
	 */
	Result<List<Country>> getCountryListByCondition(CountrySearchParameter searchVo,String sessionId);
	
	/**
	 * @Description:
	 * @version 1.0 2017/12/31 06:02 by 李浩（lihao@cloud-young.com）创建
	 * @param searchVo
	 * @param page
	 * @param sessionId
	 * @return
	 */
	Result<Pagination<Country>> getCountryPageListByCondition(CountrySearchParameter searchVo,Pagination page,String sessionId);
}
