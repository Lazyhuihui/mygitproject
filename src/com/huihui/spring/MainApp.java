package com.huihui.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huihui.spring.entity.Beanlife;
import com.huihui.spring.service.ServiceTest;
import com.huihui.water.entity.Product;
import com.huihui.water.service.ProductService;
public class MainApp {
   public static void main(String[] args) {
//      ApplicationContext context = 
//             new ClassPathXmlApplicationContext("Beans.xml");
//      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
//      obj.getMessage();
      
    //spring 作用域
//	   ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//	      HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
//	      objA.setMessage("I'm object A");
//	      objA.getMessage();
//	      HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
//	      objB.getMessage();
	      
	//bean生命周期
//	      AbstractApplicationContext context1 = new ClassPathXmlApplicationContext("Beans.xml");
//	      Beanlife objlife = (Beanlife) context.getBean("beanlife");
//	      objlife.getMessage();
//	      System.out.println("还没销毁");
//	      context1.registerShutdownHook();
	      

	//bean注解方式自动装配
	      ApplicationContext context2 = new ClassPathXmlApplicationContext("spring-context.xml");
	     // ServiceTest serviceTest=(ServiceTest) 
	      ProductService productService=context2.getBean(ProductService.class); 
	      List<Product>list=productService.getAllproduct();
	      System.out.println(list.size());
	      Product water=productService.getProductByID(2);
	      System.out.println(water.getWatername());
   }
}
