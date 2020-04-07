package com.qba.test;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.qba.accessor.BusProviderAccessor;
import com.qba.bo.BusProviderBo;
import com.qba.bo.BusProviderWithJourneyBo;
import com.qba.config.PersistenceConfig;

public class QBATest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(PersistenceConfig.class);
		BusProviderAccessor accessor = context.getBean("busProviderAccessor", BusProviderAccessor.class);
		/*
		 * int c = accessor.getNoOfBusProviders(); System.out.println("count : " + c);
		 */
		/*
		 * String providerName = accessor.getBusinessNameByProviderId(2);
		 * System.out.println("provider : " + providerName);
		 */

		/*
		 * BusProviderBo bo = accessor.findBusProvider(3); System.out.println(bo);
		 */
		/*
		 * List<BusProviderBo> busProviders = accessor.getBusProviders();
		 * for(BusProviderBo bo : busProviders) { System.out.println(bo); }
		 */

		/*
		 * BusProviderBo bo = new BusProviderBo(4, "Dhanunjaya", new Date(), "9383948",
		 * "contactus@dhanunjaya.com", "A"); int r = accessor.saveBusProvider(bo);
		 * System.out.println("inserted records : "+ r);
		 */

		/*
		 * List<BusProviderWithJourneyBo> busProviderWithJourneyBos =
		 * accessor.getBusProvidersWithJourneys(); for(BusProviderWithJourneyBo bo :
		 * busProviderWithJourneyBos) { System.out.println(bo); }
		 */
		List<BusProviderBo> busProviders = accessor.getBusProvidersByPagination(3, 4);

		for (BusProviderBo bo : busProviders) {
			System.out.println(bo);
		}
	}
}
