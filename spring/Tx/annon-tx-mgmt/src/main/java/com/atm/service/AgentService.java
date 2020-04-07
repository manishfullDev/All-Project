package com.atm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.atm.bo.AddressBo;
import com.atm.bo.AgentBo;
import com.atm.dao.AddressDao;
import com.atm.dao.AgentDao;
import com.atm.exception.AddressNotFoundException;
import com.atm.form.AgentForm;

@Service
public class AgentService {
	@Autowired
	private AgentDao agentDao;
	@Autowired
	private AddressDao addressDao;

	@Transactional(readOnly = false, isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED, rollbackForClassName = {
			"com.atm.exception.AddressNotFoundException" })
	public void addAgent(AgentForm agentForm) throws AddressNotFoundException {
		int agentNo = 0;
		AgentBo agentBo = null;
		AddressBo addressBo = null;

		agentBo = new AgentBo(0, agentForm.getAgentName(), agentForm.getAge(), agentForm.getGender(),
				agentForm.getContactNo(), agentForm.getEmailAddress());
		agentNo = agentDao.saveAgent(agentBo);
		addressBo = new AddressBo(0, agentForm.getAddressLine1(), agentForm.getAddressLine2(), agentForm.getCity(),
				agentForm.getState(), agentForm.getZip(), agentForm.getCountry(), agentNo);
		addressDao.saveAddress(addressBo);
	}
}
