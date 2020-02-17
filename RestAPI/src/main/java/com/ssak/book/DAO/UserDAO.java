package com.ssak.book.DAO;

import java.util.List;

import com.ssak.book.VO.UserVO;

public interface UserDAO {
	
	public List<UserVO> getUserAllList() throws Exception; // 모든 유저 정보
	
	public int joinUser(UserVO userVO) throws Exception; // 유저 회원가입
	
}
