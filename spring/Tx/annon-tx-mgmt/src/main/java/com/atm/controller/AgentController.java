package com.atm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.atm.exception.AddressNotFoundException;
import com.atm.form.AgentForm;
import com.atm.service.AgentService;

@Controller
public class AgentController {
	@Autowired
	private AgentService agentService;

	public void addAgent(AgentForm agentForm) throws AddressNotFoundException {
		agentService.addAgent(agentForm);
	}
}
