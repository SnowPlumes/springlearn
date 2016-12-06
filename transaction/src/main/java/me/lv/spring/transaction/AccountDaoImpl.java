package me.lv.spring.transaction;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

	public void out(String from, double money) {
		String sql = "update player set score = score - ? where name = ?";
		this.getJdbcTemplate().update(sql, money, from);
	}

	public void in(String to, double money) {
		String sql = "update player set score = score + ? where name = ?";
		this.getJdbcTemplate().update(sql, money, to);
	}

}
