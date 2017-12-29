package com.ratel.info.impl.api.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ratel.common.model.page.Pagination;
import com.ratel.info.impl.api.service.CityService;
import com.ratel.info.api.model.City;
import com.ratel.info.api.model.CityExample;
import com.ratel.info.api.query.CitySearchParameter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/*
 * Description:
 * All Rights Reserved.
 * @version 1.0 2017/12/23 10:50  by  李浩（lihao@cloud-young.com）创建
 */

@Service("cityService")
@Transactional
public class CityServiceImpl extends  BaseServiceImpl<City, CityExample> implements CityService {
	
	@Override
	public List<City> getCityListByCondition(CitySearchParameter searchVo){
		
		CityExample example = new CityExample();
		example.setOrderByClause(searchVo.getOrderByClause());
		
        CityExample.Criteria criteria = example.createCriteria();
        //criteria.andIsActiveEqualTo(1);
		
		//手动书写逻辑，判断非空（字符串需判断""）才加入筛选条件
		Integer id = searchVo.getId();
		if(id != null){
			criteria.andIdEqualTo(searchVo.getId());
		}
		String name = searchVo.getName();
		if(name != null){
			criteria.andNameEqualTo(searchVo.getName());
		}
		String countryCode = searchVo.getCountryCode();
		if(countryCode != null){
			criteria.andCountryCodeEqualTo(searchVo.getCountryCode());
		}
		String district = searchVo.getDistrict();
		if(district != null){
			criteria.andDistrictEqualTo(searchVo.getDistrict());
		}
		Integer population = searchVo.getPopulation();
		if(population != null){
			criteria.andPopulationEqualTo(searchVo.getPopulation());
		}
		
		List<City> list = this.selectByExample(example);
		return list;
	}
	
	@Override
	public Pagination<City> getCityPageListByCondition(CitySearchParameter searchVo,Pagination page){
		
		CityExample example = new CityExample();
		example.setOrderByClause(searchVo.getOrderByClause());
		
        CityExample.Criteria criteria = example.createCriteria();
        //criteria.andIsActiveEqualTo(1);
		
		PageHelper.startPage(page.getPage(), page.getPageSize());
		
		//手动书写逻辑，判断非空（字符串需判断""）才加入筛选条件
		Integer id = searchVo.getId();
		if(id != null){
			criteria.andIdEqualTo(searchVo.getId());
		}
		String name = searchVo.getName();
		if(name != null){
			criteria.andNameEqualTo(searchVo.getName());
		}
		String countryCode = searchVo.getCountryCode();
		if(countryCode != null){
			criteria.andCountryCodeEqualTo(searchVo.getCountryCode());
		}
		String district = searchVo.getDistrict();
		if(district != null){
			criteria.andDistrictEqualTo(searchVo.getDistrict());
		}
		Integer population = searchVo.getPopulation();
		if(population != null){
			criteria.andPopulationEqualTo(searchVo.getPopulation());
		}
		
		List<City> list = this.selectByExample(example);
		
		PageInfo pageInfo = new PageInfo(list);
		page.setContent(list);
		page.setDataNumber(pageInfo.getTotal());
        return page;
		
	}

}
