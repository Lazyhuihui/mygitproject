package com.huihui.echarts.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.huihui.echarts.entity.Bar;
import com.huihui.util.JacksonUtil;
@Controller
public class BarController {



	    @RequestMapping("/getdata")
	    public void listall(HttpServletRequest request,HttpServletResponse response){
	       // ModelAndView mav=new ModelAndView("list");
	        List<Bar> barlist=new ArrayList<Bar>();
	        String[] names = {"衬衫","羊毛衫","雪纺衫","裤子","高跟鞋","袜子","测试"};
	        List<String> categories=new ArrayList<String>();
	        Collections.addAll(categories, names);
	        Integer[] values = {5,20,36,10,10,20,15};
	        List<Integer> series=new ArrayList<Integer>();
	        Collections.addAll(series, values);
	       // categories.add("");
	        Bar bar=new Bar();
	        bar.setTitle("Bar事例");
	        bar.setLegend("销量");
	        bar.setCategories(categories);
	        bar.setSeries(series);
	       // mav.addObject("data",barlist);
	       // mav.addObject("data",bar);
	        response.setContentType("text/html; charset=utf-8");
			PrintWriter out;
			try {
				out = response.getWriter();
				out.write(JacksonUtil.toJson(bar));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
	       // return mav;
	    }
	    
	    @RequestMapping("/bar")
	    public ModelAndView bar(HttpServletRequest request,HttpServletResponse response){
	        ModelAndView mav=new ModelAndView("echarts/bar");
	        
	        return mav;
	    }

}
