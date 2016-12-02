package me.lv.spring.cglibproxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class CGLibProxy implements MethodInterceptor {
	private ProductDao productDao;

	public CGLibProxy(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	public ProductDao creatProxy() {
		// ����������
		Enhancer enhancer = new Enhancer();
		// ���ø���
		enhancer.setSuperclass(productDao.getClass());
		// ���ûص�
		enhancer.setCallback(this);
		return (ProductDao) enhancer.create();
	}

	public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		if("getName".equals(method.getName())){
			System.out.println("before...");
			Object obj = methodProxy.invokeSuper(proxy, args);
			return obj;
		}
		return methodProxy.invokeSuper(proxy, args);
	}

}
