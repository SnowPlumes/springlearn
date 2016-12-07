package me.lv.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import me.lv.springmvc.pojo.Player;

public class ItemController implements Controller {

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		List<Player> players = new ArrayList<Player>();

		Player player = new Player();
		player.setName("xiaobai");
		player.setPassword("123");
		player.setScore(90);

		Player player2 = new Player();
		player2.setName("xiaohei");
		player2.setPassword("567");
		player2.setScore(99);

		players.add(player);
		players.add(player2);

		// 创建modelAndView准备填充数据、设置视图
		ModelAndView modelAndView = new ModelAndView();

		// 填充数据
		modelAndView.addObject("players", players);

		// 指定转发的页面
		modelAndView.setViewName("WEB-INF/jsp/player.jsp");
		
		return modelAndView;
	}

}
