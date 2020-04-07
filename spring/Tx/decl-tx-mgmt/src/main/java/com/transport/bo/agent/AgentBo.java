package com.transport.bo.agent;

import java.io.Serializable;

public class AgentBo implements Serializable {
	protected int agentNo;
	protected String agentName;
	protected int age;
	protected String gender;
	protected String contactNo;
	protected String emailAddress;

	public AgentBo() {
		super();
	}

	public AgentBo(int agentNo, String agentName, int age, String gender, String contactNo, String emailAddress) {
		this.agentNo = agentNo;
		this.agentName = agentName;
		this.age = age;
		this.gender = gender;
		this.contactNo = contactNo;
		this.emailAddress = emailAddress;
	}

	public int getAgentNo() {
		return agentNo;
	}

	public void setAgentNo(int agentNo) {
		this.agentNo = agentNo;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}
