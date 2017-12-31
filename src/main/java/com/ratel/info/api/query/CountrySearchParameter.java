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
 * @version 1.0 2017/12/31 06:02  by  李浩（lihao@cloud-young.com）创建
 */

public class CountrySearchParameter implements Serializable {

	//alias
	private String code;  
	/**
	*
	*/
	private String name;  
	/**
	*
	*/
	private String continent;  
	/**
	*
	*/
	private String region;  
	/**
	*
	*/
	private Float surfaceArea;  
	/**
	*
	*/
	private Integer indepYear;  
	/**
	*
	*/
	private Integer population;  
	/**
	*
	*/
	private Float lifeExpectancy;  
	/**
	*
	*/
	private Float gnp;  
	/**
	*
	*/
	private Float gnpold;  
	/**
	*
	*/
	private String localName;  
	/**
	*
	*/
	private String governmentForm;  
	/**
	*
	*/
	private String headOfState;  
	/**
	*
	*/
	private Integer capital;  
	/**
	*
	*/
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
	

	//排序集合
	List<String> orderList = new ArrayList<String>();
	public String getOrderByClause(){
		if(orderList.size()>0){
			return String.join(",",orderList);
		}
		return null;
    }
	//alias
   
	public void andOrderByCodeASC(){
		orderList.add("country.Code ASC");
	}
	public void andOrderByCodeDESC(){
		orderList.add("country.Code DESC");
	}
   
	public void andOrderByNameASC(){
		orderList.add("country.Name ASC");
	}
	public void andOrderByNameDESC(){
		orderList.add("country.Name DESC");
	}
   
	public void andOrderByContinentASC(){
		orderList.add("country.Continent ASC");
	}
	public void andOrderByContinentDESC(){
		orderList.add("country.Continent DESC");
	}
   
	public void andOrderByRegionASC(){
		orderList.add("country.Region ASC");
	}
	public void andOrderByRegionDESC(){
		orderList.add("country.Region DESC");
	}
   
	public void andOrderBySurfaceAreaASC(){
		orderList.add("country.SurfaceArea ASC");
	}
	public void andOrderBySurfaceAreaDESC(){
		orderList.add("country.SurfaceArea DESC");
	}
   
	public void andOrderByIndepYearASC(){
		orderList.add("country.IndepYear ASC");
	}
	public void andOrderByIndepYearDESC(){
		orderList.add("country.IndepYear DESC");
	}
   
	public void andOrderByPopulationASC(){
		orderList.add("country.Population ASC");
	}
	public void andOrderByPopulationDESC(){
		orderList.add("country.Population DESC");
	}
   
	public void andOrderByLifeExpectancyASC(){
		orderList.add("country.LifeExpectancy ASC");
	}
	public void andOrderByLifeExpectancyDESC(){
		orderList.add("country.LifeExpectancy DESC");
	}
   
	public void andOrderByGnpASC(){
		orderList.add("country.GNP ASC");
	}
	public void andOrderByGnpDESC(){
		orderList.add("country.GNP DESC");
	}
   
	public void andOrderByGnpoldASC(){
		orderList.add("country.GNPOld ASC");
	}
	public void andOrderByGnpoldDESC(){
		orderList.add("country.GNPOld DESC");
	}
   
	public void andOrderByLocalNameASC(){
		orderList.add("country.LocalName ASC");
	}
	public void andOrderByLocalNameDESC(){
		orderList.add("country.LocalName DESC");
	}
   
	public void andOrderByGovernmentFormASC(){
		orderList.add("country.GovernmentForm ASC");
	}
	public void andOrderByGovernmentFormDESC(){
		orderList.add("country.GovernmentForm DESC");
	}
   
	public void andOrderByHeadOfStateASC(){
		orderList.add("country.HeadOfState ASC");
	}
	public void andOrderByHeadOfStateDESC(){
		orderList.add("country.HeadOfState DESC");
	}
   
	public void andOrderByCapitalASC(){
		orderList.add("country.Capital ASC");
	}
	public void andOrderByCapitalDESC(){
		orderList.add("country.Capital DESC");
	}
   
	public void andOrderByCode2ASC(){
		orderList.add("country.Code2 ASC");
	}
	public void andOrderByCode2DESC(){
		orderList.add("country.Code2 DESC");
	}
}
