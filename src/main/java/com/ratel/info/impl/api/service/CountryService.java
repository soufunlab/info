package com.ratel.info.impl.api.service;

import com.ratel.info.impl.api.service.BaseService;
import com.ratel.info.api.model.*;
import com.ratel.info.api.query.*;
import java.util.List;
import com.ratel.common.model.page.Pagination;

/*
 * Description:
 * All Rights Reserved.
 * @version 1.0 2017/12/31 06:08  by  李浩（lihao@cloud-young.com）创建
 */

public interface CountryService extends BaseService<Country, CountryExample> {
	
	/**
	 * @Description:
	 * @version 1.0 2017/12/31 06:08 by 李浩（lihao@cloud-young.com）创建
	 * @param searchVo
	 * @return
	 */
	List<Country> getCountryListByCondition(CountrySearchParameter searchVo);
	
	/**
	 * @Description:
	 * @version 1.0 2017/12/31 06:08 by 李浩（lihao@cloud-young.com）创建
	 * @param searchVo
	 * @param page
	 * @return
	 */	
	Pagination<Country> getCountryPageListByCondition(CountrySearchParameter searchVo,Pagination page);
}
