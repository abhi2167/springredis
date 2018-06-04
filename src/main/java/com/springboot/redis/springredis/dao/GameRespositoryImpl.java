package com.springboot.redis.springredis.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.springboot.redis.springredis.types.Game;

@Repository
public class GameRespositoryImpl implements GameRepository {

	@Autowired
    private RedisTemplate<String, Game> redisTemplate;

	@Override
	public Game getGame(String id) {
		Game game = (Game) redisTemplate.opsForValue().get(id);
		return game;
	}

	@Override
	public List<Game> getAllGames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addGame(Game game) {
		redisTemplate.opsForValue().set(game.getId(), game);
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
