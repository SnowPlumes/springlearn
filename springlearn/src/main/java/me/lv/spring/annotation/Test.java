package me.lv.spring.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = context.getBean("person", Person.class);
		System.out.println(person);
		person.sayHello();
		context.close();
	}
}