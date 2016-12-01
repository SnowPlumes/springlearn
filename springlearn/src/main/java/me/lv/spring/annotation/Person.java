package me.lv.spring.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("person")
@Scope
public class Person {

	@Value("name")
	private String name;

	// @Autowired
	// @Qualifier("child")
	@Resource(name = "child")
	private Child child;

	public void sayHello() {
		System.out.println("hello");
	}

	@PostConstruct
	public void init() {
		System.out.println("init...");
	}

	@PreDestroy
	public void destory() {
		System.out.println("destory...");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", child=" + child + "]";
	}

}
