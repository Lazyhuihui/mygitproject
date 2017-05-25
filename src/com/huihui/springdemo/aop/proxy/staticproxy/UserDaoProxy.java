package com.huihui.springdemo.aop.proxy.staticproxy;

/**
 * 代理对象,静态代理
 */
public class UserDaoProxy implements IUserDao3{
    //接收保存目标对象
    private IUserDao3 target;
    public UserDaoProxy(IUserDao3 target){
        this.target=target;
    }

    public void save() {
        System.out.println("开始事务...");
        target.save();//执行目标对象的方法
        System.out.println("提交事务...");
    }
}
