package com.ratel.info.impl.api.service.impl;

import com.ratel.info.impl.api.service.impl.BaseServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ratel.info.api.model.User;
import com.ratel.info.api.model.UserExample;
import com.ratel.info.impl.api.service.UserService;
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
 * @version 1.0 2018/01/03 03:35  by  李浩（lihao@cloud-young.com）创建
 */

@Service("userService")
@Transactional
public class UserServiceImpl extends  BaseServiceImpl<User, UserExample> implements UserService {
	
	@Override
	public List<User> getUserListByCondition(UserSearchParameter searchVo){
		
		UserExample example = new UserExample();
		example.setOrderByClause(searchVo.getOrderByClause());
		
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andIsActiveEqualTo(1);
		
		//手动书写逻辑，判断非空（字符串需判断""）才加入筛选条件
		Integer id = searchVo.getId();
		if(id != null){
			criteria.andIdEqualTo(searchVo.getId());
		}
		String account = searchVo.getAccount();
		if(account != null){
			criteria.andAccountEqualTo(searchVo.getAccount());
		}
		String password = searchVo.getPassword();
		if(password != null){
			criteria.andPasswordEqualTo(searchVo.getPassword());
		}
		String userNickName = searchVo.getUserNickName();
		if(userNickName != null){
			criteria.andUserNickNameEqualTo(searchVo.getUserNickName());
		}
		Integer sex = searchVo.getSex();
		if(sex != null){
			criteria.andSexEqualTo(searchVo.getSex());
		}
		String mobile = searchVo.getMobile();
		if(mobile != null){
			criteria.andMobileEqualTo(searchVo.getMobile());
		}
		Integer isActive = searchVo.getIsActive();
		if(isActive != null){
			criteria.andIsActiveEqualTo(searchVo.getIsActive());
		}
		Date createTime = searchVo.getCreateTime();
		if(createTime != null){
			criteria.andCreateTimeEqualTo(searchVo.getCreateTime());
		}
		Date updateTime = searchVo.getUpdateTime();
		if(updateTime != null){
			criteria.andUpdateTimeEqualTo(searchVo.getUpdateTime());
		}
		
		List<User> list = this.selectByExample(example);
		return list;
	}
	
	@Override
	public Pagination<User> getUserPageListByCondition(UserSearchParameter searchVo,Pagination page){
		
		UserExample example = new UserExample();
		example.setOrderByClause(searchVo.getOrderByClause());
		
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andIsActiveEqualTo(1);
		
		PageHelper.startPage(page.getPage(), page.getPageSize());
		
		//手动书写逻辑，判断非空（字符串需判断""）才加入筛选条件
		Integer id = searchVo.getId();
		if(id != null){
			criteria.andIdEqualTo(searchVo.getId());
		}
		String account = searchVo.getAccount();
		if(account != null){
			criteria.andAccountEqualTo(searchVo.getAccount());
		}
		String password = searchVo.getPassword();
		if(password != null){
			criteria.andPasswordEqualTo(searchVo.getPassword());
		}
		String userNickName = searchVo.getUserNickName();
		if(userNickName != null){
			criteria.andUserNickNameEqualTo(searchVo.getUserNickName());
		}
		Integer sex = searchVo.getSex();
		if(sex != null){
			criteria.andSexEqualTo(searchVo.getSex());
		}
		String mobile = searchVo.getMobile();
		if(mobile != null){
			criteria.andMobileEqualTo(searchVo.getMobile());
		}
		Integer isActive = searchVo.getIsActive();
		if(isActive != null){
			criteria.andIsActiveEqualTo(searchVo.getIsActive());
		}
		Date createTime = searchVo.getCreateTime();
		if(createTime != null){
			criteria.andCreateTimeEqualTo(searchVo.getCreateTime());
		}
		Date updateTime = searchVo.getUpdateTime();
		if(updateTime != null){
			criteria.andUpdateTimeEqualTo(searchVo.getUpdateTime());
		}
		
		List<User> list = this.selectByExample(example);
		
		PageInfo pageInfo = new PageInfo(list);
		page.setContent(list);
		page.setDataNumber(pageInfo.getTotal());
        return page;
		
	}

	@Override
	public User getUserFromCache() {
		return null;
	}

	@Override
	public void setUserCache(User user) {

	}

}
