package com.ssak.book.DAO;

import java.util.List;

import com.ssak.book.VO.UserVO;

public interface UserDAO {
	
	List<UserVO> getUserAllList(); // 모든 유저 정보
	
}
