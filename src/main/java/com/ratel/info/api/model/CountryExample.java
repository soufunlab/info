package com.ratel.info.api.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.ratel.common.model.base.BaseModel;

/*
 * Description:
 * All Rights Reserved.
 * @version 1.0 2017/12/31 06:02  by  李浩（lihao@cloud-young.com）创建
 */

public class CountryExample extends BaseModel {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CountryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria implements java.io.Serializable {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

       
		
		
			//alias
	
		public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "Code");
            return (Criteria) this;
        }
		

		public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "Code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "Code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "Code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "Code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "Code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "Code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "Code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "Code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "Code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "Code");
            return (Criteria) this;
        } 
	
		public Criteria andNameLike(String value) {
            addCriterion("name like", value, "Name");
            return (Criteria) this;
        }
		

		public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "Name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "Name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "Name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "Name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "Name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "Name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "Name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "Name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "Name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "Name");
            return (Criteria) this;
        } 
	
		public Criteria andContinentLike(String value) {
            addCriterion("continent like", value, "Continent");
            return (Criteria) this;
        }
		

		public Criteria andContinentIsNull() {
            addCriterion("continent is null");
            return (Criteria) this;
        }

        public Criteria andContinentIsNotNull() {
            addCriterion("continent is not null");
            return (Criteria) this;
        }

        public Criteria andContinentEqualTo(String value) {
            addCriterion("continent =", value, "Continent");
            return (Criteria) this;
        }

        public Criteria andContinentNotEqualTo(String value) {
            addCriterion("continent <>", value, "Continent");
            return (Criteria) this;
        }

        public Criteria andContinentGreaterThan(String value) {
            addCriterion("continent >", value, "Continent");
            return (Criteria) this;
        }

        public Criteria andContinentGreaterThanOrEqualTo(String value) {
            addCriterion("continent >=", value, "Continent");
            return (Criteria) this;
        }

        public Criteria andContinentLessThan(String value) {
            addCriterion("continent <", value, "Continent");
            return (Criteria) this;
        }

        public Criteria andContinentLessThanOrEqualTo(String value) {
            addCriterion("continent <=", value, "Continent");
            return (Criteria) this;
        }

        public Criteria andContinentIn(List<String> values) {
            addCriterion("continent in", values, "Continent");
            return (Criteria) this;
        }

        public Criteria andContinentNotIn(List<String> values) {
            addCriterion("continent not in", values, "Continent");
            return (Criteria) this;
        }

        public Criteria andContinentBetween(String value1, String value2) {
            addCriterion("continent between", value1, value2, "Continent");
            return (Criteria) this;
        }

        public Criteria andContinentNotBetween(String value1, String value2) {
            addCriterion("continent not between", value1, value2, "Continent");
            return (Criteria) this;
        } 
	
		public Criteria andRegionLike(String value) {
            addCriterion("region like", value, "Region");
            return (Criteria) this;
        }
		

		public Criteria andRegionIsNull() {
            addCriterion("region is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("region is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("region =", value, "Region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("region <>", value, "Region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("region >", value, "Region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("region >=", value, "Region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("region <", value, "Region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("region <=", value, "Region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("region in", values, "Region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("region not in", values, "Region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("region between", value1, value2, "Region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("region not between", value1, value2, "Region");
            return (Criteria) this;
        } 
	
		public Criteria andSurfaceAreaLike(Float value) {
            addCriterion("surfacearea like", value, "SurfaceArea");
            return (Criteria) this;
        }
		

		public Criteria andSurfaceAreaIsNull() {
            addCriterion("surfacearea is null");
            return (Criteria) this;
        }

        public Criteria andSurfaceAreaIsNotNull() {
            addCriterion("surfacearea is not null");
            return (Criteria) this;
        }

        public Criteria andSurfaceAreaEqualTo(Float value) {
            addCriterion("surfacearea =", value, "SurfaceArea");
            return (Criteria) this;
        }

        public Criteria andSurfaceAreaNotEqualTo(Float value) {
            addCriterion("surfacearea <>", value, "SurfaceArea");
            return (Criteria) this;
        }

        public Criteria andSurfaceAreaGreaterThan(Float value) {
            addCriterion("surfacearea >", value, "SurfaceArea");
            return (Criteria) this;
        }

        public Criteria andSurfaceAreaGreaterThanOrEqualTo(Float value) {
            addCriterion("surfacearea >=", value, "SurfaceArea");
            return (Criteria) this;
        }

        public Criteria andSurfaceAreaLessThan(Float value) {
            addCriterion("surfacearea <", value, "SurfaceArea");
            return (Criteria) this;
        }

        public Criteria andSurfaceAreaLessThanOrEqualTo(Float value) {
            addCriterion("surfacearea <=", value, "SurfaceArea");
            return (Criteria) this;
        }

        public Criteria andSurfaceAreaIn(List<Float> values) {
            addCriterion("surfacearea in", values, "SurfaceArea");
            return (Criteria) this;
        }

        public Criteria andSurfaceAreaNotIn(List<Float> values) {
            addCriterion("surfacearea not in", values, "SurfaceArea");
            return (Criteria) this;
        }

        public Criteria andSurfaceAreaBetween(Float value1, Float value2) {
            addCriterion("surfacearea between", value1, value2, "SurfaceArea");
            return (Criteria) this;
        }

        public Criteria andSurfaceAreaNotBetween(Float value1, Float value2) {
            addCriterion("surfacearea not between", value1, value2, "SurfaceArea");
            return (Criteria) this;
        } 
	
		public Criteria andIndepYearLike(Integer value) {
            addCriterion("indepyear like", value, "IndepYear");
            return (Criteria) this;
        }
		

		public Criteria andIndepYearIsNull() {
            addCriterion("indepyear is null");
            return (Criteria) this;
        }

        public Criteria andIndepYearIsNotNull() {
            addCriterion("indepyear is not null");
            return (Criteria) this;
        }

        public Criteria andIndepYearEqualTo(Integer value) {
            addCriterion("indepyear =", value, "IndepYear");
            return (Criteria) this;
        }

        public Criteria andIndepYearNotEqualTo(Integer value) {
            addCriterion("indepyear <>", value, "IndepYear");
            return (Criteria) this;
        }

        public Criteria andIndepYearGreaterThan(Integer value) {
            addCriterion("indepyear >", value, "IndepYear");
            return (Criteria) this;
        }

        public Criteria andIndepYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("indepyear >=", value, "IndepYear");
            return (Criteria) this;
        }

        public Criteria andIndepYearLessThan(Integer value) {
            addCriterion("indepyear <", value, "IndepYear");
            return (Criteria) this;
        }

        public Criteria andIndepYearLessThanOrEqualTo(Integer value) {
            addCriterion("indepyear <=", value, "IndepYear");
            return (Criteria) this;
        }

        public Criteria andIndepYearIn(List<Integer> values) {
            addCriterion("indepyear in", values, "IndepYear");
            return (Criteria) this;
        }

        public Criteria andIndepYearNotIn(List<Integer> values) {
            addCriterion("indepyear not in", values, "IndepYear");
            return (Criteria) this;
        }

        public Criteria andIndepYearBetween(Integer value1, Integer value2) {
            addCriterion("indepyear between", value1, value2, "IndepYear");
            return (Criteria) this;
        }

        public Criteria andIndepYearNotBetween(Integer value1, Integer value2) {
            addCriterion("indepyear not between", value1, value2, "IndepYear");
            return (Criteria) this;
        } 
	
		public Criteria andPopulationLike(Integer value) {
            addCriterion("population like", value, "Population");
            return (Criteria) this;
        }
		

		public Criteria andPopulationIsNull() {
            addCriterion("population is null");
            return (Criteria) this;
        }

        public Criteria andPopulationIsNotNull() {
            addCriterion("population is not null");
            return (Criteria) this;
        }

        public Criteria andPopulationEqualTo(Integer value) {
            addCriterion("population =", value, "Population");
            return (Criteria) this;
        }

        public Criteria andPopulationNotEqualTo(Integer value) {
            addCriterion("population <>", value, "Population");
            return (Criteria) this;
        }

        public Criteria andPopulationGreaterThan(Integer value) {
            addCriterion("population >", value, "Population");
            return (Criteria) this;
        }

        public Criteria andPopulationGreaterThanOrEqualTo(Integer value) {
            addCriterion("population >=", value, "Population");
            return (Criteria) this;
        }

        public Criteria andPopulationLessThan(Integer value) {
            addCriterion("population <", value, "Population");
            return (Criteria) this;
        }

        public Criteria andPopulationLessThanOrEqualTo(Integer value) {
            addCriterion("population <=", value, "Population");
            return (Criteria) this;
        }

        public Criteria andPopulationIn(List<Integer> values) {
            addCriterion("population in", values, "Population");
            return (Criteria) this;
        }

        public Criteria andPopulationNotIn(List<Integer> values) {
            addCriterion("population not in", values, "Population");
            return (Criteria) this;
        }

        public Criteria andPopulationBetween(Integer value1, Integer value2) {
            addCriterion("population between", value1, value2, "Population");
            return (Criteria) this;
        }

        public Criteria andPopulationNotBetween(Integer value1, Integer value2) {
            addCriterion("population not between", value1, value2, "Population");
            return (Criteria) this;
        } 
	
		public Criteria andLifeExpectancyLike(Float value) {
            addCriterion("lifeexpectancy like", value, "LifeExpectancy");
            return (Criteria) this;
        }
		

		public Criteria andLifeExpectancyIsNull() {
            addCriterion("lifeexpectancy is null");
            return (Criteria) this;
        }

        public Criteria andLifeExpectancyIsNotNull() {
            addCriterion("lifeexpectancy is not null");
            return (Criteria) this;
        }

        public Criteria andLifeExpectancyEqualTo(Float value) {
            addCriterion("lifeexpectancy =", value, "LifeExpectancy");
            return (Criteria) this;
        }

        public Criteria andLifeExpectancyNotEqualTo(Float value) {
            addCriterion("lifeexpectancy <>", value, "LifeExpectancy");
            return (Criteria) this;
        }

        public Criteria andLifeExpectancyGreaterThan(Float value) {
            addCriterion("lifeexpectancy >", value, "LifeExpectancy");
            return (Criteria) this;
        }

        public Criteria andLifeExpectancyGreaterThanOrEqualTo(Float value) {
            addCriterion("lifeexpectancy >=", value, "LifeExpectancy");
            return (Criteria) this;
        }

        public Criteria andLifeExpectancyLessThan(Float value) {
            addCriterion("lifeexpectancy <", value, "LifeExpectancy");
            return (Criteria) this;
        }

        public Criteria andLifeExpectancyLessThanOrEqualTo(Float value) {
            addCriterion("lifeexpectancy <=", value, "LifeExpectancy");
            return (Criteria) this;
        }

        public Criteria andLifeExpectancyIn(List<Float> values) {
            addCriterion("lifeexpectancy in", values, "LifeExpectancy");
            return (Criteria) this;
        }

        public Criteria andLifeExpectancyNotIn(List<Float> values) {
            addCriterion("lifeexpectancy not in", values, "LifeExpectancy");
            return (Criteria) this;
        }

        public Criteria andLifeExpectancyBetween(Float value1, Float value2) {
            addCriterion("lifeexpectancy between", value1, value2, "LifeExpectancy");
            return (Criteria) this;
        }

        public Criteria andLifeExpectancyNotBetween(Float value1, Float value2) {
            addCriterion("lifeexpectancy not between", value1, value2, "LifeExpectancy");
            return (Criteria) this;
        } 
	
		public Criteria andGnpLike(Float value) {
            addCriterion("gnp like", value, "Gnp");
            return (Criteria) this;
        }
		

		public Criteria andGnpIsNull() {
            addCriterion("gnp is null");
            return (Criteria) this;
        }

        public Criteria andGnpIsNotNull() {
            addCriterion("gnp is not null");
            return (Criteria) this;
        }

        public Criteria andGnpEqualTo(Float value) {
            addCriterion("gnp =", value, "Gnp");
            return (Criteria) this;
        }

        public Criteria andGnpNotEqualTo(Float value) {
            addCriterion("gnp <>", value, "Gnp");
            return (Criteria) this;
        }

        public Criteria andGnpGreaterThan(Float value) {
            addCriterion("gnp >", value, "Gnp");
            return (Criteria) this;
        }

        public Criteria andGnpGreaterThanOrEqualTo(Float value) {
            addCriterion("gnp >=", value, "Gnp");
            return (Criteria) this;
        }

        public Criteria andGnpLessThan(Float value) {
            addCriterion("gnp <", value, "Gnp");
            return (Criteria) this;
        }

        public Criteria andGnpLessThanOrEqualTo(Float value) {
            addCriterion("gnp <=", value, "Gnp");
            return (Criteria) this;
        }

        public Criteria andGnpIn(List<Float> values) {
            addCriterion("gnp in", values, "Gnp");
            return (Criteria) this;
        }

        public Criteria andGnpNotIn(List<Float> values) {
            addCriterion("gnp not in", values, "Gnp");
            return (Criteria) this;
        }

        public Criteria andGnpBetween(Float value1, Float value2) {
            addCriterion("gnp between", value1, value2, "Gnp");
            return (Criteria) this;
        }

        public Criteria andGnpNotBetween(Float value1, Float value2) {
            addCriterion("gnp not between", value1, value2, "Gnp");
            return (Criteria) this;
        } 
	
		public Criteria andGnpoldLike(Float value) {
            addCriterion("gnpold like", value, "Gnpold");
            return (Criteria) this;
        }
		

		public Criteria andGnpoldIsNull() {
            addCriterion("gnpold is null");
            return (Criteria) this;
        }

        public Criteria andGnpoldIsNotNull() {
            addCriterion("gnpold is not null");
            return (Criteria) this;
        }

        public Criteria andGnpoldEqualTo(Float value) {
            addCriterion("gnpold =", value, "Gnpold");
            return (Criteria) this;
        }

        public Criteria andGnpoldNotEqualTo(Float value) {
            addCriterion("gnpold <>", value, "Gnpold");
            return (Criteria) this;
        }

        public Criteria andGnpoldGreaterThan(Float value) {
            addCriterion("gnpold >", value, "Gnpold");
            return (Criteria) this;
        }

        public Criteria andGnpoldGreaterThanOrEqualTo(Float value) {
            addCriterion("gnpold >=", value, "Gnpold");
            return (Criteria) this;
        }

        public Criteria andGnpoldLessThan(Float value) {
            addCriterion("gnpold <", value, "Gnpold");
            return (Criteria) this;
        }

        public Criteria andGnpoldLessThanOrEqualTo(Float value) {
            addCriterion("gnpold <=", value, "Gnpold");
            return (Criteria) this;
        }

        public Criteria andGnpoldIn(List<Float> values) {
            addCriterion("gnpold in", values, "Gnpold");
            return (Criteria) this;
        }

        public Criteria andGnpoldNotIn(List<Float> values) {
            addCriterion("gnpold not in", values, "Gnpold");
            return (Criteria) this;
        }

        public Criteria andGnpoldBetween(Float value1, Float value2) {
            addCriterion("gnpold between", value1, value2, "Gnpold");
            return (Criteria) this;
        }

        public Criteria andGnpoldNotBetween(Float value1, Float value2) {
            addCriterion("gnpold not between", value1, value2, "Gnpold");
            return (Criteria) this;
        } 
	
		public Criteria andLocalNameLike(String value) {
            addCriterion("localname like", value, "LocalName");
            return (Criteria) this;
        }
		

		public Criteria andLocalNameIsNull() {
            addCriterion("localname is null");
            return (Criteria) this;
        }

        public Criteria andLocalNameIsNotNull() {
            addCriterion("localname is not null");
            return (Criteria) this;
        }

        public Criteria andLocalNameEqualTo(String value) {
            addCriterion("localname =", value, "LocalName");
            return (Criteria) this;
        }

        public Criteria andLocalNameNotEqualTo(String value) {
            addCriterion("localname <>", value, "LocalName");
            return (Criteria) this;
        }

        public Criteria andLocalNameGreaterThan(String value) {
            addCriterion("localname >", value, "LocalName");
            return (Criteria) this;
        }

        public Criteria andLocalNameGreaterThanOrEqualTo(String value) {
            addCriterion("localname >=", value, "LocalName");
            return (Criteria) this;
        }

        public Criteria andLocalNameLessThan(String value) {
            addCriterion("localname <", value, "LocalName");
            return (Criteria) this;
        }

        public Criteria andLocalNameLessThanOrEqualTo(String value) {
            addCriterion("localname <=", value, "LocalName");
            return (Criteria) this;
        }

        public Criteria andLocalNameIn(List<String> values) {
            addCriterion("localname in", values, "LocalName");
            return (Criteria) this;
        }

        public Criteria andLocalNameNotIn(List<String> values) {
            addCriterion("localname not in", values, "LocalName");
            return (Criteria) this;
        }

        public Criteria andLocalNameBetween(String value1, String value2) {
            addCriterion("localname between", value1, value2, "LocalName");
            return (Criteria) this;
        }

        public Criteria andLocalNameNotBetween(String value1, String value2) {
            addCriterion("localname not between", value1, value2, "LocalName");
            return (Criteria) this;
        } 
	
		public Criteria andGovernmentFormLike(String value) {
            addCriterion("governmentform like", value, "GovernmentForm");
            return (Criteria) this;
        }
		

		public Criteria andGovernmentFormIsNull() {
            addCriterion("governmentform is null");
            return (Criteria) this;
        }

        public Criteria andGovernmentFormIsNotNull() {
            addCriterion("governmentform is not null");
            return (Criteria) this;
        }

        public Criteria andGovernmentFormEqualTo(String value) {
            addCriterion("governmentform =", value, "GovernmentForm");
            return (Criteria) this;
        }

        public Criteria andGovernmentFormNotEqualTo(String value) {
            addCriterion("governmentform <>", value, "GovernmentForm");
            return (Criteria) this;
        }

        public Criteria andGovernmentFormGreaterThan(String value) {
            addCriterion("governmentform >", value, "GovernmentForm");
            return (Criteria) this;
        }

        public Criteria andGovernmentFormGreaterThanOrEqualTo(String value) {
            addCriterion("governmentform >=", value, "GovernmentForm");
            return (Criteria) this;
        }

        public Criteria andGovernmentFormLessThan(String value) {
            addCriterion("governmentform <", value, "GovernmentForm");
            return (Criteria) this;
        }

        public Criteria andGovernmentFormLessThanOrEqualTo(String value) {
            addCriterion("governmentform <=", value, "GovernmentForm");
            return (Criteria) this;
        }

        public Criteria andGovernmentFormIn(List<String> values) {
            addCriterion("governmentform in", values, "GovernmentForm");
            return (Criteria) this;
        }

        public Criteria andGovernmentFormNotIn(List<String> values) {
            addCriterion("governmentform not in", values, "GovernmentForm");
            return (Criteria) this;
        }

        public Criteria andGovernmentFormBetween(String value1, String value2) {
            addCriterion("governmentform between", value1, value2, "GovernmentForm");
            return (Criteria) this;
        }

        public Criteria andGovernmentFormNotBetween(String value1, String value2) {
            addCriterion("governmentform not between", value1, value2, "GovernmentForm");
            return (Criteria) this;
        } 
	
		public Criteria andHeadOfStateLike(String value) {
            addCriterion("headofstate like", value, "HeadOfState");
            return (Criteria) this;
        }
		

		public Criteria andHeadOfStateIsNull() {
            addCriterion("headofstate is null");
            return (Criteria) this;
        }

        public Criteria andHeadOfStateIsNotNull() {
            addCriterion("headofstate is not null");
            return (Criteria) this;
        }

        public Criteria andHeadOfStateEqualTo(String value) {
            addCriterion("headofstate =", value, "HeadOfState");
            return (Criteria) this;
        }

        public Criteria andHeadOfStateNotEqualTo(String value) {
            addCriterion("headofstate <>", value, "HeadOfState");
            return (Criteria) this;
        }

        public Criteria andHeadOfStateGreaterThan(String value) {
            addCriterion("headofstate >", value, "HeadOfState");
            return (Criteria) this;
        }

        public Criteria andHeadOfStateGreaterThanOrEqualTo(String value) {
            addCriterion("headofstate >=", value, "HeadOfState");
            return (Criteria) this;
        }

        public Criteria andHeadOfStateLessThan(String value) {
            addCriterion("headofstate <", value, "HeadOfState");
            return (Criteria) this;
        }

        public Criteria andHeadOfStateLessThanOrEqualTo(String value) {
            addCriterion("headofstate <=", value, "HeadOfState");
            return (Criteria) this;
        }

        public Criteria andHeadOfStateIn(List<String> values) {
            addCriterion("headofstate in", values, "HeadOfState");
            return (Criteria) this;
        }

        public Criteria andHeadOfStateNotIn(List<String> values) {
            addCriterion("headofstate not in", values, "HeadOfState");
            return (Criteria) this;
        }

        public Criteria andHeadOfStateBetween(String value1, String value2) {
            addCriterion("headofstate between", value1, value2, "HeadOfState");
            return (Criteria) this;
        }

        public Criteria andHeadOfStateNotBetween(String value1, String value2) {
            addCriterion("headofstate not between", value1, value2, "HeadOfState");
            return (Criteria) this;
        } 
	
		public Criteria andCapitalLike(Integer value) {
            addCriterion("capital like", value, "Capital");
            return (Criteria) this;
        }
		

		public Criteria andCapitalIsNull() {
            addCriterion("capital is null");
            return (Criteria) this;
        }

        public Criteria andCapitalIsNotNull() {
            addCriterion("capital is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalEqualTo(Integer value) {
            addCriterion("capital =", value, "Capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotEqualTo(Integer value) {
            addCriterion("capital <>", value, "Capital");
            return (Criteria) this;
        }

        public Criteria andCapitalGreaterThan(Integer value) {
            addCriterion("capital >", value, "Capital");
            return (Criteria) this;
        }

        public Criteria andCapitalGreaterThanOrEqualTo(Integer value) {
            addCriterion("capital >=", value, "Capital");
            return (Criteria) this;
        }

        public Criteria andCapitalLessThan(Integer value) {
            addCriterion("capital <", value, "Capital");
            return (Criteria) this;
        }

        public Criteria andCapitalLessThanOrEqualTo(Integer value) {
            addCriterion("capital <=", value, "Capital");
            return (Criteria) this;
        }

        public Criteria andCapitalIn(List<Integer> values) {
            addCriterion("capital in", values, "Capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotIn(List<Integer> values) {
            addCriterion("capital not in", values, "Capital");
            return (Criteria) this;
        }

        public Criteria andCapitalBetween(Integer value1, Integer value2) {
            addCriterion("capital between", value1, value2, "Capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotBetween(Integer value1, Integer value2) {
            addCriterion("capital not between", value1, value2, "Capital");
            return (Criteria) this;
        } 
	
		public Criteria andCode2Like(String value) {
            addCriterion("code2 like", value, "Code2");
            return (Criteria) this;
        }
		

		public Criteria andCode2IsNull() {
            addCriterion("code2 is null");
            return (Criteria) this;
        }

        public Criteria andCode2IsNotNull() {
            addCriterion("code2 is not null");
            return (Criteria) this;
        }

        public Criteria andCode2EqualTo(String value) {
            addCriterion("code2 =", value, "Code2");
            return (Criteria) this;
        }

        public Criteria andCode2NotEqualTo(String value) {
            addCriterion("code2 <>", value, "Code2");
            return (Criteria) this;
        }

        public Criteria andCode2GreaterThan(String value) {
            addCriterion("code2 >", value, "Code2");
            return (Criteria) this;
        }

        public Criteria andCode2GreaterThanOrEqualTo(String value) {
            addCriterion("code2 >=", value, "Code2");
            return (Criteria) this;
        }

        public Criteria andCode2LessThan(String value) {
            addCriterion("code2 <", value, "Code2");
            return (Criteria) this;
        }

        public Criteria andCode2LessThanOrEqualTo(String value) {
            addCriterion("code2 <=", value, "Code2");
            return (Criteria) this;
        }

        public Criteria andCode2In(List<String> values) {
            addCriterion("code2 in", values, "Code2");
            return (Criteria) this;
        }

        public Criteria andCode2NotIn(List<String> values) {
            addCriterion("code2 not in", values, "Code2");
            return (Criteria) this;
        }

        public Criteria andCode2Between(String value1, String value2) {
            addCriterion("code2 between", value1, value2, "Code2");
            return (Criteria) this;
        }

        public Criteria andCode2NotBetween(String value1, String value2) {
            addCriterion("code2 not between", value1, value2, "Code2");
            return (Criteria) this;
        } 
		
       
    }

    public static class Criteria extends GeneratedCriteria implements java.io.Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements java.io.Serializable {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}