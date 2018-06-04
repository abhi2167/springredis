package com.springboot.redis.springredis.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import com.springboot.redis.springredis.types.Game;

@Configuration
public class RedisConfiguration {

	@Bean
	public JedisConnectionFactory getJedisConnector() {
		JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory();
		return jedisConnectionFactory;
	}
	
	@Bean
	@Autowired
	public RedisTemplate<String, Game> getRedisTemplate(JedisConnectionFactory jedisConnectionFactory) {
		final RedisTemplate<String, Game> template = new RedisTemplate<String, Game>();
	    template.setConnectionFactory(jedisConnectionFactory);
	    template.setKeySerializer( new StringRedisSerializer() );
	    template.setHashValueSerializer( new Jackson2JsonRedisSerializer<>(Game.class) );
	    template.setValueSerializer( new Jackson2JsonRedisSerializer<>(Game.class) );
	    return template;
	}
}
