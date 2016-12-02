package me.lv.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.lv.spring.bean.HelloBean;

@Service
public class GreetingSercice {

	@Autowired
	private HelloBean helloBean;

	public String greeting() {
		return helloBean.greeting();
	}
}
