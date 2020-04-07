package com.fjr.test;

import com.fjr.invoker.RailTicketServiceInvoker;

public class RailTicketTest {
	public static void main(String[] args) {
		RailTicketServiceInvoker invoker = new RailTicketServiceInvoker();
		String ticketStatus = invoker.pnrStatus("9394");
		System.out.println(ticketStatus);
	}
}
