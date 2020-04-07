package com.transport.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.transport.controller.agent.AddAgentController;
import com.transport.form.agent.AgentForm;

public class DTest {
	public static void main(String[] args) {
		AgentForm agentForm = null;
		AddAgentController addAgentController = null;

		ApplicationContext context = new ClassPathXmlApplicationContext("com/transport/common/application-context.xml");
		agentForm = new AgentForm("Alex", 23, "Male", "938394794", "alex@gmail.com", "High Court Street", "2nd Lane",
				"Hyderabad", "TS", 39480, "India");
		addAgentController = context.getBean("addAgentController", AddAgentController.class);
		addAgentController.addAgent(agentForm);
	}
}

















