package com.korea.movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.UserDAO;
import vo.UserVO;



@Controller
public class UserController {

	@Autowired
	UserDAO user_dao;	// ==> @Repository에 있는 별칭과 똑같이 만들어줘야 한다.
	
	public UserController() {
		
	}
	
	
	@RequestMapping("/register.do")
	public String register_member( Model model, UserVO vo) {
		
		int res = user_dao.register(vo); 
		return "register_form";
	}
	
	@RequestMapping("/signup_success.do")
	public String signup_success( UserVO vo ) {
		
		
		
	}
	
	
	
	
}
