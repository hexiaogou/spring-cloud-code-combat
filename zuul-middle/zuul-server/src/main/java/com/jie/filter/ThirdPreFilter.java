package com.jie.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

/**
 * @author hexiaogou
 * @classname ThirdPreFilter
 * @description third pre-filter
 * @date 2022/5/3 15:13
 */

public class ThirdPreFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 3;
    }

    @Override
    public boolean shouldFilter() {
        RequestContext ctx = RequestContext.getCurrentContext();
        return (boolean) ctx.get("logic-is-success");
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("This is third pre filter!");
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        String b = request.getParameter("b");

        if (null == b) {
            ctx.setSendZuulResponse(false);
            ctx.setResponseBody("{\"status\":500,\"message\":\"parameter b is null!\"}");
            ctx.set("logic-is-success", false);
        }

        return null;
    }
}
