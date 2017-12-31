package com.ratel.info.impl.api.service.impl;

import com.ratel.info.impl.api.service.impl.BaseServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ratel.info.api.model.Country;
import com.ratel.info.api.model.CountryExample;
import com.ratel.info.impl.api.service.CountryService;
import com.ratel.info.api.query.*;
import java.util.List;
import com.ratel.common.model.page.Pagination;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.util.Date;
import java.math.*;

/*
 * Description:
 * All Rights Reserved.
 * @version 1.0 2017/12/31 06:09  by  李浩（lihao@cloud-young.com）创建
 */

@Service("countryService")
@Transactional
public class CountryServiceImpl extends  BaseServiceImpl<Country, CountryExample> implements CountryService {
	
	@Override
	public List<Country> getCountryListByCondition(CountrySearchParameter searchVo){
		
		CountryExample example = new CountryExample();
		example.setOrderByClause(searchVo.getOrderByClause());
		
        CountryExample.Criteria criteria = example.createCriteria();
        //criteria.andIsActiveEqualTo(1);
		
		//手动书写逻辑，判断非空（字符串需判断""）才加入筛选条件
		String code = searchVo.getCode();
		if(code != null){
			criteria.andCodeEqualTo(searchVo.getCode());
		}
		String name = searchVo.getName();
		if(name != null){
			criteria.andNameEqualTo(searchVo.getName());
		}
		String continent = searchVo.getContinent();
		if(continent != null){
			criteria.andContinentEqualTo(searchVo.getContinent());
		}
		String region = searchVo.getRegion();
		if(region != null){
			criteria.andRegionEqualTo(searchVo.getRegion());
		}
		Float surfaceArea = searchVo.getSurfaceArea();
		if(surfaceArea != null){
			criteria.andSurfaceAreaEqualTo(searchVo.getSurfaceArea());
		}
		Integer indepYear = searchVo.getIndepYear();
		if(indepYear != null){
			criteria.andIndepYearEqualTo(searchVo.getIndepYear());
		}
		Integer population = searchVo.getPopulation();
		if(population != null){
			criteria.andPopulationEqualTo(searchVo.getPopulation());
		}
		Float lifeExpectancy = searchVo.getLifeExpectancy();
		if(lifeExpectancy != null){
			criteria.andLifeExpectancyEqualTo(searchVo.getLifeExpectancy());
		}
		Float gnp = searchVo.getGnp();
		if(gnp != null){
			criteria.andGnpEqualTo(searchVo.getGnp());
		}
		Float gnpold = searchVo.getGnpold();
		if(gnpold != null){
			criteria.andGnpoldEqualTo(searchVo.getGnpold());
		}
		String localName = searchVo.getLocalName();
		if(localName != null){
			criteria.andLocalNameEqualTo(searchVo.getLocalName());
		}
		String governmentForm = searchVo.getGovernmentForm();
		if(governmentForm != null){
			criteria.andGovernmentFormEqualTo(searchVo.getGovernmentForm());
		}
		String headOfState = searchVo.getHeadOfState();
		if(headOfState != null){
			criteria.andHeadOfStateEqualTo(searchVo.getHeadOfState());
		}
		Integer capital = searchVo.getCapital();
		if(capital != null){
			criteria.andCapitalEqualTo(searchVo.getCapital());
		}
		String code2 = searchVo.getCode2();
		if(code2 != null){
			criteria.andCode2EqualTo(searchVo.getCode2());
		}
		
		List<Country> list = this.selectByExample(example);
		return list;
	}
	
	@Override
	public Pagination<Country> getCountryPageListByCondition(CountrySearchParameter searchVo,Pagination page){
		
		CountryExample example = new CountryExample();
		example.setOrderByClause(searchVo.getOrderByClause());
		
        CountryExample.Criteria criteria = example.createCriteria();
        //criteria.andIsActiveEqualTo(1);
		
		PageHelper.startPage(page.getPage(), page.getPageSize());
		
		//手动书写逻辑，判断非空（字符串需判断""）才加入筛选条件
		String code = searchVo.getCode();
		if(code != null){
			criteria.andCodeEqualTo(searchVo.getCode());
		}
		String name = searchVo.getName();
		if(name != null){
			criteria.andNameEqualTo(searchVo.getName());
		}
		String continent = searchVo.getContinent();
		if(continent != null){
			criteria.andContinentEqualTo(searchVo.getContinent());
		}
		String region = searchVo.getRegion();
		if(region != null){
			criteria.andRegionEqualTo(searchVo.getRegion());
		}
		Float surfaceArea = searchVo.getSurfaceArea();
		if(surfaceArea != null){
			criteria.andSurfaceAreaEqualTo(searchVo.getSurfaceArea());
		}
		Integer indepYear = searchVo.getIndepYear();
		if(indepYear != null){
			criteria.andIndepYearEqualTo(searchVo.getIndepYear());
		}
		Integer population = searchVo.getPopulation();
		if(population != null){
			criteria.andPopulationEqualTo(searchVo.getPopulation());
		}
		Float lifeExpectancy = searchVo.getLifeExpectancy();
		if(lifeExpectancy != null){
			criteria.andLifeExpectancyEqualTo(searchVo.getLifeExpectancy());
		}
		Float gnp = searchVo.getGnp();
		if(gnp != null){
			criteria.andGnpEqualTo(searchVo.getGnp());
		}
		Float gnpold = searchVo.getGnpold();
		if(gnpold != null){
			criteria.andGnpoldEqualTo(searchVo.getGnpold());
		}
		String localName = searchVo.getLocalName();
		if(localName != null){
			criteria.andLocalNameEqualTo(searchVo.getLocalName());
		}
		String governmentForm = searchVo.getGovernmentForm();
		if(governmentForm != null){
			criteria.andGovernmentFormEqualTo(searchVo.getGovernmentForm());
		}
		String headOfState = searchVo.getHeadOfState();
		if(headOfState != null){
			criteria.andHeadOfStateEqualTo(searchVo.getHeadOfState());
		}
		Integer capital = searchVo.getCapital();
		if(capital != null){
			criteria.andCapitalEqualTo(searchVo.getCapital());
		}
		String code2 = searchVo.getCode2();
		if(code2 != null){
			criteria.andCode2EqualTo(searchVo.getCode2());
		}
		
		List<Country> list = this.selectByExample(example);
		
		PageInfo pageInfo = new PageInfo(list);
		page.setContent(list);
		page.setDataNumber(pageInfo.getTotal());
        return page;
		
	}

}
