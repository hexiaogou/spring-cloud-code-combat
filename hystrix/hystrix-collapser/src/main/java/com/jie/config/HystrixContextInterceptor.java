package com.jie.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.netflix.hystrix.strategy.concurrency.HystrixRequestContext;

/**
 * @classname HystrixContextInterceptor
 * @description hystrix context interceptor
 * @date 2022/3/14 13:55
 * @author hexiaogou
 */
public class HystrixContextInterceptor implements HandlerInterceptor {
	
	private HystrixRequestContext context;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		context = HystrixRequestContext.initializeContext();
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object arg2, ModelAndView arg3)
			throws Exception {
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object arg2, Exception arg3)
			throws Exception {
		context.shutdown();
	}
	
}
