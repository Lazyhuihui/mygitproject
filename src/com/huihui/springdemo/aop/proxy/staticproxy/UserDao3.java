package com.huihui.springdemo.aop.proxy.staticproxy;

/**
 * 接口实现
 * 目标对象
 */
public class UserDao3 implements IUserDao3 {
    public void save() {
        System.out.println("----已经保存数据!----");
    }
}
