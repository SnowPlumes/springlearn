package me.lv.spring.mybeanfactory;

public class MyBeanDefintion {

	private String name;
	private String className;
	private boolean singleton = true;

	public MyBeanDefintion() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public boolean isSingleton() {
		return singleton;
	}

	public void setSingleton(boolean singleton) {
		this.singleton = singleton;
	}

}
