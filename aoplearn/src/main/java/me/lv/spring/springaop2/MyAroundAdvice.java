package me.lv.spring.springaop2;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAroundAdvice implements MethodInterceptor {

	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("before...");
		invocation.proceed();
		System.out.println("after...");
		return null;
	}

}
