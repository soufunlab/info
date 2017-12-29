package com.ratel.info.api.domin;

import com.ratel.common.model.base.Result;
import com.ratel.common.model.page.Pagination;
import com.ratel.info.api.model.City;
import com.ratel.info.api.query.CitySearchParameter;

import java.util.List;

/*
 * Description:
 * All Rights Reserved.
 * @version 1.0 2017/12/23 10:50  by  李浩（lihao@cloud-young.com）创建
 */

public interface CityApi {
	
	/**
	* @Description:
	* @version 1.0 2017/12/23 10:50 by 李浩（lihao@cloud-young.com）创建
	* @param entity
	* @param sessionId
	* @return
	*/
	Result<City> addCity(City entity, String sessionId);
	
	/**
	* @Description:
	* @version 1.0 2017/12/23 10:50 by 李浩（lihao@cloud-young.com）创建
	* @param id
	* @param sessionId
	* @return
	*/
	Result<Boolean> delCityById(Integer id, String sessionId);
	
	/**
	* @Description:
	* @version 1.0 2017/12/23 10:50 by 李浩（lihao@cloud-young.com）创建
	* @param id
	* @param sessionId
	* @return
	*/
	Result<City> getCityById(Integer id, String sessionId);
	
	/**
	 * @Description:
	 * @version 1.0 2017/12/23 10:50 by 李浩（lihao@cloud-young.com）创建
	 * @param entity
	 * @param sessionId
	 * @return
	 */
	Result<Boolean> updateCity(City entity, String sessionId);
	
	/**
	 * @Description:
	 * @version 1.0 2017/12/23 10:50 by 李浩（lihao@cloud-young.com）创建
	 * @param searchVo
	 * @param sessionId
	 * @return
	 */
	Result<List<City>> getCityListByCondition(CitySearchParameter searchVo, String sessionId);

	/**
	 * @Description:
	 * @version 1.0 2017/12/23 10:50 by 李浩（lihao@cloud-young.com）创建
	 * @param searchVo
	 * @param page
	 * @param sessionId
	 * @return
	 */
	Result<Pagination<City>> getCityPageListByCondition(CitySearchParameter searchVo, Pagination page, String sessionId);
}
