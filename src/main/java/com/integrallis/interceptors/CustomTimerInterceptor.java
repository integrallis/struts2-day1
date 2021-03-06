package com.integrallis.interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.integrallis.annotation.Timer;

public class CustomTimerInterceptor implements Interceptor {

  	public void destroy() {
  		System.out.println("CustomTimerInterceptor destroy() is called...");
  	}

  	//called during interceptor initialization
  	public void init() {
  		System.out.println("CustomTimerInterceptor init() is called...");
  	}

  	//put interceptor code here
  	public String intercept(ActionInvocation invocation) throws Exception {
      long start = System.currentTimeMillis();
  		String result = invocation.invoke();
  		
      if (invocation.getAction().getClass().isAnnotationPresent(Timer.class)) {
  		  System.out.println("Executed in : " + (System.currentTimeMillis() - start) + " ms");
		  }

  		return result;
  	}  
  
}