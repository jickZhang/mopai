package com.it.boot.feign;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(name="projectFeignClient",url="ip:port")  //如果写了 url 则name 只是标识(无其他作用)，如果没有url 则 eureka 会通过name 找到ip:port
public interface ProjectFeignClient {
    
}
