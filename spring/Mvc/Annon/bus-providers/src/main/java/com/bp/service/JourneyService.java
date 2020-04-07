package com.bp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bp.bo.JourneyDetailBo;
import com.bp.bo.TicketBo;
import com.bp.bo.TravelCriteriaBo;
import com.bp.dao.JourneyDao;
import com.bp.dto.JourneyDto;
import com.bp.form.PlanTravelForm;
import com.bp.form.TicketForm;

@Service
public class JourneyService {
	@Autowired
	private JourneyDao journeyDao;

	@Transactional(readOnly = true)
	public List<JourneyDto> getMatchingJourneys(PlanTravelForm planTravelForm) {
		TravelCriteriaBo travelCriteriaBo = null;
		List<JourneyDetailBo> journeyDetailBos = null;
		List<JourneyDto> matchingJourneyDtos = null;

		travelCriteriaBo = new TravelCriteriaBo();
		travelCriteriaBo.setBusProviderId(planTravelForm.getBusProviderId());
		travelCriteriaBo.setSource(planTravelForm.getSource());
		travelCriteriaBo.setDestination(planTravelForm.getDestination());
		travelCriteriaBo.setTravelDate(planTravelForm.getTravelDate());
		travelCriteriaBo.setMinPrice(planTravelForm.getMinPrice());
		travelCriteriaBo.setMaxPrice(planTravelForm.getMaxPrice());

		journeyDetailBos = journeyDao.getJourneys(travelCriteriaBo);
		matchingJourneyDtos = new ArrayList<JourneyDto>();
		for (JourneyDetailBo bo : journeyDetailBos) {
			matchingJourneyDtos.add(mapJourneyDetailsBoToJourneyDto(bo));
		}

		return matchingJourneyDtos;
	}

	public JourneyDto getJourney(int journeyId) {
		JourneyDetailBo journeyDetailBo = null;
		JourneyDto journeyDto = null;

		journeyDetailBo = journeyDao.getJourney(journeyId);
		journeyDto = mapJourneyDetailsBoToJourneyDto(journeyDetailBo);

		return journeyDto;
	}

	public int bookTicket(TicketForm form) {
		TicketBo ticketBo = null;
		int ticketNo = 0;

		ticketBo = new TicketBo();
		ticketBo.setJourneyId(form.getJourneyId());
		ticketBo.setPassengerName(form.getPassengerName());
		ticketBo.setAge(form.getAge());
		ticketBo.setGender(form.getGender());
		ticketBo.setMobileNo(form.getMobileNo());
		ticketBo.setEmailAddress(form.getEmailAddress());
		ticketBo.setPrice(form.getPrice());
		ticketBo.setSeatNo(1);
		
		ticketNo = journeyDao.saveTicket(ticketBo);

		return ticketNo;
	}

	private JourneyDto mapJourneyDetailsBoToJourneyDto(JourneyDetailBo bo) {
		JourneyDto journeyDto = null;

		journeyDto = new JourneyDto(bo.getJourneyId(), bo.getSource(), bo.getDestination(), bo.getJourneyDate(),
				bo.getBusProvider().getBusinessName(), bo.getCost());
		journeyDto.setBusProviderId(bo.getBusProvider().getBusProviderId());
		return journeyDto;
	}
}
