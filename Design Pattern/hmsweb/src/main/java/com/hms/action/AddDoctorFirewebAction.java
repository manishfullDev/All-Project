package com.hms.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fireweb.mvc.action.FirewebAction;

public class AddDoctorFirewebAction implements FirewebAction {
	@Override
	public String perform(HttpServletRequest req, HttpServletResponse resp) {
		String doctorName = null;

		doctorName = req.getParameter("doctorName");
		req.setAttribute("doctorName", doctorName);
		return "doctor-added";
	}

}
