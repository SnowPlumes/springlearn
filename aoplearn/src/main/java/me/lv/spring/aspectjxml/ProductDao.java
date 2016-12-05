package me.lv.spring.aspectjxml;

public class ProductDao {
	public int add() {
		System.out.println("add...");
		return 1;
	}

	public int update() {
		System.out.println("update...");
		return 1;
	}

	public void delete() {
		System.out.println("delete...");
	}

	public void find() {
		System.out.println("find...");
	}
}
