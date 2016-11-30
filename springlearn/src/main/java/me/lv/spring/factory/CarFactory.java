package me.lv.spring.factory;

public class CarFactory {
	public CarBean getCar(String brand, String model) {
		CarBean car = new CarBean();
		car.setBrand(brand);
		car.setModel(model);
		return car;
	}
}
