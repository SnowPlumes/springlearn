package me.lv.springmvc.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

import me.lv.springmvc.pojo.Player;

public class ItemController2 implements HttpRequestHandler {

	public void handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Player> players = new ArrayList<Player>();

		Player player = new Player();
		player.setName("xiaobai");
		player.setPassword("123");
		player.setScore(99);

		Player player2 = new Player();
		player2.setName("xiaohei");
		player2.setPassword("567");
		player2.setScore(99);

		players.add(player);
		players.add(player2);

		request.setAttribute("players", players);

		request.getRequestDispatcher("WEB-INF/jsp/player.jsp").forward(request, response);
	}

}
