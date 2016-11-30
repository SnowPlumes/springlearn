package me.lv.spring.collection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("di.xml");
		DiBean bean = context.getBean("diBean", DiBean.class);
		CollectionBean bean2 = context.getBean("connectionBean", CollectionBean.class);

		bean.sayHello();

		bean2.sayHello();
		bean2.listProperties();
		bean2.mapProperties();

		context.close();
	}
}
