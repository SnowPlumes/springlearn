package me.lv.spring.factory;

public class CarBean {
	private String brand = "brand";
	private String model = "model";

	public CarBean() {
		super();
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "CarBean [brand=" + brand + ", model=" + model + "]";
	}

}
