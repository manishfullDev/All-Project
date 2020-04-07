package org.fireweb.mvc.helper;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fireweb.mvc.config.FirewebMetadataContext;
import org.fireweb.mvc.exception.FirewebViewRenderFailedException;

public class Dispatcher {
	public void dispatch(HttpServletRequest req, HttpServletResponse resp, String outcome,
			FirewebMetadataContext context) {
		String page = null;

		page = context.getView(outcome);
		try {
			req.getRequestDispatcher(page).forward(req, resp);
		} catch (ServletException | IOException e) {
			throw new FirewebViewRenderFailedException("unable to dispatch the page", e);
		}
	}
}
