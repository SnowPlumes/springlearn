package me.lv.spring.transaction3;

public interface AccountDao {
	public abstract void out(String from, double money);

	public abstract void in(String to, double money);
}
