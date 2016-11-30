package me.lv.spring.beanref;

public class BeanWrapper {
	private DemoBean innerBean;
	private String name;

	public DemoBean getInnerBean() {
		return innerBean;
	}

	public void setInnerBean(DemoBean innerBean) {
		this.innerBean = innerBean;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void sayHello() {
		System.out.println("from bean wrapper : " + name);
	}

}
