package com.aik.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aik.accessor.AgentAccessor;
import com.aik.bo.AgentBo;
import com.aik.config.PersistenceConfig;

public class AIKTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(PersistenceConfig.class);
		AgentAccessor agentAccessor = context.getBean("agentAccessor", AgentAccessor.class);
		AgentBo agent = new AgentBo(0, "Alex", 23, "Male", "39394804", "alex@gmail.com");
		int agentNo = agentAccessor.saveAgent(agent);
		System.out.println("agentNo : " + agentNo);
	}
}
