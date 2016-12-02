package me.lv.spring.cglibproxy;

public class ProxyTest {
	public static void main(String[] args) {
		ProductDao productDao = new ProductDao();
		ProductDao proxy = new CGLibProxy(productDao).creatProxy();
		proxy.getName("xiaobai");
		proxy.getPrice(1);
	}
}
