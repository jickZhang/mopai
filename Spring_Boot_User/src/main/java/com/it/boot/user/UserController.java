package com.it.boot.user;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {
    
	@Value("${fileName}")
	private String fileName;
	
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
	
	@RequestMapping("geConfigFileName")
	@ResponseBody
	public String geConfigFileName() {
		System.out.println("从远程SpringBootConfig服务端获取到的fileName="+fileName);
		return fileName;
	}
	
}

