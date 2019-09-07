package com.sbs.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.sbs.web.service.IndexService;

@Controller
public class IndexController {
	@Autowired
	private IndexService indexService;
	
	@RequestMapping("/index")
	@ResponseBody
	public List<JSONObject> test() {
		return indexService.getAll();
	}
}
