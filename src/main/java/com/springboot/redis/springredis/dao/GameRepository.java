package com.springboot.redis.springredis.dao;

import java.util.List;

import com.springboot.redis.springredis.types.Game;

public interface GameRepository {
	
	public Game getGame(String id);
	
	public List<Game> getAllGames();
	
	public boolean addGame(Game game);
	
	public boolean deleteGame(String id);
	
	public boolean updateGame(String id, Game game);

}
