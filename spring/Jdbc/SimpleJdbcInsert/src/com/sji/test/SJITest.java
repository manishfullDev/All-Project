package com.sji.test;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sji.accessor.BusProviderAccessor;
import com.sji.bo.BusProviderBo;
import com.sji.config.PersistenceConfig;

public class SJITest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(PersistenceConfig.class);
		BusProviderAccessor accessor = context.getBean("busProviderAccessor", BusProviderAccessor.class);
		/*
		 * BusProviderBo bo = new BusProviderBo(12, "Magic Travels", new Date(),
		 * "39383084", "magic@logic.com", "A"); int r = accessor.saveBusProvider(bo);
		 * System.out.println("records inserted : " + r);
		 */
		int sum = accessor.add(10, 20);
		System.out.println("sum : " + sum);
	}
}


















