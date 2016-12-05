package me.lv.spring.jdbctemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class UserDao extends JdbcDaoSupport {

	public void add(User user) {
		String sql = "INSERT INTO `player` (name, username, password) VALUES (?, ?, ?);";
		this.getJdbcTemplate().update(sql, user.getName(), user.getUsername(), user.getPassword());
	}

	public void delete(User user) {
		String sql = "delete from player where id = ?";
		this.getJdbcTemplate().update(sql, user.getId());
	}

	public void update(User user) {
		String sql = "update player set name = ? where id = ?";
		this.getJdbcTemplate().update(sql, user.getName(), user.getId());
	}

	public String findNameById(int userId) {
		String sql = "select name from player where id = ?";
		return this.getJdbcTemplate().queryForObject(sql, String.class, userId);
	}

	public User findById(int id) {
		String sql = "select * from player where id = ?";
		User user = (User) this.getJdbcTemplate().queryForObject(sql, new UserRowMapper(), id);
		return user;
	}

	public List<User> findAll(){
		String sql = "select * from player";
		return this.getJdbcTemplate().query(sql,new UserRowMapper());
	}
	
	class UserRowMapper implements RowMapper<User> {
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			User user = new User();
			user.setId(rs.getInt("id"));
			user.setName(rs.getString("name"));
			user.setUsername(rs.getString("username"));
			user.setPassword(rs.getString("password"));
			return user;
		}
	}

}
