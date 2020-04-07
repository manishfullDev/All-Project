package com.primary.annon;

public class Player {
	private String playerName;

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	@Override
	public String toString() {
		return "Player [playerName=" + playerName + "]";
	}

}
