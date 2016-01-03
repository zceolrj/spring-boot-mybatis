package com.huawei.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huawei.mybatis.model.Test;
import com.huawei.service.TestService;

@RestController
@RequestMapping("/test")
public class TestController
{
	private static final Logger log = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	private TestService testService;
	
	@RequestMapping("/test1")
	public String test1()
	{
		List<Test> list = testService.getAllTest();
		if(list != null)
		{
			for(Test test : list)
			{
				log.info(test.getId() + "--" + test.getName());
			}
		}
		
		return "hello world";
	}
}
