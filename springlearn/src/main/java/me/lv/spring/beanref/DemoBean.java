package me.lv.spring.beanref;

public class DemoBean {
	private String name = "no one";

	public void sayHello() {
		System.out.println("from : " + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
