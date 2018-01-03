package com.ratel.info.impl.api.dao;

import com.ratel.info.impl.api.dao.BaseMapper;
import org.springframework.stereotype.Repository;
import com.ratel.info.api.model.*;

/*
 * Description:
 * All Rights Reserved.
 * @version 1.0 2018/01/03 03:35  by  李浩（lihao@cloud-young.com）创建
 */

@Repository
public interface UserMapper extends  BaseMapper<User, UserExample> {
	
}
