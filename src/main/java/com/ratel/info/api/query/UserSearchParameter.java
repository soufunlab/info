package com.ratel.info.api.query;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.io.Serializable;

/*
 * Description:
 * All Rights Reserved.
 * @version 1.0 2018/01/03 04:20  by  李浩（lihao@cloud-young.com）创建
 */

public class UserSearchParameter implements Serializable {

	//alias
	private Integer id;  
	/**
	*
	*/
	private String account;  
	/**
	*
	*/
	private String password;  
	/**
	*
	*/
	private String userNickName;  
	/**
	*
	*/
	private Integer sex;  
	/**
	*
	*/
	private String mobile;  
	/**
	*
	*/
	private Integer isActive;  
	/**
	*cookie票据
	*/
	private String token;  
	/**
	*
	*/
	private Date createTime;  
	/**
	*
	*/
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
	

	//排序集合
	List<String> orderList = new ArrayList<String>();
	public String getOrderByClause(){
		if(orderList.size()>0){
			return String.join(",",orderList);
		}
		return null;
    }
	//alias
   
	public void andOrderByIdASC(){
		orderList.add("user.id ASC");
	}
	public void andOrderByIdDESC(){
		orderList.add("user.id DESC");
	}
   
	public void andOrderByAccountASC(){
		orderList.add("user.account ASC");
	}
	public void andOrderByAccountDESC(){
		orderList.add("user.account DESC");
	}
   
	public void andOrderByPasswordASC(){
		orderList.add("user.password ASC");
	}
	public void andOrderByPasswordDESC(){
		orderList.add("user.password DESC");
	}
   
	public void andOrderByUserNickNameASC(){
		orderList.add("user.user_nick_name ASC");
	}
	public void andOrderByUserNickNameDESC(){
		orderList.add("user.user_nick_name DESC");
	}
   
	public void andOrderBySexASC(){
		orderList.add("user.sex ASC");
	}
	public void andOrderBySexDESC(){
		orderList.add("user.sex DESC");
	}
   
	public void andOrderByMobileASC(){
		orderList.add("user.mobile ASC");
	}
	public void andOrderByMobileDESC(){
		orderList.add("user.mobile DESC");
	}
   
	public void andOrderByIsActiveASC(){
		orderList.add("user.is_active ASC");
	}
	public void andOrderByIsActiveDESC(){
		orderList.add("user.is_active DESC");
	}
   
	public void andOrderByTokenASC(){
		orderList.add("user.token ASC");
	}
	public void andOrderByTokenDESC(){
		orderList.add("user.token DESC");
	}
   
	public void andOrderByCreateTimeASC(){
		orderList.add("user.create_time ASC");
	}
	public void andOrderByCreateTimeDESC(){
		orderList.add("user.create_time DESC");
	}
   
	public void andOrderByUpdateTimeASC(){
		orderList.add("user.update_time ASC");
	}
	public void andOrderByUpdateTimeDESC(){
		orderList.add("user.update_time DESC");
	}
}
