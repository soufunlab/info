package com.ratel.info.api.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.io.Serializable;
import com.ratel.common.model.annotation.*;

/*
 * Description:
 * All Rights Reserved.
 * @version 1.0 2018/01/03 04:20  by  李浩（lihao@cloud-young.com）创建
 */

public class User implements Serializable {


	//alias
	@UpdateRequiredAnno
	private Integer id;  
	/**
	*
	*/
	@InsertRequiredAnno
	private String account;  
	/**
	*
	*/
	@InsertRequiredAnno
	private String password;  
	/**
	*
	*/
	@InsertRequiredAnno
	private String userNickName;  
	/**
	*
	*/
	@InsertRequiredAnno
	private Integer sex;  
	/**
	*
	*/
	@InsertRequiredAnno
	private String mobile;  
	/**
	*
	*/
	@InsertRequiredAnno
	private Integer isActive;  
	/**
	*cookie票据
	*/
	@InsertRequiredAnno
	private String token;  
	/**
	*
	*/
	@InsertRequiredAnno
	private Date createTime;  
	/**
	*
	*/
	@InsertRequiredAnno
	private Date updateTime;  
	

    
    public void setId(Integer id) {  
        this.id = id;  
    }  
      
    public Integer getId() {  
        return this.id;  
    }  
    
    public void setAccount(String account) {  
        this.account = account;  
    }  
      
    public String getAccount() {  
        return this.account;  
    }  
    
    public void setPassword(String password) {  
        this.password = password;  
    }  
      
    public String getPassword() {  
        return this.password;  
    }  
    
    public void setUserNickName(String userNickName) {  
        this.userNickName = userNickName;  
    }  
      
    public String getUserNickName() {  
        return this.userNickName;  
    }  
    
    public void setSex(Integer sex) {  
        this.sex = sex;  
    }  
      
    public Integer getSex() {  
        return this.sex;  
    }  
    
    public void setMobile(String mobile) {  
        this.mobile = mobile;  
    }  
      
    public String getMobile() {  
        return this.mobile;  
    }  
    
    public void setIsActive(Integer isActive) {  
        this.isActive = isActive;  
    }  
      
    public Integer getIsActive() {  
        return this.isActive;  
    }  
    
    public void setToken(String token) {  
        this.token = token;  
    }  
      
    public String getToken() {  
        return this.token;  
    }  
    
    public void setCreateTime(Date createTime) {  
        this.createTime = createTime;  
    }  
      
    public Date getCreateTime() {  
        return this.createTime;  
    }  
    
    public void setUpdateTime(Date updateTime) {  
        this.updateTime = updateTime;  
    }  
      
    public Date getUpdateTime() {  
        return this.updateTime;  
    }  
	
	

}
