package me.lv.spring.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * �����ࣺ�е�����ǿ���
 * 
 * @author lc
 *
 */
@Aspect
public class MyAspect {

	@Before("execution(* me.lv.spring.aspectj.UserDao.add(..))")
	public void before() {
		System.out.println("before...");
	}

	@AfterReturning(value = "execution(* me.lv.spring.aspectj.UserDao.update(..))", returning = "returnVal")
	public void after(Object returnVal) {
		System.out.println("after...����ֵ �� " + returnVal);
	}

	@Around(value = "execution(* me.lv.spring.aspectj.UserDao.delete(..))")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("����ǰ...");
		Object obj = joinPoint.proceed();
		System.out.println("���ƺ�...");
		return obj;
	}

	@AfterThrowing(value = "MyAspect.myPointcut())", throwing = "e")
	public void afterThrowing(Throwable e) {
		System.out.println("���쳣" + e.getMessage());
	}

	@After("MyAspect.myPointcut()")
	public void after() {
		System.out.println("����֪ͨ...");
	}
	
	@Pointcut("execution(* me.lv.spring.aspectj.UserDao.find(..))")
	private void myPointcut() {
	}
	
}
