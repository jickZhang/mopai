package com.it.boot.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {
    
	
	@RequestMapping("getUsers")
	@ResponseBody
	public String getUsers() {
		System.out.println("****************************UserService*******************************");
		return "users";
	}
	
	@RequestMapping("getUserById")
	@ResponseBody
	public String getUsersById() {
		System.out.println("****************************feign-UserService**************************");
		return "feign-user";
	}
	
}

