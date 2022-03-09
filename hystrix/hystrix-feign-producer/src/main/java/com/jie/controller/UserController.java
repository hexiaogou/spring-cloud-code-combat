package com.jie.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping(value = "/getUser",method = RequestMethod.GET)
	public String getUser(@RequestParam("userName") String userName) throws Exception{
		if(userName.equals("spring")) {
			return "This is real user";
		}else {
			throw new Exception();
		}
	}
}
