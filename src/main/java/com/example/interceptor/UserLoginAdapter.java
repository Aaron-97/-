package com.example.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;





@Configuration
public class UserLoginAdapter implements WebMvcConfigurer {

    public final static String SESSION_KEY = "user";
    
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new UserLoginInterceptor()).addPathPatterns("/admin.do");
    }

}
