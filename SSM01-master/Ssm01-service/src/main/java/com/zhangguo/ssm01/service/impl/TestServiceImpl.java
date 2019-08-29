package com.zhangguo.ssm01.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.zhangguo.ssm01.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangguo.ssm01.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private TestDao testDao ;
	
	@Override
	public void insert() {
		Map map = new HashMap();
		map.put("name", "zhang3");
		testDao.insert(map);
	}

}
