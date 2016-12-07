package me.lv.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import me.lv.springmvc.pojo.Player;

@Controller
public class ItemController3 {

	@RequestMapping("/questPlayers.action")
	public ModelAndView questPlayers() throws Exception {

		List<Player> players = new ArrayList<Player>();

		Player player = new Player();
		player.setName("xiaobai");
		player.setPassword("123");
		player.setScore(88);

		Player player2 = new Player();
		player2.setName("xiaohei");
		player2.setPassword("567");
		player2.setScore(99);

		players.add(player);
		players.add(player2);

		// ����modelAndView׼��������ݡ�������ͼ
		ModelAndView modelAndView = new ModelAndView();

		// �������
		modelAndView.addObject("players", players);

		// ָ��ת����ҳ��
		modelAndView.setViewName("WEB-INF/jsp/player.jsp");

		return modelAndView;
	}

}
