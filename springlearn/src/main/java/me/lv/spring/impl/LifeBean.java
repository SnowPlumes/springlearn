package me.lv.spring.impl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class LifeBean implements BeanNameAware, BeanPostProcessor, BeanFactoryAware, InitializingBean, DisposableBean {

	public void destroy() throws Exception {
		System.out.println("destory");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
	}

	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("setBeanFactory");
	}

	public void setBeanName(String arg0) {
		System.out.println("setBeanName");
	}

	public void init() {
		System.out.println("init");
	}

	public void close() {
		System.out.println("close");
	}

}
