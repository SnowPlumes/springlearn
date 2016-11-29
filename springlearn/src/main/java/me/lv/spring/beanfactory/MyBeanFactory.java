package me.lv.spring.beanfactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class MyBeanFactory {

	private List<MyBeanDefintion> beanDefintions;
	private Map<String, Object> singletonBeans;
	private Map<String, MyBeanDefintion> prototypeBeans;

	public MyBeanFactory() {
		beanDefintions = new ArrayList<MyBeanDefintion>();
		singletonBeans = new HashMap<String, Object>();
		prototypeBeans = new HashMap<String, MyBeanDefintion>();
		parse();
		resolveBeanDefinitions();
	}

	public Object getBean(String beanName) {
		if (singletonBeans.containsKey(beanName)) {
			return singletonBeans.get(beanName);
		}

		MyBeanDefintion beanDefintion = prototypeBeans.get(beanName);
		if (beanDefintion != null) {
			String className = beanDefintion.getClassName();
			try {
				return Class.forName(className).newInstance();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}

		throw new RuntimeException("Invalid bean name" + beanName);
	}

	@SuppressWarnings("unchecked")
	public <T> T getBean(String beanName, Class<T> clazz) {
		Object bean = getBean(beanName);
		if (bean.getClass().equals(clazz)) {
			return (T) bean;
		}
		throw new RuntimeException("The Class is not match the bean class! Expecting the class: " + clazz
				+ ", but actually get" + bean.getClass());
	}

	public void parse() {
		SAXBuilder builder = new SAXBuilder();

		try {
			Document document = builder.build(new File("mybean.xml"));
			Element root = document.getRootElement();
			List<Element> beanElements = root.getChildren("bean");

			for (Element element : beanElements) {
				String id = element.getAttributeValue("id");
				String clazz = element.getAttributeValue("class");
				String singleton = element.getAttributeValue("singleton");

				MyBeanDefintion defintion = new MyBeanDefintion();
				defintion.setName(id);
				defintion.setClassName(clazz);

				if (singleton != null) {
					try {
						boolean isSingleton = Boolean.parseBoolean(singleton);
						defintion.setSingleton(isSingleton);
					} catch (Exception e) {
					}
				}

				beanDefintions.add(defintion);
			}
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void resolveBeanDefinitions() {
		for (MyBeanDefintion defintion : beanDefintions) {
			String id = defintion.getName();

			if (defintion.isSingleton()) {
				String className = defintion.getClassName();

				Class<?> clazz;
				try {
					clazz = Class.forName(className);
					Object instance = clazz.newInstance();
					this.singletonBeans.put(id, instance);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (InstantiationException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			} else {
				prototypeBeans.put(id, defintion);
			}
		}

	}

}
