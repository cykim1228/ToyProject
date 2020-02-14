package com.ssak.book.Service;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.ssak.book.DAO.UserDAO;
import com.ssak.book.VO.UserVO;

public class UserService {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	private UserDAO userDao;

	public String getUserAllList() {
		// TODO Auto-generated method stub
		
		System.out.println("서비스 접속 확인");

		userDao = sqlSession.getMapper(UserDAO.class);
		
		String result = "디비 접속 확인.";
		
		/*
		List<UserVO> result = new ArrayList();
		
		result = userDao.getUserAllList();
		
		if(result.isEmpty()) {
			
			System.out.println("사용자가 없습니다.");
			
		}
		*/
		
		return result;
		
	}

	public UserVO join(UserVO user) {
		// TODO Auto-generated method stub
		return null;
	}

}
