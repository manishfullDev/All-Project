package com.boot.leawy.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.massenger.service.MessageService;

@Component
public class ThreadService {
	@Autowired
	private MessageService messageService;

	public void createThread(String title) {
		messageService.text("039304", "title : " + title);
	}
}
