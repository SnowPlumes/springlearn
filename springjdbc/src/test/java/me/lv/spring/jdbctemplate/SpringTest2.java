package me.lv.spring.jdbctemplate;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringTest2 {

	@Autowired
	@Qualifier("userDao")
	private UserDao userDao;

	@Test
	public void testAdd() {
		User user = new User();
		user.setName("doubi");
		user.setUsername("doubi");
		user.setPassword("123");
		userDao.add(user);
	}

	@Test
	public void testDelete() {
		User user = new User();
		user.setId(10);
		userDao.delete(user);
	}

	@Test
	public void testUpdate() {
		User user = new User();
		user.setName("xiaobai");
		user.setId(9);
		userDao.update(user);
	}

	@Test
	public void testFindNameById() {
		System.out.println(userDao.findNameById(1));
	}

	@Test
	public void testFindById() {
		System.out.println(userDao.findById(1));
	}

	@Test
	public void testFindAll() {
		List<User> users = userDao.findAll();
		for (User user : users) {
			System.out.println(user);
		}
	}
}
