package com.ssak.book.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

	private static UserService userService;

	@ApiOperation(value = "사용자 조회", notes = "모든 사용자를 조회합니다.")
	@GetMapping(value = "/user")
	public String findAllUser() {

		System.out.println("NULL!!!");
		
		String result = "뭐가올까";

		if (userService.getUserAllList().isEmpty()) {
			return "Null!!";
		}

		return result;

	}

	/*
	@ApiOperation(value = "사용자 조회", notes = "모든 사용자를 조회합니다.")
	
	@GetMapping(value = "/user") public ResponseEntity<List<UserVO>>
	sendErrorNot() {
	
	List<UserVO> userList = userService.getUserAllList();
	
	return new ResponseEntity<>(userList, HttpStatus.NOT_FOUND);
	
	}
	 */

	@ApiOperation(value = "사용자 입력", notes = "사용자를 입력해 회원가입 합니다.")
	@PostMapping(value = "/user")
	public UserVO join(@ApiParam(value = "회원 아이디", required = true) @RequestParam String userId,
			@ApiParam(value = "회원 비밀번호", required = true) @RequestParam String userPw,
			@ApiParam(value = "회원 이름", required = true) @RequestParam String userName,
			@ApiParam(value = "회원 전화번호", required = true) @RequestParam String userPhone,
			@ApiParam(value = "회원 생년월일", required = true) @RequestParam String userBirth,
			@ApiParam(value = "회원 이메일", required = true) @RequestParam String userEmail) {

		UserVO user = null;

		user.setUserId(userId);
		user.setUserPw(userPw);
		user.setUserName(userName);
		user.setUserPhone(userPhone);
		user.setUserBirth(userBirth);
		user.setUserEmail(userEmail);

		/*
		 * UserVO user = UserVO.builder() .userId(userId) .userPw(userPw)
		 * .userName(userName) .userPhone(userPhone) .userBirth(userBirth)
		 * .userEmail(userEmail) .build();
		 */

		return userService.join(user);

	}

}
