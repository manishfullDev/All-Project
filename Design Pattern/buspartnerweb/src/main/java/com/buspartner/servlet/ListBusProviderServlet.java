package com.buspartner.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.buspartner.dto.BusProviderDto;
import com.buspartner.service.BusProviderService;

@WebServlet(urlPatterns = { "/busProviders" })
public class ListBusProviderServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = null;
		int pageNo = 0;
		int pageSize = 5;
		int totalRecords = 0;
		int totalPages = 0;
		List<BusProviderDto> busProviderDtos = null;
		BusProviderService busProviderService = null;

		busProviderService = new BusProviderService();
		action = req.getParameter("action");

		if (action == null) {
			pageNo = 1;
		} else if (action.equals("next")) {
			pageNo = Integer.parseInt(req.getParameter("pageNo"));
			pageNo += 1;
		} else if (action.equals("prev")) {
			pageNo = Integer.parseInt(req.getParameter("pageNo"));
			pageNo -= 1;
		}
		try {
			busProviderDtos = busProviderService.getBusProviders(pageNo, pageSize);
			totalRecords = busProviderService.getNoOfBusProviders();
			totalPages = (int) Math.ceil((float) totalRecords / pageSize);

			req.setAttribute("busProviders", busProviderDtos);
			req.setAttribute("pageNo", pageNo);
			req.setAttribute("totalPages", totalPages);
			req.getRequestDispatcher("/busProviders.jsp").forward(req, resp);
		} catch (Exception e) {
			throw new ServletException(e);
		}

	}

}
