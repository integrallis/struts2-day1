package com.integrallis.interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.integrallis.RequestURIAware;
import javax.servlet.http.*;
import org.apache.struts2.StrutsStatics;

public class RequestURIInterceptor implements Interceptor {

  	public void destroy() {
  		System.out.println("RequestURIInterceptor destroy() is called...");
  	}

  	//called during interceptor initialization
  	public void init() {
  		System.out.println("RequestURIInterceptor init() is called...");
  	}

  	//put interceptor code here
  	public String intercept(ActionInvocation invocation) throws Exception {
      if (invocation.getAction() instanceof RequestURIAware) {
        HttpServletRequest req = (HttpServletRequest) invocation.getInvocationContext().get(StrutsStatics.HTTP_REQUEST);
        ((RequestURIAware) invocation.getAction()).setRequestURI(req.getRequestURI());
      }

  		return invocation.invoke();
  	}  

  }