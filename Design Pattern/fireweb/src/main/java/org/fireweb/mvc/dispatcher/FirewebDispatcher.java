package org.fireweb.mvc.dispatcher;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fireweb.mvc.action.FirewebAction;
import org.fireweb.mvc.config.FirewebMetadataContext;
import org.fireweb.mvc.exception.FireWebConfigException;
import org.fireweb.mvc.helper.CommandHelper;
import org.fireweb.mvc.helper.Dispatcher;

public class FirewebDispatcher extends HttpServlet {
	private FirewebMetadataContext context;
	private CommandHelper commandHelper;
	private Dispatcher dispatcher;

	@Override
	public void init(ServletConfig config) throws ServletException {
		Properties fireWebActionConfig = null;
		Properties fireWebViewConfig = null;
		String webInfLocation = null;

		try {
			commandHelper = new CommandHelper();
			dispatcher = new Dispatcher();
			webInfLocation = config.getServletContext().getRealPath("/WEB-INF");

			fireWebActionConfig = new Properties();
			fireWebActionConfig.load(new FileInputStream(webInfLocation + "/fireweb-action-config.properties"));
			fireWebViewConfig = new Properties();
			fireWebViewConfig.load(new FileInputStream(webInfLocation + "/fireweb-view-config.properties"));

			context = new FirewebMetadataContext(fireWebActionConfig, fireWebViewConfig);
		} catch (IOException e) {
			throw new FireWebConfigException("unable to read action-config or view-config", e);
		}

	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		FirewebAction action = null;
		String outcome = null;

		action = commandHelper.getCommand(req, context);
		outcome = action.perform(req, resp);
		dispatcher.dispatch(req, resp, outcome, context);
	}

}
