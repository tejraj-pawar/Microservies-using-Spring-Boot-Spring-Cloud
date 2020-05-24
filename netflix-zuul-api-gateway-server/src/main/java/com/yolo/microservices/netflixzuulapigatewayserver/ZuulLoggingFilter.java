package com.yolo.microservices.netflixzuulapigatewayserver;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class ZuulLoggingFilter extends ZuulFilter{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	// for which requests this filter should work.
	public boolean shouldFilter() {
		return true; // it will filter all requests
	}

	@Override
	// here we write working of filter i.e. what our filter will do
	public Object run() throws ZuulException {
		HttpServletRequest request =
				RequestContext.getCurrentContext().getRequest();
		logger.info("Request: {}, Request uri: {}", request, request.getRequestURI());
		
		return null;
	}

	@Override
	// when to apply filter to request -> before executing(pre)/after executing(post).
	public String filterType() {
		return "pre";
	}

	@Override
	// if there are many filters then we can set their order as 1,2,3....
	public int filterOrder() {
		return 1;
	}
	

}
