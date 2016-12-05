package me.lv.spring.aspectjxml;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspectXML {

	public void before() {
		System.out.println("ǰ��֪ͨ...");
	}

	public void afterReturning(Object returnVal) {
		System.out.println("����֪ͨ... ����ֵ��" + returnVal);
	}

	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("����ǰ...");
		Object obj = joinPoint.proceed();
		System.out.println("���ƺ�...");
		return obj;
	}

	public void afterThrowing(Throwable e) {
		System.out.println("���쳣..." + e.getMessage());
	}

	public void after() {
		System.out.println("���ա�����");
	}
}
