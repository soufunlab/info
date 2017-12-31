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
 * @version 1.0 2017/12/31 06:02  by  李浩（lihao@cloud-young.com）创建
 */

public class Country implements Serializable {


	//alias
	@UpdateRequiredAnno
	private String code;  
	/**
	*
	*/
	@InsertRequiredAnno
	private String name;  
	/**
	*
	*/
	@InsertRequiredAnno
	private String continent;  
	/**
	*
	*/
	@InsertRequiredAnno
	private String region;  
	/**
	*
	*/
	@InsertRequiredAnno
	private Float surfaceArea;  
	/**
	*
	*/
	@InsertRequiredAnno
	private Integer indepYear;  
	/**
	*
	*/
	@InsertRequiredAnno
	private Integer population;  
	/**
	*
	*/
	@InsertRequiredAnno
	private Float lifeExpectancy;  
	/**
	*
	*/
	@InsertRequiredAnno
	private Float gnp;  
	/**
	*
	*/
	@InsertRequiredAnno
	private Float gnpold;  
	/**
	*
	*/
	@InsertRequiredAnno
	private String localName;  
	/**
	*
	*/
	@InsertRequiredAnno
	private String governmentForm;  
	/**
	*
	*/
	@InsertRequiredAnno
	private String headOfState;  
	/**
	*
	*/
	@InsertRequiredAnno
	private Integer capital;  
	/**
	*
	*/
	@InsertRequiredAnno
	private String code2;  
	

    
    public void setCode(String code) {  
        this.code = code;  
    }  
      
    public String getCode() {  
        return this.code;  
    }  
    
    public void setName(String name) {  
        this.name = name;  
    }  
      
    public String getName() {  
        return this.name;  
    }  
    
    public void setContinent(String continent) {  
        this.continent = continent;  
    }  
      
    public String getContinent() {  
        return this.continent;  
    }  
    
    public void setRegion(String region) {  
        this.region = region;  
    }  
      
    public String getRegion() {  
        return this.region;  
    }  
    
    public void setSurfaceArea(Float surfaceArea) {  
        this.surfaceArea = surfaceArea;  
    }  
      
    public Float getSurfaceArea() {  
        return this.surfaceArea;  
    }  
    
    public void setIndepYear(Integer indepYear) {  
        this.indepYear = indepYear;  
    }  
      
    public Integer getIndepYear() {  
        return this.indepYear;  
    }  
    
    public void setPopulation(Integer population) {  
        this.population = population;  
    }  
      
    public Integer getPopulation() {  
        return this.population;  
    }  
    
    public void setLifeExpectancy(Float lifeExpectancy) {  
        this.lifeExpectancy = lifeExpectancy;  
    }  
      
    public Float getLifeExpectancy() {  
        return this.lifeExpectancy;  
    }  
    
    public void setGnp(Float gnp) {  
        this.gnp = gnp;  
    }  
      
    public Float getGnp() {  
        return this.gnp;  
    }  
    
    public void setGnpold(Float gnpold) {  
        this.gnpold = gnpold;  
    }  
      
    public Float getGnpold() {  
        return this.gnpold;  
    }  
    
    public void setLocalName(String localName) {  
        this.localName = localName;  
    }  
      
    public String getLocalName() {  
        return this.localName;  
    }  
    
    public void setGovernmentForm(String governmentForm) {  
        this.governmentForm = governmentForm;  
    }  
      
    public String getGovernmentForm() {  
        return this.governmentForm;  
    }  
    
    public void setHeadOfState(String headOfState) {  
        this.headOfState = headOfState;  
    }  
      
    public String getHeadOfState() {  
        return this.headOfState;  
    }  
    
    public void setCapital(Integer capital) {  
        this.capital = capital;  
    }  
      
    public Integer getCapital() {  
        return this.capital;  
    }  
    
    public void setCode2(String code2) {  
        this.code2 = code2;  
    }  
      
    public String getCode2() {  
        return this.code2;  
    }  
	
	

}
