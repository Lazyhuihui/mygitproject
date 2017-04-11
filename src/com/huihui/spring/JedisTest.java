package com.huihui.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huihui.util.JedisUtils;

public class JedisTest {
	public static void main(String[] args) {
		ApplicationContext context2 = new ClassPathXmlApplicationContext(
	            new String[]{"spring-context.xml", "spring-context-jedis.xml","spring-mvc.xml"});
		JedisUtils.set("huihui", "1", 60*60*24*10);
		System.out.println(JedisUtils.get("huihui"));
	}
}
