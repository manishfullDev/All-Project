package com.transport.controller.agent;

import com.transport.form.agent.AgentForm;
import com.transport.service.agent.AgentService;

public class AddAgentController {
	private AgentService agentService;

	public void addAgent(AgentForm agentForm) {
		agentService.addAgent(agentForm);
		System.out.println("agent added");
	}

	public void setAgentService(AgentService agentService) {
		this.agentService = agentService;
	}

}
