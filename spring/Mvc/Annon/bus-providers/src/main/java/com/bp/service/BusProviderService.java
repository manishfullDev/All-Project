package com.bp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bp.bo.BusProviderBo;
import com.bp.dao.BusProviderDao;
import com.bp.dto.BusProviderDto;

@Service
public class BusProviderService {
	@Autowired
	private BusProviderDao busProviderDao;

	@Transactional(readOnly = true)
	public List<BusProviderDto> getActiveBusProviders() {
		List<BusProviderBo> busProviderBos = null;
		List<BusProviderDto> busProviderDtos = null;

		busProviderBos = busProviderDao.getBusProviderWithActiveStatus();
		busProviderDtos = new ArrayList<BusProviderDto>();
		for (BusProviderBo bo : busProviderBos) {
			busProviderDtos.add(new BusProviderDto(bo.getBusProviderId(), bo.getBusinessName()));
		}

		return busProviderDtos;
	}
}
