package com.fh.test;

import com.fh.accessor.ServiceAdvisorAccessor;
import com.fh.entities.ServiceAdvisor;

public class FHTest {
	public static void main(String[] args) {
		ServiceAdvisorAccessor accessor = null;
		ServiceAdvisor serviceAdvisor = null;
		
		accessor = new ServiceAdvisorAccessor();
		serviceAdvisor = accessor.getServiceAdvisor(1);
		System.out.println(serviceAdvisor);
	}
}
