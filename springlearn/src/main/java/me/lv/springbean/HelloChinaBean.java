package me.lv.springbean;

public class HelloChinaBean {
	private String message = "helloChina_message1";
	private String message2 = "helloChina_meaasge2";

	public HelloChinaBean() {
		super();
	}

	public void sayHelloWorld() {
		System.out.println(message);
	}

	public void sayHello() {
		System.out.println(message2);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage2() {
		return message2;
	}

	public void setMessage2(String message2) {
		this.message2 = message2;
	}

	public void init() {
		System.out.println("helloCina init...");
	}

	public void destory() {
		System.out.println("helloChina destory...");
	}

}
