package com.utsav.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.utsav.form.LoginForm;
import com.utsav.form.RegisterForm;

@Controller
public class MenuController {

	@RequestMapping(value = "/userLoginPage")
	public String userLoginPage(ModelMap model) {
		model.addAttribute("registerForm", new RegisterForm());
		model.addAttribute("loginForm", new LoginForm());
		return "loginPage";
	}
}
