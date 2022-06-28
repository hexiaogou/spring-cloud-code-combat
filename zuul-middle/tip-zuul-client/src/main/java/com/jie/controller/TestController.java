package com.jie.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * @author hexiaogou
 */
@Api(description = "test origin service api")
@RestController
public class TestController {

	@ApiOperation(value = "add", notes = "add")
	@GetMapping("/add")
	public String add(Integer a, Integer b, HttpServletRequest request){
		return "Port: " + request.getServerPort() + "" + (a + b);
	}

	@ApiOperation(value = "sub", notes = "sub")
	@GetMapping("/sub")
	public Integer sub(Integer a, Integer b){
		return a - b;
	}

	@ApiOperation(value = "mul", notes = "mul")
	@GetMapping("/mul")
	public Integer mul(Integer a, Integer b){
		return a * b;
	}

	@ApiOperation(value = "div", notes = "div")
	@GetMapping("/div")
	public Integer div(Integer a, Integer b){
		return a / b;
	}

	@PostMapping("/modifyRequestEntity")
	public Map<String, Object> modifyRequestEntity (HttpServletRequest request) {
		Map<String, Object> bodyParams = new HashMap<>();
		Enumeration enu = request.getParameterNames();
		while (enu.hasMoreElements()) {
			String paraName = (String)enu.nextElement();
			bodyParams.put(paraName, request.getParameter(paraName));
		}
		return bodyParams;
	}

}
