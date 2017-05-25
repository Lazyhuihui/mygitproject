package com.huihui.springdemo.aop.proxy.jdkproxy;

/**
 * 测试类
 */
public class App2 {
    public static void main(String[] args) {
        // 目标对象
        IUserDao2 target = new UserDao2();
        // 【原始的类型 class cn.itcast.b_dynamic.UserDao】
        System.out.println(target.getClass());

        // 给目标对象，创建代理对象
        IUserDao2 proxy = (IUserDao2) new ProxyFactory2(target).getProxyInstance();
        // class $Proxy0   内存中动态生成的代理对象
        System.out.println(proxy.getClass());

        // 执行方法   【代理对象】
        proxy.save();
   }
}