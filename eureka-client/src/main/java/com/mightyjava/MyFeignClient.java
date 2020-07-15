package com.mightyjava;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="eureka-client-2")
public interface MyFeignClient {
	
	@GetMapping(path = "/")
	String client2Response();
}
