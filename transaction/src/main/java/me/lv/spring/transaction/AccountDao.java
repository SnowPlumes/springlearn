package me.lv.spring.transaction;

public interface AccountDao {
	public abstract void out(String from, double money);

	public abstract void in(String to, double money);
}
