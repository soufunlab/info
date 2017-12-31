package com.ratel.info.test;

import com.ratel.common.model.base.Result;
import com.ratel.info.api.domain.*;
import com.ratel.info.api.model.*;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.Assert;
import com.ratel.info.api.query.*;
import com.ratel.common.model.page.Pagination;
import com.ratel.common.model.MoChecker;

public class CountryApiTest extends BaseTest {
//    @Autowired
//    private CountryApi api;
//
//	@Test
//	public void testAll(){
//		addCountry();
//		getCountryById();
//		updateCountry();
//		getCountryListByCondition();
//		getCountryPageListByCondition();
//		delCountryById();
//	}
//
//    @Test
//    public void addCountry() {
//		Country entity = new Country();
//		entity.setCode();
//		entity.setName();
//		entity.setContinent();
//		entity.setRegion();
//		entity.setSurfaceArea();
//		entity.setIndepYear();
//		entity.setPopulation();
//		entity.setLifeExpectancy();
//		entity.setGnp();
//		entity.setGnpold();
//		entity.setLocalName();
//		entity.setGovernmentForm();
//		entity.setHeadOfState();
//		entity.setCapital();
//		entity.setCode2();
//        Result<Country> result = api.addCountry(entity, "test");
//        Assert.assertTrue(result.getResult().getId() != null);
//    }
//
//
//	@Test
//    public void getCountryById() {
//		Result<Country> result = api.getCountryById(1, "test");
//        Assert.assertTrue(result.getResult() != null);
//    }
//
//	@Test
//    public void updateCountry() {
//		Country entity = new Country();
//        entity.setId(1);
//		entity.setCode();
//		entity.setName();
//		entity.setContinent();
//		entity.setRegion();
//		entity.setSurfaceArea();
//		entity.setIndepYear();
//		entity.setPopulation();
//		entity.setLifeExpectancy();
//		entity.setGnp();
//		entity.setGnpold();
//		entity.setLocalName();
//		entity.setGovernmentForm();
//		entity.setHeadOfState();
//		entity.setCapital();
//		entity.setCode2();
//        Result<Boolean> result = api.updateCountry(entity,"test");
//        Assert.assertTrue(result.isSuccess());
//    }
//
//	@Test
//    public void getCountryListByCondition() {
//		CountrySearchParameter searchVo = new CountrySearchParameter();
//		searchVo.setCode();
//		searchVo.setName();
//		searchVo.setContinent();
//		searchVo.setRegion();
//		searchVo.setSurfaceArea();
//		searchVo.setIndepYear();
//		searchVo.setPopulation();
//		searchVo.setLifeExpectancy();
//		searchVo.setGnp();
//		searchVo.setGnpold();
//		searchVo.setLocalName();
//		searchVo.setGovernmentForm();
//		searchVo.setHeadOfState();
//		searchVo.setCapital();
//		searchVo.setCode2();
//		Result<List<Country>> result = api.getCountryListByCondition(searchVo,"test");
//		Assert.assertTrue(result.getResult().size()>0);
//    }
//
//	@Test
//	public void getCountryPageListByCondition(){
//		Pagination pagination = new Pagination();
//        pagination.setPage(1);
//        pagination.setPageSize(10);
//
//		CountrySearchParameter searchVo = new CountrySearchParameter();
//		searchVo.setCode();
//		searchVo.setName();
//		searchVo.setContinent();
//		searchVo.setRegion();
//		searchVo.setSurfaceArea();
//		searchVo.setIndepYear();
//		searchVo.setPopulation();
//		searchVo.setLifeExpectancy();
//		searchVo.setGnp();
//		searchVo.setGnpold();
//		searchVo.setLocalName();
//		searchVo.setGovernmentForm();
//		searchVo.setHeadOfState();
//		searchVo.setCapital();
//		searchVo.setCode2();
//
//		Result<Pagination<Country>> list = api.getCountryPageListByCondition(searchVo,pagination,"test");
//        Assert.assertTrue(list.getResult().getTotalPage()>0);
//	}
//
//	@Test
//    public void delCountryById() {
//		Result<Boolean> result = api.delCountryById(1,"test");
//		Assert.assertTrue(result.isSuccess());
//    }
}
