package com.primary.annon;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:com/primary/annon/players.properties")
public class PrimaryConfig {
	@Autowired
	private Environment env;

	@Bean
	@Primary
	public Player player1() {
		Player player = new Player();
		player.setPlayerName(env.getProperty("player1.playerName"));
		return player;
	}

	@Bean
	public Player player2() {
		Player player = new Player();
		player.setPlayerName(env.getProperty("player2.playerName"));
		return player;
	}

	@Bean(autowire = Autowire.BY_TYPE)
	public Game game() {
		return new Game();
	}

}
