package com.npjt.test;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.npjt.accessor.BusProviderAccessor;
import com.npjt.bo.BusProviderBo;
import com.npjt.config.PersistenceConfig;

public class NPJTTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(PersistenceConfig.class);
		BusProviderAccessor accessor = context.getBean("busProviderAccessor", BusProviderAccessor.class);
		/*
		 * String businessName = accessor.getBusinessNameById(5);
		 * System.out.println("business name : "+ businessName);
		 */

		/*
		 * List<BusProviderBo> busProviders =
		 * accessor.getBusProvidersByContactNoOrEmailAddress("92839379",
		 * "qt@gmail.com"); for(BusProviderBo bo : busProviders) {
		 * System.out.println(bo); }
		 */
		BusProviderBo bo = new BusProviderBo(11, "King Travels", new Date(), "93839484", "contactus@kt.com", "A");
		accessor.saveBusProvider(bo);
	}
}












