package com.it.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import com.it.config.RibbonConfig;

@SpringBootApplication
@EnableEurekaClient 
@EnableFeignClients
//  configuration对应的类  要放在不能被@SpringBootApplication 扫描到的包里面  或者 使用自定义注解 让@ComponentScan不扫描
// @RibbonClient(name="spring-boot-user",configuration=RibbonConfig.class) //某些特定注解的类
public class SpringProject {
      
	@Bean     // 
	@LoadBalanced //添加ribbon  注解  
	public RestTemplate restTemplate() {
		return new  RestTemplate();
	} 
	
	public static void main(String[] args) {
		 SpringApplication.run(SpringProject.class, args);
	}
} 
