package com.ca.test;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ca.accessor.BusProviderAccessor;
import com.ca.bo.BusProviderBo;

public class CATest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ca/common/application-context.xml");
		BusProviderAccessor accessor = context.getBean("busProviderAccessor", BusProviderAccessor.class);
		/*
		 * List<BusProviderBo> busProviderBos = accessor.searchBusProviders("ara");
		 * 
		 * 
		 * for(BusProviderBo bo : busProviderBos) { System.out.println(bo); }
		 */
		BusProviderBo bo = new BusProviderBo(3, "Kesineni", new Date(), "3938394", "contactus@kesineni.com", "A");
		accessor.saveBusProvider(bo);
	}
}














