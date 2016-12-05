package me.lv.spring.aspectjxml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:aspectj2.xml")
public class SpringTest {

	@Autowired
	@Qualifier("productDao")
	private ProductDao productDao;

	@Test
	public void test() {
		productDao.add();
		productDao.delete();
		productDao.update();
		productDao.find();
	}

}
