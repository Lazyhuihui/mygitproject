package com.huihui.springdemo.aop.proxy.cglibproxy;

import org.junit.Test;

/**
 * 测试类
 */
public class App1 {

    @Test
    public void test(){
        //目标对象
        UserDao1 target = new UserDao1();

        //代理对象
        UserDao1 proxy = (UserDao1)new ProxyFactory1(target).getProxyInstance();

        //执行代理对象的方法
        proxy.save();
    }
}

