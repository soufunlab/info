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
 * @version 1.0 2018/01/03 03:35  by  李浩（lihao@cloud-young.com）创建
 */

@Service("userApi")
public class UserApiImpl implements UserApi {

    private static LogUtil logger = LogUtil.build(UserApiImpl.class);

    @Autowired
    private UserService service;

    @Override
    public Result<User> getUserById(Integer id) {
        try {
            if (id == null) {
                return new Result(ErroType.PARAMETER_ERROR.value(), ErroType.PARAMETER_ERROR.message());
            }

            User result = service.selectByPrimaryKey(id);
            if (result != null) {
                return new Result<User>(result);
            }
            return new Result(ErroType.BUSINESS_ERROR.value(), ErroType.BUSINESS_ERROR.message());
        } catch (Exception ex) {
            logger.error("getUser", ex);
            return new Result(ErroType.INNER_ERROR.value(), ErroType.INNER_ERROR.message() + ":" + ExceptionUtils.errInfo(ex));
        }
    }

    @Override
    public Result<User> addUser(User entity) {

        try {
            String cs = MoChecker.checkInsert(entity);
            if (StringUtils.isNotEmpty(cs)) {
                return new Result(ErroType.PARAMETER_ERROR.value(), cs + ErroType.PARAMETER_ERROR.message() + ":" + cs);
            }

            int count = service.insertSelective(entity);
            if (count > 0) {
                return new Result<User>(entity);
            }
            return new Result(ErroType.BUSINESS_ERROR.value(), ErroType.BUSINESS_ERROR.message());
        } catch (Exception ex) {
            logger.error("addUser", ex);
            return new Result(ErroType.INNER_ERROR.value(), ErroType.INNER_ERROR.message() + ":" + ExceptionUtils.errInfo(ex));
        }
    }

    @Override
    public Result<Boolean> delUserById(Integer id) {
        try {
            if (id == null) {
                return new Result(ErroType.PARAMETER_ERROR.value(), ErroType.PARAMETER_ERROR.message());
            }

            User entity = service.selectByPrimaryKey(id);
            if (entity != null) {
                entity.setIsActive(0);
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
    public Result<Boolean> updateUser(User entity) {

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
            logger.error("updateUser", ex);
            return new Result(ErroType.INNER_ERROR.value(), ErroType.INNER_ERROR.message() + ":" + ExceptionUtils.errInfo(ex));
        }
    }

    @Override
    public Result<List<User>> getUserListByCondition(UserSearchParameter searchVo) {
        try {
            if (searchVo == null) {
                return new Result(ErroType.PARAMETER_ERROR.value(), ErroType.PARAMETER_ERROR.message());
            }
            List<User> list = service.getUserListByCondition(searchVo);
            return new Result<List<User>>(list);
        } catch (Exception ex) {
            logger.error("getUserListByCondition", ex);
            return new Result(ErroType.INNER_ERROR.value(), ErroType.INNER_ERROR.message() + ":" + ExceptionUtils.errInfo(ex));
        }
    }

    @Override
    public Result<Pagination<User>> getUserPageListByCondition(UserSearchParameter searchVo, Pagination page) {
        try {
            if (searchVo == null || page == null) {
                return new Result(ErroType.PARAMETER_ERROR.value(), ErroType.PARAMETER_ERROR.message());
            }
            Pagination<User> list = service.getUserPageListByCondition(searchVo, page);
            return new Result<Pagination<User>>(list);
        } catch (Exception ex) {
            logger.error("getUserVoListByCondition", ex);
            return new Result(ErroType.INNER_ERROR.value(), ErroType.INNER_ERROR.message() + ":" + ExceptionUtils.errInfo(ex));
        }
    }
}
