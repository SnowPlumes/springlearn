package me.lv.spring.springaop;

public class CustomerDaoImpl implements CustomerDao {

	public void add() {
		System.out.println("add...");
	}

	public void update() {
		System.out.println("update...");
	}

	public void search() {
		System.out.println("search...");
	}

	public void delete() {
		System.out.println("delete...");
	}

}
