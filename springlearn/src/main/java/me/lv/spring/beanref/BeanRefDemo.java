package me.lv.spring.beanref;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanRefDemo {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanRef.xml", "beanRef2.xml");

		BeanWrapper wrapper = context.getBean("bean", BeanWrapper.class);

		wrapper.getInnerBean().sayHello();

		wrapper.sayHello();
		context.close();
	}
}
