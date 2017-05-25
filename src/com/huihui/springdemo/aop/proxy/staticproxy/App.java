package com.huihui.springdemo.aop.proxy.staticproxy;

/**
 * 测试类
 */
public class App {
    public static void main(String[] args) {
        //目标对象
        UserDao3 target = new UserDao3();

        //代理对象,把目标对象传给代理对象,建立代理关系
        UserDaoProxy proxy = new UserDaoProxy(target);

        proxy.save();//执行的是代理的方法
    }
}

