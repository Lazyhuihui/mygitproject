package com.huihui.water.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.huihui.mybatis.dao.IUserOperation;
@Controller
public class ContentDetail {

    @RequestMapping("/contentDetail")
    public ModelAndView listall(HttpServletRequest request,HttpServletResponse response){
        //List<Article> articles=userMapper.getUserArticles(1); 
        ModelAndView mav=new ModelAndView("contentDetail");
       // mav.addObject("articles",articles);
        return mav;
    }
}
