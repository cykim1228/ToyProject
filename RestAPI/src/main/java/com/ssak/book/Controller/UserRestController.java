package com.ssak.book.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssak.book.Service.UserService;
import com.ssak.book.VO.UserVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@Api(value = "1. 사용자", description = "로그인/로그아웃")
public class UserRestController {

	@Autowired
	private UserService userService;
	
	@ApiOperation(value = "사용자 조회", notes = "모든 사용자를 조회합니다.")
	@GetMapping(value = "/user")
	public List<UserVO> findAllUser() throws Exception {

		System.out.println("전체 사용자 조회를 시작합니다...");
		
		List<UserVO> result = userService.getUserAllList();

		return result;

	}
	
	@ApiOperation(value = "사용자 입력", notes = "사용자를 입력해 회원가입 합니다.")
	@PostMapping(value = "/user")
	public UserVO joinUser(@ApiParam(value = "회원 아이디", required = true) @RequestParam String userId,
			@ApiParam(value = "회원 비밀번호", required = true) @RequestParam String userPw,
			@ApiParam(value = "회원 이름", required = true) @RequestParam String userName,
			@ApiParam(value = "회원 전화번호", required = true) @RequestParam String userPhone,
			@ApiParam(value = "회원 생년월일", required = true) @RequestParam String userBirth,
			@ApiParam(value = "회원 이메일", required = true) @RequestParam String userEmail) throws Exception {

		System.out.println("사용자 회원가입을 시작합니다...");
		
		UserVO userVO = new UserVO();
		
		System.out.println("user = " + userVO);
		
		userVO.setUserId(userId);
		userVO.setUserPw(userPw);
		userVO.setUserName(userName);
		userVO.setUserPhone(userPhone);
		userVO.setUserBirth(userBirth);
		userVO.setUserEmail(userEmail);
		
		System.out.println("user = {" + userId + " , " + userPw + " , " + userName + " , " + userPhone + " , " + userBirth + " , " + userEmail + "}");

		System.out.println("user = " + userVO);
		
		/*
		UserVO user = UserVO.builder() .userId(userId) .userPw(userPw)
		.userName(userName) .userPhone(userPhone) .userBirth(userBirth)
		.userEmail(userEmail) .build();
		*/

		return userService.joinUser(userVO);

	}
	
	@ApiOperation(value = "사용자 조회", notes = "특정 사용자를 조회합니다.")
	@GetMapping(value = "/user/{userId}")
	public List<UserVO> findSelectUser() throws Exception {

		System.out.println("특정 사용자 조회를 시작합니다...");
		
		List<UserVO> result = userService.getUserAllList();

		return result;

	}

}
