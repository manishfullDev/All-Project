package com.msosc.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.msosc.accessor.BusProviderAccessor;
import com.msosc.bo.BusProviderBo;
import com.msosc.config.PersistenceConfig;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;

public class MSOSCTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(PersistenceConfig.class);
		BusProviderAccessor accessor = context.getBean("busProviderAccessor", BusProviderAccessor.class);
		/*
		 * List<BusProviderBo> providers = accessor.getBusProviders(new Date(), new
		 * Date()); for(BusProviderBo bo :providers) { System.out.println(bo); }
		 */
		int r = accessor.updateBusinessNameByBusProviderId(12, "Super Magic Travels");
		System.out.println(r);
	}
}
