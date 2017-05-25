package com.huihui.springdemo.aop.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {  
    
    public static void main(String as[]){  
        BeanFactory factory = new ClassPathXmlApplicationContext("aop.xml");  
        IUser user = (IUser) factory.getBean("user");  
        //user.findAll();  
        //user.findUser("");  
        user.addUser("dd");
       // User u = new User();  
//      u.setUsername("Tom");  
//      user.findUser(u.getUsername());  
          
        /*u.setUsername("haha"); 
        user.addUser(u.getUsername());*/  
    }  
}  
