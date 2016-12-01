package me.lv.spring.xmlandann;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xmlandann.xml");
		Person person = context.getBean("person", Person.class);
		System.out.println(person);
		context.close();
	}
}
