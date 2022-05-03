package com.jie.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

/**
 * @author hexiaogou
 * @classname SecondPreFilter
 * @description second pre filter
 * @date 2022/5/3 15:00
 */
public class SecondPreFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 2;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("This is second pre filter!");
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        String a = request.getParameter("a");

        if (null == a) {
            ctx.setSendZuulResponse(false);
            ctx.setResponseBody("{\"status\":500,\"message\":\"parameter a is null!\"}");
            ctx.set("logic-is-success",false);
        }

        ctx.set("logic-is-success",true);
        return null;
    }
}
