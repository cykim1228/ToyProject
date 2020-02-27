package com.user.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.user.service.UserService;
import com.user.service.UserVO;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("UserService")
public class UserServiceImpl extends EgovAbstractServiceImpl implements UserService {
	
	@Resource(name="UserDAO")
	private UserDAO userDao;

	@Override
	public void insertUser(UserVO userVO) throws Exception {
		// TODO Auto-generated method stub
		userDao.insertUser(userVO);
	}

}
