package com.redbus.provider.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.redbus.provider.bo.BusProviderBo;
import com.redbus.provider.dao.BusProviderDao;

public class ListBusProvidersServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		BusProviderDao busProviderDao = null;
		List<BusProviderBo> busProviderBos = null;

		busProviderDao = new BusProviderDao();
		busProviderBos = busProviderDao.getBusProviders();
		req.setAttribute("busProviders", busProviderBos);
		req.getRequestDispatcher("/bus-providers.jsp").forward(req, resp);
	}
}








