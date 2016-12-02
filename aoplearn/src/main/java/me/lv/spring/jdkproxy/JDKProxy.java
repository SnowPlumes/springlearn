package me.lv.spring.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy implements InvocationHandler {
	private UserService service;

	public JDKProxy(UserService service) {
		super();
		this.service = service;
	}

	public UserService creatProxy() {
		UserService proxy = (UserService) Proxy.newProxyInstance(service.getClass().getClassLoader(),
				service.getClass().getInterfaces(), this);
		return proxy;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if ("getName".equals(method.getName())) {
			System.out.println("bufore...");
			Object result = method.invoke(service, args);
			System.out.println("after...");
			return result;
		}
		return method.invoke(service, args);
	}

}
