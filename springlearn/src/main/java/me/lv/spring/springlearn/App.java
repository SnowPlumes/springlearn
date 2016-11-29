package me.lv.spring.springlearn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloSpringBean bean = context.getBean("helloSpring", HelloSpringBean.class);
		bean.sayHello();

		DataBase base = (DataBase) context.getBean("dataBase");
		System.out.println(base.getDataSource());

	}
}