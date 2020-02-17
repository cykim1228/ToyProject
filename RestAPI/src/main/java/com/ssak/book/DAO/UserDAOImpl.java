package com.ssak.book.DAO;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.ssak.book.VO.UserVO;

@Repository
public class UserDAOImpl implements UserDAO {
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "com.ssak.book.mappers.userMapper";
	
	@Override
	public List<UserVO> getUserAllList() {
		return sqlSession.selectList(namespace + ".getUserAllList");
	}
	
	@Override
	public int joinUser(UserVO userVO) {
		return sqlSession.insert(namespace + ".joinUser", userVO);
	}
	
}
