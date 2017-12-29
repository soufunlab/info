package com.ratel.info.api.model;

import com.ratel.common.model.annotation.*;

import java.io.Serializable;

/*
 * Description:
 * All Rights Reserved.
 * @version 1.0 2017/12/23 10:50  by  李浩（lihao@cloud-young.com）创建
 */

public class City implements Serializable {


	//alias
	@UpdateRequiredAnno
	private Integer id;  
	/**
	*
	*/
	@InsertRequiredAnno
	private String name;  
	/**
	*
	*/
	@InsertRequiredAnno
	private String countryCode;  
	/**
	*
	*/
	@InsertRequiredAnno
	private String district;  
	/**
	*
	*/
	@InsertRequiredAnno
	private Integer population;  
	

    
    public void setId(Integer id) {  
        this.id = id;  
    }  
      
    public Integer getId() {  
        return this.id;  
    }  
    
    public void setName(String name) {  
        this.name = name;  
    }  
      
    public String getName() {  
        return this.name;  
    }  
    
    public void setCountryCode(String countryCode) {  
        this.countryCode = countryCode;  
    }  
      
    public String getCountryCode() {  
        return this.countryCode;  
    }  
    
    public void setDistrict(String district) {  
        this.district = district;  
    }  
      
    public String getDistrict() {  
        return this.district;  
    }  
    
    public void setPopulation(Integer population) {  
        this.population = population;  
    }  
      
    public Integer getPopulation() {  
        return this.population;  
    }  
	
	

}
