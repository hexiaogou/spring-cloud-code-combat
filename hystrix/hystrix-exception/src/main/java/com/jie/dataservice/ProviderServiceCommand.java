package com.jie.dataservice;


import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
/**
 * @author hexiaogou
 * @classname ProviderServiceCommand
 * @description provider service command
 * @date 2022/3/11 14:38
 */
public class ProviderServiceCommand extends HystrixCommand<String>{
	
	 	private final String name;
	 	
	    public ProviderServiceCommand(String name) {
	        super(HystrixCommandGroupKey.Factory.asKey("GroupSC"));
	        this.name = name;
	    }

	    @Override
	    protected String run() {
	        return "Spring Cloud";
	    }
	    
	    @Override
	    protected String getFallback() {
	        return "Failure Spring Cloud";
	    }
	    
}

