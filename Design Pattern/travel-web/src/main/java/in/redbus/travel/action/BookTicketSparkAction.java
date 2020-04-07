package in.redbus.travel.action;

import java.util.Calendar;

import org.sparkframework.web.action.SparkAction;
import org.sparkframework.web.context.MapContextObject;

public class BookTicketSparkAction implements SparkAction {
	@Override
	public String execute(MapContextObject mapContextObject) {
		String passengerName = null;

		passengerName = mapContextObject.getParameter("passengerName");

		mapContextObject.setAttribute("ticketNo", Calendar.getInstance().getTimeInMillis());
		mapContextObject.setAttribute("passengerName", passengerName);

		return "ticket";
	}

}
