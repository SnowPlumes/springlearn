package me.lv.spring.collection;

public class DiBean {
	private String name = "no one";

	public DiBean(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void sayHello() {
		System.out.println("from Bean : " + name);
	}

}
