package com.jie.groovy

import com.netflix.zuul.ZuulFilter
import com.netflix.zuul.context.RequestContext
import com.netflix.zuul.exception.ZuulException

import javax.servlet.http.HttpServletRequest

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

/**
 * @classname GroovyFilter
 * @description groovy filter
 * @date 2022/5/3 15:34
 */
class GroovyFilter extends ZuulFilter{
    @Override
    String filterType() {
        return PRE_TYPE
    }

    @Override
    int filterOrder() {
        return 10
    }

    @Override
    boolean shouldFilter() {
        return true
    }

    @Override
    Object run() throws ZuulException {
        HttpServletRequest request = RequestContext.currentContext.request as HttpServletRequest
        Iterator headerIt = request.getHeaderNames().iterator()
        while (headerIt.hasNext()) {
            String name = (String) headerIt.next()
            String value = request.getHeader(name)
            println("header: " + name + ":" + value)
        }
        println("This is very good groovy filter!")
        return null
    }
}
