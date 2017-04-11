package com.huihui.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.huihui.mybatis.dao.IUserOperation;
import com.huihui.mybatis.entity.User;

@Service
public class CacheTestService {
	@Autowired
	private IUserOperation iUserOperation;
	@Cacheable(value = { "usercoin" },key="#id")
    public User selectUserByID(int id){
		User user= iUserOperation.selectUserByID(id);
		System.out.println("查询数据库");
		return user;
	}
	@CacheEvict(value = { "usercoin" }, key="#user.id")
	public void updateUser(User user){
		iUserOperation.updateUser(user);
		System.out.println("清缓存");
	}
    
}
