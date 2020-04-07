package com.views.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.views.dto.BusProvidersDto;

public class SearchBusProvidersController extends AbstractController {
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String page = "search-bus-providers";
		Date fromDate = null;
		Date toDate = null;
		String viewType = null;
		SimpleDateFormat sdf = null;
		ModelAndView modelAndView = null;
		List<BusProvidersDto> busProvidersDtos = null;

		sdf = new SimpleDateFormat("dd-mm-yyyy");

		fromDate = sdf.parse(request.getParameter("fromDate"));
		toDate = sdf.parse(request.getParameter("toDate"));
		viewType = request.getParameter("view");

		modelAndView = new ModelAndView();
		busProvidersDtos = new ArrayList<BusProvidersDto>();
		busProvidersDtos.add(new BusProvidersDto("Kaleswara Travels", "9849373947", "contactus@kaleswara.com"));
		busProvidersDtos.add(new BusProvidersDto("Yatra Genie", "04840484", "reach@yatra.in"));
		busProvidersDtos.add(new BusProvidersDto("Morning Star", "3535353", "reach@morningstar.in"));
		busProvidersDtos.add(new BusProvidersDto("Orange Travels", "353564646", "reach@orange.in"));
		busProvidersDtos.add(new BusProvidersDto("SRS Travels", "447453535", "reach@srs.in"));
		busProvidersDtos.add(new BusProvidersDto("Dhanunjaya Travels", "96867464636", "reach@dhanunjaya.in"));

		modelAndView.addObject("busProviders", busProvidersDtos);

		modelAndView.addObject("fromDate", fromDate);
		modelAndView.addObject("toDate", toDate);
		if (viewType != null) {
			if (viewType.equals("xls")) {
				page = "search-bus-providers-xls";
			} else if (viewType.equals("pdf")) {
				page = "search-bus-providers-pdf";
			}
		}

		modelAndView.setViewName(page);
		return modelAndView;
	}

}
