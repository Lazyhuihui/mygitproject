/**
 * @(#)Jodo, 2014年2月18日
 */
package com.huihui.pay.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;



/**
 * @author treemanz
 */
public abstract class MyHttpServlet extends HttpServlet {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    protected Short getShortValue(HttpServletRequest req, String key,
            Short defaultValue) {
        String incomeValue = req.getParameter(key);
        if (StringUtils.isNotBlank(incomeValue)) {
            try {
                return Short.parseShort(incomeValue);
            } catch (NumberFormatException e) {
            }
        }
        return defaultValue;
    }
    
    protected Double getDoubleValue(HttpServletRequest req, String key,
    		Double defaultValue) {
        String incomeValue = req.getParameter(key);
        if (StringUtils.isNotBlank(incomeValue)) {
            try {
                return Double.parseDouble(incomeValue);
            } catch (NumberFormatException e) {
            }
        }
        return defaultValue;
    }

    protected Integer getIntValue(HttpServletRequest req, String key,
            Integer defaultValue) {
        String incomeValue = req.getParameter(key);
        if (StringUtils.isNotBlank(incomeValue)) {
            try {
                return Integer.parseInt(incomeValue);
            } catch (NumberFormatException e) {}
        }
        return defaultValue;
    }



    
    
    protected Boolean getBooleanValue(HttpServletRequest req, String key,
            Boolean defaultValue) {
        String incomeValue = req.getParameter(key);
        if (StringUtils.isBlank(incomeValue)) {
            return defaultValue;
        }
        return "true".equalsIgnoreCase(incomeValue);
    }

    protected void forward2ErrorPage(HttpServletRequest req,
            HttpServletResponse resp, String errMsg) throws Exception {
        req.setAttribute("msg", errMsg);
        this.getServletContext()
                .getRequestDispatcher("/WEB-INF/jsps/error.jsp")
                .forward(req, resp);
    }

}
