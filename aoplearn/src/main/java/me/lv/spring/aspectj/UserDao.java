package me.lv.spring.aspectj;

public class UserDao {
	public void add() {
		System.out.println("add...");
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
		// int i = 1 / 0;
	}

}
