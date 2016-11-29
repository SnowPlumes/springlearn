package me.lv.spring.springlearn;

import javax.sql.DataSource;

public class DataBase {
	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

}
