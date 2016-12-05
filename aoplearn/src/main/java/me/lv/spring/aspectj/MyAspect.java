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
 * 切面类：切点与增强结合
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
		System.out.println("after...返回值 ： " + returnVal);
	}

	@Around(value = "execution(* me.lv.spring.aspectj.UserDao.delete(..))")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("环绕前...");
		Object obj = joinPoint.proceed();
		System.out.println("环绕后...");
		return obj;
	}

	@AfterThrowing(value = "MyAspect.myPointcut())", throwing = "e")
	public void afterThrowing(Throwable e) {
		System.out.println("出异常" + e.getMessage());
	}

	@After("MyAspect.myPointcut()")
	public void after() {
		System.out.println("最终通知...");
	}
	
	@Pointcut("execution(* me.lv.spring.aspectj.UserDao.find(..))")
	private void myPointcut() {
	}
	
}
