package com.sbs.web.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.alibaba.fastjson.JSONObject;
import com.sbs.web.requestInterceptor.FeignConfiguration;

@FeignClient(value = "api-er",configuration=FeignConfiguration.class)
public interface IndexService {
	
	@GetMapping(value="/mybatisTest")
	public List<JSONObject> getAll();
	
}
