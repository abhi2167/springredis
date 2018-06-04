package com.springboot.redis.springredis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.redis.springredis.dao.GameRepository;
import com.springboot.redis.springredis.types.Game;

@Service
public class GameServiceImpl implements GameService {

	@Autowired
	private GameRepository gameRespository;
	
	@Override
	public Game getGame(String id) {
		return gameRespository.getGame(id);
	}

	@Override
	public List<Game> getAllGames() {
		return null;
	}

	@Override
	public boolean addGame(Game game) {
		gameRespository.addGame(game);
		return true;
	}

	@Override
	public boolean deleteGame(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateGame(String id, Game game) {
		// TODO Auto-generated method stub
		return false;
	}

}
