package com.massenger.service.autoconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.massenger.service.MessageService;

@Configuration
@ConditionalOnClass({ MessageService.class })
public class MassengerServiceAutoConfiguration {
	@Autowired
	private Environment env;

	@Bean
	public MessageService messageService() {
		MessageService messageService = null;
		messageService = new MessageService();

		messageService.setProviderId(env.getProperty("providerId"));
		messageService.setCircle(env.getProperty("circle"));
		messageService.setSecret(env.getProperty("secret"));
		messageService.setUniqueIdentificationCode(env.getProperty("unic"));

		return messageService;
	}
}
