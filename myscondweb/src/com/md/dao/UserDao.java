package com.md.dao;

import com.md.entity.User;

public interface UserDao {
	//根据用户名和密码查询User对象
	User getUserByUserNameAndPassword(String name,String password) throws Exception;
}
