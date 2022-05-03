package com.jie.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.POST_TYPE;

/**
 * @author hexiaogou
 * @classname PostFilter
 * @description post filter
 * @date 2022/5/3 15:17
 */
public class PostFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return POST_TYPE;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("This is post filter!");
        RequestContext ctx = RequestContext.getCurrentContext();
        ctx.getResponse().setCharacterEncoding("UTF-8");

        String response = ctx.getResponseBody();
        if (null != response) {
            ctx.setResponseStatusCode(500);
            ctx.setResponseBody(response);
        }
        return null;
    }
}
