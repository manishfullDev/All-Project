package com.transport.service.agent;

import com.transport.bo.agent.AddressBo;
import com.transport.bo.agent.AgentBo;
import com.transport.dao.agent.AddressDao;
import com.transport.dao.agent.AgentDao;
import com.transport.form.agent.AgentForm;

public class AgentService {
	private AgentDao agentDao;
	private AddressDao addressDao;

	public void addAgent(AgentForm agentForm) {
		AgentBo agentBo = null;
		AddressBo addressBo = null;

		agentBo = new AgentBo(0, agentForm.getAgentName(), agentForm.getAge(), agentForm.getGender(),
				agentForm.getContactNo(), agentForm.getEmailAddress());
		int agentNo = agentDao.saveAgent(agentBo);
		addressBo = new AddressBo(0, agentForm.getAddressLine1(), agentForm.getAddressLine2(), agentForm.getCity(),
				agentForm.getState(), agentForm.getZip(), agentForm.getCountry(), agentNo);
		addressDao.saveAddress(addressBo);
	}

	public void setAgentDao(AgentDao agentDao) {
		this.agentDao = agentDao;
	}

	public void setAddressDao(AddressDao addressDao) {
		this.addressDao = addressDao;
	}

}
