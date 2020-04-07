package org.fireweb.mvc.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface FirewebAction {
	String perform(HttpServletRequest req, HttpServletResponse resp);
}
