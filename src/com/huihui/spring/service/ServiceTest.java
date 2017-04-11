package com.huihui.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ServiceTest {

	public List<String> getList(){
		List<String> list=new ArrayList<>();
		list.add("1");
		list.add("2");
		return list;
	}
}
