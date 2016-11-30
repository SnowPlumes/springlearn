package me.lv.spring.factory;

public class StaticCarFactory {
	public static CarBean getCar(String brand) {
		CarBean car = new CarBean();
		car.setBrand(brand);
		return car;
	}
}
