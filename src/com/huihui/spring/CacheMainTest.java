package com.huihui.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huihui.mybatis.entity.User;
import com.huihui.spring.service.CacheTestService;

public class CacheMainTest {
	public static void main(String[] args) {
		// ApplicationContext context2 = new ClassPathXmlApplicationContext("spring-context.xml");
		ApplicationContext context2 = new ClassPathXmlApplicationContext(
	            new String[]{"spring-context.xml", "spring-context-cache.xml"});
	     CacheTestService cacheTestService=context2.getBean(CacheTestService.class);
	     User user=cacheTestService.selectUserByID(1);
	     if(user!=null){
	    	 
	    	 System.out.println(user.getUserName());
	    	 user=cacheTestService.selectUserByID(1);
	    	 System.out.println(user.getUserName());
	    	 user.setUserName("猪猪鸡鸡");
	    	 cacheTestService.updateUser(user);
	    	 user=null;
	     }
	     
	     user=cacheTestService.selectUserByID(1);
	     System.out.println(user.getUserName());
	}
}
