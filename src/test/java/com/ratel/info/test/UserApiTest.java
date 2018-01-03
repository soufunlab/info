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

public class UserApiTest extends BaseTest {
    @Autowired
    private UserApi api;
	
//	@Test
//	public void testAll(){
//		addUser();
//		getUserById();
//		updateUser();
//		getUserListByCondition();
//		getUserPageListByCondition();
//		delUserById();
//	}

//    @Test
//    public void addUser() {
//		User entity = new User();
//		entity.setId();
//		entity.setAccount();
//		entity.setPassword();
//		entity.setUserNickName();
//		entity.setSex();
//		entity.setMobile();
//		entity.setIsActive();
//		entity.setCreateTime();
//		entity.setUpdateTime();
//        Result<User> result = api.addUser(entity, "test");
//        Assert.assertTrue(result.getResult().getId() != null);
//    }
//
//
//	@Test
//    public void getUserById() {
//		Result<User> result = api.getUserById(1, "test");
//        Assert.assertTrue(result.getResult() != null);
//    }
//
//	@Test
//    public void updateUser() {
//		User entity = new User();
//        entity.setId(1);
//		entity.setId();
//		entity.setAccount();
//		entity.setPassword();
//		entity.setUserNickName();
//		entity.setSex();
//		entity.setMobile();
//		entity.setIsActive();
//		entity.setCreateTime();
//		entity.setUpdateTime();
//        Result<Boolean> result = api.updateUser(entity,"test");
//        Assert.assertTrue(result.isSuccess());
//    }
//
//	@Test
//    public void getUserListByCondition() {
//		UserSearchParameter searchVo = new UserSearchParameter();
//		searchVo.setId();
//		searchVo.setAccount();
//		searchVo.setPassword();
//		searchVo.setUserNickName();
//		searchVo.setSex();
//		searchVo.setMobile();
//		searchVo.setIsActive();
//		searchVo.setCreateTime();
//		searchVo.setUpdateTime();
//		Result<List<User>> result = api.getUserListByCondition(searchVo,"test");
//		Assert.assertTrue(result.getResult().size()>0);
//    }
//
//	@Test
//	public void getUserPageListByCondition(){
//		Pagination pagination = new Pagination();
//        pagination.setPage(1);
//        pagination.setPageSize(10);
//
//		UserSearchParameter searchVo = new UserSearchParameter();
//		searchVo.setId();
//		searchVo.setAccount();
//		searchVo.setPassword();
//		searchVo.setUserNickName();
//		searchVo.setSex();
//		searchVo.setMobile();
//		searchVo.setIsActive();
//		searchVo.setCreateTime();
//		searchVo.setUpdateTime();
//
//		Result<Pagination<User>> list = api.getUserPageListByCondition(searchVo,pagination,"test");
//        Assert.assertTrue(list.getResult().getTotalPage()>0);
//	}
	
	@Test
    public void delUserById() {
		Result<Boolean> result = api.delUserById(1);
		Assert.assertTrue(result.isSuccess());
    }
}
