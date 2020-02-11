package com.ssak.book.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssak.book.Service.UserService;
import com.ssak.book.VO.UserVO;

@RestController
public class UserRestController {
	
	@Autowired
	UserService userService;
	
	@GetMapping(value = "/find/users")
	public List<UserVO> usersinfo(@RequestParam String name) {
		
		List<UserVO> users = userService.findUsers(name);
		
		return users;
		
	}
	
	@GetMapping(value = "/view/users")
	public List<UserVO> users() {
		
		List<UserVO> users = userService.viewUsers();
		
		return users;
		
	}
	
}
