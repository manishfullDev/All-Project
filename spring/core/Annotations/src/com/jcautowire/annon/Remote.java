package com.jcautowire.annon;

// no source code
public class Remote {
	private Toy toy;

	public Remote(Toy toy) {
		super();
		this.toy = toy;
	}

	public void on() {
		toy.play();
	}

}
