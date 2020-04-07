package com.cch.test;

import com.cch.dto.CabRequest;
import com.cch.dto.Trip;
import com.cch.invoker.CabResourceInvoker;

public class CCHTest {
	public static void main(String[] args) {
		CabResourceInvoker cri = new CabResourceInvoker();
		CabRequest cr = new CabRequest();
		cr.setAccountNo(3535);
		cr.setDestination("Madhapur");
		cr.setSource("Banjara Hills");
		cr.setPassengerContactNo("9394948");
		cr.setPassengerName("Alex");
		cr.setTripType("Mini");
		cr.setPaymentMethod("CASH");
		
		Trip trip = cri.rideNow(cr);
		System.out.println(trip.getCabNo());
	}
}
