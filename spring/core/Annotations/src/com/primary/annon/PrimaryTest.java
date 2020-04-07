package com.primary.annon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrimaryTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(PrimaryConfig.class);

		Game game = context.getBean("game", Game.class);
		System.out.println(game);
	}
}
