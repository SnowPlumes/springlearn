package me.lv.spring.servlet;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import me.lv.spring.service.GreetingSercice;

public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		WebApplicationContext applicationContext = WebApplicationContextUtils
				.getWebApplicationContext(getServletContext());

		GreetingSercice greetingService = applicationContext.getBean(GreetingSercice.class);

		OutputStream stream = resp.getOutputStream();
		stream.write(greetingService.greeting().getBytes());
		stream.flush();
		stream.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
