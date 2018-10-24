package com.it.boot.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("spring-boot-user")
public interface UserFeignClient {
   
	@RequestMapping(value = "/user/getUsers",method=RequestMethod.GET)
	public String getUser(); //@PathVariable  有参数的时候加该注解     @GetMapping不支持
	
	@RequestMapping(value = "/user/getUserById",method=RequestMethod.GET)
	public String getUserById(Object obj);//该请求的参数是个复杂对象   即使指定了get方法，feign依然以POST方法进行发送请求 
}
