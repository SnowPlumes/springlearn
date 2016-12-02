package me.lv.spring.jdkproxy;

public class ProxyTest {
	public static void main(String[] args) {
		UserService service = new UserServiceImpl();
		UserService proxy = new JDKProxy(service).creatProxy();

		proxy.getName("xiaobai");
		proxy.getAge(12);
	}
}
