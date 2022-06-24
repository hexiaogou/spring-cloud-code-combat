package com.jie.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hexiaogou
 */
@RestController
public class TestController {
	
	@GetMapping("/add")
	public String add(Integer a, Integer b, HttpServletRequest request){
		return "service gray-zuul-client, port: " + request.getServerPort() + ", result=" + (a + b);
	}
	
	@GetMapping("/a/add")
	public Integer aa_dd(Integer a, Integer b){
		return a + b;
	}
	
	@GetMapping("/sub")
	public Integer sub(Integer a, Integer b){
		return a - b;
	}
	
	@GetMapping("/mul")
	public String mul(Integer a, Integer b){
		System.out.println("enter gray-zuul-client!");
		return "gray-zuul-client-" + a * b;
	}
	
	@GetMapping("/div")
	public Integer div(Integer a, Integer b){
		return a / b;
	}
}
