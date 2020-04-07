package com.hms.test;

import java.util.List;

import com.hms.bo.BusProviderBo;
import com.hms.dao.BusProviderDao;

public class Test {
	public static void main(String[] args) {
		BusProviderDao dao = new BusProviderDao();
		List<BusProviderBo> bps = (List<BusProviderBo>) dao.getBusProviders();
		for (BusProviderBo bo : bps) {
			System.out.println(bo);
		}
	}
}
