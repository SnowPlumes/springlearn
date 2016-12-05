package me.lv.spring.aspectj;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:aspectj.xml")
public class SpringTest {

	@Autowired
	@Qualifier("userDao")
	private UserDao userDao;

	@Test
	public void test() {
		userDao.add();
		userDao.delete();
		userDao.update();
		userDao.find();
	}

}
