package me.lv.spring.cglibproxy;

public class ProductDao{

	public String getName(String name) {
		System.out.println("name...");
		return name;
	}

	public double getPrice(double price) {
		System.out.println("price...");
		return price;
	}

}
