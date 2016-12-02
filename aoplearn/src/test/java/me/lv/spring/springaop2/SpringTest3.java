package me.lv.spring.springaop2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import me.lv.spring.springaop.CustomerDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext3.xml")
public class SpringTest3 {

	@Autowired
	@Qualifier("customerDao")
	private CustomerDao customerDao;

	@Autowired
	@Qualifier("orderDao")
	private OrderDao orderDao;

	@Test
	public void test() {
		customerDao.add();
		customerDao.delete();
		orderDao.add();
		orderDao.delete();
	}

}
