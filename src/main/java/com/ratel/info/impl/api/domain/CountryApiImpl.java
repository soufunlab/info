package com.ratel.info.impl.api.domain;

import com.ratel.info.api.domain.*;
import com.ratel.info.impl.api.service.*;
import org.springframework.stereotype.Service;
import com.ratel.info.impl.api.utils.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.ratel.info.impl.api.service.*;
import com.ratel.info.api.model.*;
import com.ratel.common.model.base.Result;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import com.ratel.info.api.constants.*;
import com.ratel.info.api.query.*;
import com.ratel.common.model.page.Pagination;
import com.ratel.common.model.MoChecker;
import com.ratel.common.utils.ExceptionUtils;

/*
 * Description:
 * All Rights Reserved.
 * @version 1.0 2017/12/31 06:11  by  李浩（lihao@cloud-young.com）创建
 */

@Service("countryApi")
public class CountryApiImpl implements CountryApi {
	
	private static LogUtil logger = LogUtil.build(CountryApiImpl.class);
	
	@Autowired
    private CountryService service;
	
	@Override
	public Result<Country> getCountryById(java.lang.String id, String sessionId){
		try {
            if (id == null) {
				return new Result(ErroType.PARAMETER_ERROR.value(),ErroType.PARAMETER_ERROR.message());
            }

            Country result = service.selectByPrimaryKey(id);
            if (result != null) {
                return new Result<Country>(result);
            }
            return new Result(ErroType.BUSINESS_ERROR.value(), ErroType.BUSINESS_ERROR.message());
        } catch (Exception ex) {
            logger.error("getCountry", ex);
            return new Result(ErroType.INNER_ERROR.value(), ErroType.INNER_ERROR.message() + ":" + ExceptionUtils.errInfo(ex));
        }
	}
	
	@Override
	public Result<Country> addCountry(Country entity, String sessionId){
		
        try {
            String cs = MoChecker.checkInsert(entity);
            if (StringUtils.isNotEmpty(cs)) {
                return new Result(ErroType.PARAMETER_ERROR.value(), cs + ErroType.PARAMETER_ERROR.message() + ":" + cs);
            }

            int count = service.insertSelective(entity);
            if (count > 0) {
                return new Result<Country>(entity);
            }
            return new Result(ErroType.BUSINESS_ERROR.value(), ErroType.BUSINESS_ERROR.message());
        } catch (Exception ex) {
            logger.error("addCountry", ex);
            return new Result(ErroType.INNER_ERROR.value(), ErroType.INNER_ERROR.message() + ":" + ExceptionUtils.errInfo(ex));
        }
    }
	
	@Override
	public Result<Boolean> delCountryById(java.lang.String id, String sessionId) {
        try {
            if (id == null) {
                return new Result(ErroType.PARAMETER_ERROR.value(),ErroType.PARAMETER_ERROR.message());
            }
			
			Country entity = service.selectByPrimaryKey(id);
			if (entity != null) {
				//entity.setIsActive(0);
				int count = service.updateByPrimaryKeySelective(entity);
				if (count > 0) {
					return new Result<Boolean>(true);
				}
			}
            return new Result(ErroType.BUSINESS_ERROR.value(), ErroType.BUSINESS_ERROR.message());
        } catch (Exception ex) {
            logger.error("updateProductGoods", ex);
            return new Result(ErroType.INNER_ERROR.value(), ErroType.INNER_ERROR.message() + ":" + ExceptionUtils.errInfo(ex));
        }
    }
	
	@Override
	public Result<Boolean> updateCountry(Country entity, String sessionId){
		
        try {
            String cs = MoChecker.checkUpdate(entity);
            if (StringUtils.isNotEmpty(cs)) {
               return new Result(ErroType.PARAMETER_ERROR.value(), cs + ErroType.PARAMETER_ERROR.message() + ":" + cs);
            }
			
			int count = service.updateByPrimaryKeySelective(entity);
            if (count > 0) {
                return new Result(true);
            }
			
            return new Result(ErroType.BUSINESS_ERROR.value(), ErroType.BUSINESS_ERROR.message());
        } catch (Exception ex) {
            logger.error("updateCountry", ex);
            return new Result(ErroType.INNER_ERROR.value(), ErroType.INNER_ERROR.message() + ":" + ExceptionUtils.errInfo(ex));
        }
    }
	
	@Override
	public Result<List<Country>> getCountryListByCondition(CountrySearchParameter searchVo,String sessionId){
        try {
            if (searchVo == null) {
                return new Result(ErroType.PARAMETER_ERROR.value(),ErroType.PARAMETER_ERROR.message());
            }
            List<Country> list = service.getCountryListByCondition(searchVo);
            return new Result<List<Country>>(list);
        } catch (Exception ex) {
            logger.error("getCountryListByCondition", ex);
            return new Result(ErroType.INNER_ERROR.value(), ErroType.INNER_ERROR.message() + ":" + ExceptionUtils.errInfo(ex));
        }
    }
	
	@Override
	public Result<Pagination<Country>> getCountryPageListByCondition(CountrySearchParameter searchVo,Pagination page,String sessionId){
		try {
            if (searchVo == null||page == null) {
                return new Result(ErroType.PARAMETER_ERROR.value(),ErroType.PARAMETER_ERROR.message());
            }
            Pagination<Country> list = service.getCountryPageListByCondition(searchVo,page);
            return new Result<Pagination<Country>>(list);
        } catch (Exception ex) {
            logger.error("getCountryVoListByCondition", ex);
            return new Result(ErroType.INNER_ERROR.value(), ErroType.INNER_ERROR.message() + ":" + ExceptionUtils.errInfo(ex));
        }
	}
}
