package me.lv.spring.transaction;

public interface AccountService {
	public void transfer(String from, String to, double money);
}
