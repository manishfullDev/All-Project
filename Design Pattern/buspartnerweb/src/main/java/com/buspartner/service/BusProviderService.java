package com.buspartner.service;

import java.util.ArrayList;
import java.util.List;

import com.buspartner.bo.BusProviderBo;
import com.buspartner.dao.BusProviderDao;
import com.buspartner.dto.BusProviderDto;

public class BusProviderService {

	public List<BusProviderDto> getBusProviders(int pageNo, int pageSize) throws Exception {
		List<BusProviderBo> busProviderBos = null;
		List<BusProviderDto> busProviderDtos = null;
		BusProviderDao busProviderDao = null;

		busProviderDao = new BusProviderDao();
		busProviderBos = busProviderDao.getBusProviders(pageNo, pageSize);
		busProviderDtos = new ArrayList<BusProviderDto>();

		for (BusProviderBo bo : busProviderBos) {
			busProviderDtos.add(new BusProviderDto(bo.getBusinessName(), bo.getContactNo(), bo.getEmailAddress()));
		}

		return busProviderDtos;
	}

	public int getNoOfBusProviders() throws Exception {
		BusProviderDao dao = null;
		dao = new BusProviderDao();
		return dao.getNoOfBusProviders();
	}

}
