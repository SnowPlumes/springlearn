package me.lv.spring.transaction2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")
public class SpringTest {

	@Autowired
	@Qualifier("accountServiceProxy")
	private AccountService accountService;

	@Test
	public void test() {
		accountService.transfer("Ð¡ºÚ", "Ð¡°×", 10);
	}
}