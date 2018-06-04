package com.springboot.redis.springredis.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.redis.springredis.service.GameService;
import com.springboot.redis.springredis.types.Game;

@RestController
public class GameController {

	@Autowired
	private GameService gameService;
	
	
	@RequestMapping(value = "/games", method = RequestMethod.GET)
	public List<Game> getMoives() {
		return gameService.getAllGames();
	}
	
	@RequestMapping(value = "/game", method = RequestMethod.POST)
	public String addMovie(@RequestBody Game game) {
		gameService.addGame(game);
		return "success";
	}
	
	@RequestMapping(value = "/game", method = RequestMethod.GET)
	public Game getGame(@RequestParam String id) {
		return gameService.getGame(id);
	}
}
