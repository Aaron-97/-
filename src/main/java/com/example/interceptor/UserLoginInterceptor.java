package com.example.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

public class UserLoginInterceptor implements HandlerInterceptor {
    
    @Override  
    public boolean preHandle(HttpServletRequest request,HttpServletResponse response, Object handler) throws Exception {  
          
        Object user = request.getSession().getAttribute("user");
        if (user == null || user.equals(""))  {
            response.sendRedirect("/loginPage");  
            return false;  
        }
        return true;
    }  
}
