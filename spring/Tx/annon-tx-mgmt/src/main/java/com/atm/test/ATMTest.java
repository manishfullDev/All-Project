package com.atm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atm.config.AppConfig;
import com.atm.controller.AgentController;
import com.atm.exception.AddressNotFoundException;
import com.atm.form.AgentForm;

public class ATMTest {
	public static void main(String[] args) throws AddressNotFoundException {
		AgentForm agentForm = null;
		AgentController agentController = null;

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		agentForm = new AgentForm("Alex", 23, "Male", "938394794", "alex@gmail.com", "High Court Street", "2nd Lane",
				"Hyderabad", "TS", 39480, "India");
		agentController = context.getBean("agentController", AgentController.class);
		agentController.addAgent(agentForm);
	}
}
