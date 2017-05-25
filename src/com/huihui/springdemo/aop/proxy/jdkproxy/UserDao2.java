package com.huihui.springdemo.aop.proxy.jdkproxy;

/**
 * 接口实现
 * 目标对象
 */
public class UserDao2 implements IUserDao2 {
    public void save() {
        System.out.println("----已经保存数据!----");
    }
}
