package com.stereotype.annon;

import org.springframework.web.bind.annotation.RestController;

@RestController("messageBox")
public class Chatbox {

	public Chatbox() {
		System.out.println("Chatbox()");
	}

	public void message(String message) {
		System.out.println(message);
	}
}
