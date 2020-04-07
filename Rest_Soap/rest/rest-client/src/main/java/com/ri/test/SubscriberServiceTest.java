package com.ri.test;

import com.ri.invoker.SubscriberServiceInvoker;

public class SubscriberServiceTest {
	public static void main(String[] args) {
		SubscriberServiceInvoker ssi = new SubscriberServiceInvoker();
		String subscriptionPayload = "<subscriber> 	<sim-no>9393928930</sim-no> 	<subscriber-name>Joseph</subscriber-name> </subscriber>";
		String responsePayload = ssi.subscribe(subscriptionPayload, "3983");
		System.out.println(responsePayload);
	}
}
