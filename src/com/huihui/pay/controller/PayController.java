package com.huihui.pay.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.huihui.util.AESencryptUtil;
@RequestMapping(value = "pay")
@Controller
public class PayController extends MyHttpServlet{
	@RequestMapping(value = "selectPayType", method = RequestMethod.GET)
	public String paypalpay1(HttpServletRequest req, HttpServletResponse response) throws Exception{
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setContentType("text/html; charset=utf-8");
		
		String out_trade_no=AESencryptUtil.getDefaultInstance().encrypt(
                String.valueOf("314313431439"));
		req.setAttribute("WIDbody", "鼎湖山泉订单");
        req.setAttribute("out_trade_no", out_trade_no);
        req.setAttribute("subject","鼎湖山泉订单");
        req.setAttribute("total_fee", 20.0);
        return "alipayapi";
	}
}
