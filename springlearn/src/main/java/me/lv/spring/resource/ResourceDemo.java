package me.lv.spring.resource;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class ResourceDemo {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// ClasspathResource
		Resource resource = context.getResource("classpath:applicationContext.xml");
		System.out.println("Resource type: " + resource.getClass());

		// UrlResource
		resource = context.getResource("file:applicationContext.xml");
		System.out.println("Resource type: " + resource.getClass());

		// ClasspathContextResource
		resource = context.getResource("applicationContext.xml");
		System.out.println("Resource type: " + resource.getClass());

		// ClasspathContextResource
		resource = context.getResource("/applicationContext.xml");
		System.out.println("Resource type: " + resource.getClass());
		context.close();
	}
}
