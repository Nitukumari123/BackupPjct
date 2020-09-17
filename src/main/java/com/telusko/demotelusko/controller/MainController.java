package com.telusko.demotelusko.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController{

	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}

	@RequestMapping("user")
	@ResponseBody
	public Principal user(Principal principal) {

		return principal;

	}
	

}