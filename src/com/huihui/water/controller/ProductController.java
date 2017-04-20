package com.huihui.water.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.huihui.water.entity.Product;
import com.huihui.water.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/index")
    public ModelAndView listall(HttpServletRequest request,HttpServletResponse response){
        //List<Article> articles=userMapper.getUserArticles(1); 
		List<Product> list=productService.getAllproduct();
        ModelAndView mav=new ModelAndView("index");
        mav.addObject("waterlist",list);
        return mav;
    }
	@RequestMapping("/introduce")
    public ModelAndView introduce(HttpServletRequest request,HttpServletResponse response){
        //List<Article> articles=userMapper.getUserArticles(1); 
		String idstr=request.getParameter("id");
		if(idstr==null||idstr.equals("")){
			idstr="1";
		}
		int id =Integer.valueOf(idstr);
		Product water=productService.getProductByID(id);
        ModelAndView mav=new ModelAndView("introduce");
        mav.addObject("water",water);
        return mav;
    }
}
