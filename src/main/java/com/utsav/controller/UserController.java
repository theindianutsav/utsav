package com.utsav.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.utsav.form.LoginForm;
import com.utsav.form.RegisterForm;

@Controller
public class UserController {

	@RequestMapping(value = "/login", method=RequestMethod.POST)
	public String login(@ModelAttribute LoginForm loginForm) {

		System.out.println(loginForm);
		return "home";
	}

	@RequestMapping(value = "/register", method=RequestMethod.POST)
	public String register(@ModelAttribute RegisterForm registerForm) {
		System.out.println(registerForm);
		return "login";
	}

}
