package me.lv.spring.aspectjxml;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspectXML {

	public void before() {
		System.out.println("前置通知...");
	}

	public void afterReturning(Object returnVal) {
		System.out.println("后置通知... 返回值：" + returnVal);
	}

	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("环绕前...");
		Object obj = joinPoint.proceed();
		System.out.println("环绕后...");
		return obj;
	}

	public void afterThrowing(Throwable e) {
		System.out.println("出异常..." + e.getMessage());
	}

	public void after() {
		System.out.println("最终。。。");
	}
}
