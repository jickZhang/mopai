package com.it.boot.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.it.boot.feign.UserFeignClient;

@Controller
@RequestMapping("project")
public class ProjectController {
     
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private UserFeignClient userFeignClient;
	
	@RequestMapping("getProjects")
	@ResponseBody
	public String getProjects() {
		String str = this.restTemplate.getForObject("http://spring-boot-user/user/getUsers", String.class);
		return str;
	}
	
	@RequestMapping("getFeignProjects")
	@ResponseBody
	public String getFeignClient() {
		String str = userFeignClient.getUser();
		System.out.println("feign:"+str);
		return str;
	}
 
	 
}
