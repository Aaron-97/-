package com.example.controller;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.interceptor.UserLoginAdapter;
import com.example.po.User;
import com.example.service.UserService;
import com.example.util.MD5Utils;
import com.example.util.UUIDUtils;

@Controller

public class UserController {

	@Autowired
	HttpServletRequest request;
	@Autowired
	HttpServletResponse response;
	@Autowired
	private UserService userService;
	private MD5Utils md5;
	/**
	 * 注册
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/registerUser")
	public String register(User user) {
		if (user.getId() != null) {
			userService.loginUser(user);
		} else {
			String pwd=user.getPassword();
			String password=md5.getMD5(pwd);
			user.setPassword(password);
			user.setStatus(0);
			String code = UUIDUtils.getUUID() + UUIDUtils.getUUID();
			user.setCode(code);
			userService.register(user);
		}

		return "admin/login/success";
	}

	@RequestMapping(value = "/toregisterUser", method = RequestMethod.GET)
	public String toRegisterUser(Model model, Integer id) {

		if (id != null) {

			User user = userService.selectById(id);

			model.addAttribute("user", user);
		}

		return "admin/login/register";
	}

	/**
	 * 校验邮箱中的code激活账户 首先根据激活码code查询用户，之后再把状态修改为"1"
	 */
	@RequestMapping(value = "/checkCode")
	public String checkCode(String code) {
		User user = userService.checkCode(code);
		System.out.println(user);
		// 如果用户不等于null，把用户状态修改status=1
		if (user != null) {
			String pwd=user.getPassword();
			String password=md5.getMD5(pwd);
			user.setPassword(password);
			user.setStatus(1);
			// 把code验证码清空，已经不需要了
			user.setCode("");
		
			System.out.println(user);
			userService.updateUserStatus(user);
		}
		return "redirect:/loginPage";
	}

	/**
	 * 跳转到登录页面
	 * 
	 * @return login
	 */
	@RequestMapping(value = "/loginPage")
	public String login() {
		return "admin/login/login";
	}

	/**
	 * 登录
	 */
	@RequestMapping(value = "/loginUser")
	public String login(User user, Model model,HttpSession session) {
		
		String pwd=user.getPassword();
		String password=md5.getMD5(pwd);
		user.setPassword(password);
		User u = userService.loginUser(user);
		String name=user.getEmail();
		if (u != null) {
			 Cookie c = new Cookie("JSESSIONID",session.getId());
	         c.setMaxAge(60*1);
	         response.addCookie(c);
            session.setAttribute("user",UserLoginAdapter.SESSION_KEY);

			return "redirect:admin.do";
		}
		return "admin/login/fail";
	}
	
	
	@RequestMapping(value = "/logout")
	public void logout(HttpServletRequest request,HttpServletResponse response) throws IOException{
		HttpSession session = request.getSession();
		session.setAttribute("username", null);
		response.sendRedirect("/loginPage");
	}
}
