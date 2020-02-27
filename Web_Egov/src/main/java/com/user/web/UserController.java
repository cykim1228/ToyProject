package com.user.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.user.service.UserService;
import com.user.service.UserVO;

@Controller
public class UserController {
	
	@Resource(name = "UserService")
	private UserService userService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(HttpServletRequest request, Model model) {
		HttpSession session = request.getSession();
		if (session.getAttribute("path") == null)
			session.setAttribute("path", request.getContextPath());
		return "/login/login";
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join(HttpServletRequest request, Model model) {
		HttpSession session = request.getSession();
		if (session.getAttribute("path") == null)
			session.setAttribute("path", request.getContextPath());
		return "/login/join";
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String joinDo(@ModelAttribute("userVO") UserVO userVO,
			HttpServletRequest request, ModelMap model) throws Exception {
		HttpSession session = request.getSession();
		if (session.getAttribute("path") == null)
			session.setAttribute("path", request.getContextPath());
		
		userService.insertUser(userVO);
		
		return "redirect:/login.do";
	}
}
