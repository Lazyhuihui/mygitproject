package com.huihui.mybatis.dao;

import java.util.List;

import com.huihui.mybatis.entity.Article;
import com.huihui.mybatis.entity.User;

public interface IUserOperation {    
    public User selectUserByID(int id);
    public List selectUsers(String userName);
    public void addUser(User user);
    public void updateUser(User user);
    
    public void deleteUser(int id);
    
    public List<Article> getUserArticles(int id); 
    
}
