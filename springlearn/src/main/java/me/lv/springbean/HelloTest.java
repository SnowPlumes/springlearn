package me.lv.springbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloChinaBean chinaBean = context.getBean("helloChina", HelloChinaBean.class);
		chinaBean.sayHelloWorld();
		chinaBean.sayHello();
		((AbstractApplicationContext) context).close();
	}
}
