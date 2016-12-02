package me.lv.spring.springaop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringTest extends TestCase {

	@Autowired
	@Qualifier("customerDaoProxy")
	private CustomerDao customerDao;

	@Test
	public void testAop() {
		customerDao.add();
		customerDao.delete();
		customerDao.search();
		customerDao.update();
	}
}
