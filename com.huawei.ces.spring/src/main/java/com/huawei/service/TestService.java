package com.huawei.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huawei.mybatis.mapper.TestMapper;
import com.huawei.mybatis.model.Test;

@Service
public class TestService
{
	@Autowired
	private TestMapper testMapper;
	
	public List<Test> getAllTest()
	{
		int id = 1;
		Test test = testMapper.selectByPrimaryKey(id);
		
		List<Test> list = new ArrayList<Test>();
		list.add(test);
		
		return list;
	}
}
