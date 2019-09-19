package com.petmeeting.joy.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class loginController {

	@RequestMapping(value="login.do", method= {RequestMethod.GET, RequestMethod.POST})
	public String login() {
		System.out.println("들어왔따");
		return "login/login";
	}
}
