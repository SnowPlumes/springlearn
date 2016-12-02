package me.lv.spring.bean;

public class HelloBean {
	private String value;

	public HelloBean() {
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String greeting() {
		return "hello " + value;
	}

}
