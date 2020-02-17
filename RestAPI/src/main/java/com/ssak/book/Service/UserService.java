package com.ssak.book.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssak.book.DAO.UserDAO;
import com.ssak.book.VO.UserVO;

@Service
public class UserService {
	
	@Autowired
	private UserDAO userDao;

	public List<UserVO> getUserAllList() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("서비스 접속 확인...");
		
		List<UserVO> result = new ArrayList<UserVO>();
		
		result = userDao.getUserAllList();
		
		if(result.isEmpty()) {
			
			System.out.println("사용자가 없습니다.");
			
		} else {
			
			System.out.println("사용자 전체 조회 성공!");
			
		}
		
		return result;
		
	}

	public UserVO joinUser(UserVO userVO) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("서비스 접속 확인...");
		
		userDao.joinUser(userVO);
		
		System.out.println("사용자 회원가입 성공!");
		
		return userVO;
	}

}
