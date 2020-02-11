package com.ssak.book.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ssak.book.VO.UserVO;

@Service
public class UserService {
	
	public List<UserVO> findUsers(String type) {
		
		List<UserVO> users = new ArrayList<UserVO>();
		
		UserVO user1 = new UserVO();
		user1.setName("김찬영");
		user1.setPassword("1234");
		user1.setEmail("kim@naver.com");
		
		UserVO user2 = new UserVO();
		user2.setName("현수");
		user2.setPassword("5678");
		user2.setEmail("park@naver.com");
		
		UserVO user3 = new UserVO();
		user3.setName("예슬");
		user3.setPassword("4321");
		user3.setEmail("sle@naver.com");
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		
		return users;
		
	}
	
	public List<UserVO> viewUsers() {
		
		List<UserVO> users = new ArrayList<UserVO>();
		
		UserVO user1 = new UserVO();
		user1.setName("김찬영");
		user1.setPassword("1234");
		user1.setEmail("kim@naver.com");
		
		UserVO user2 = new UserVO();
		user2.setName("현수");
		user2.setPassword("5678");
		user2.setEmail("park@naver.com");
		
		UserVO user3 = new UserVO();
		user3.setName("예슬");
		user3.setPassword("4321");
		user3.setEmail("sle@naver.com");
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		
		return users;
		
	}
	
}
