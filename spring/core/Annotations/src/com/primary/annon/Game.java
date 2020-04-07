package com.primary.annon;

public class Game {
	private Player player;

	public void setPlayer(Player player) {
		this.player = player;
	}

	@Override
	public String toString() {
		return "Game [player=" + player + "]";
	}

}
