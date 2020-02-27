package com.user.service.impl;

import org.springframework.stereotype.Repository;

import com.common.service.impl.ComAbstractDAO;
import com.user.service.UserVO;

@Repository("UserDAO")
public class UserDAO extends ComAbstractDAO {
	
	public void insertUser(UserVO userVO) {
		insert("UserMapper.insertUser", userVO);
	}
	
}
