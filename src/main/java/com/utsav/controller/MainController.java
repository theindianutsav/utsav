package com.utsav.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.utsav.service.impl.MainServiceImpl;

@Controller
public class MainController {

	@Autowired
	MainServiceImpl mainService;

	@RequestMapping(value = "/")
	public String testMongoDB() {
		//mainService.testMongoDB();
		return "home";
	}

}
