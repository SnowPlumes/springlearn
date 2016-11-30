package me.lv.spring.factory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("car.xml");

		CarBean car = context.getBean("car", CarBean.class);
		CarBean car2 = context.getBean("car2", CarBean.class);

		System.out.println(car);
		System.out.println(car2);
		context.close();
	}
}
