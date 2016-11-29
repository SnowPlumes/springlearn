package me.lv.spring.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		context.getBean(LifeBean.class);
		context.close();
	}
}
