package com.security.invoker;

public class SecurityTest {
	public static void main(String[] args) {
		NetbankingServiceInvoker invoker = new NetbankingServiceInvoker();
		double balance = invoker.getAccountBalance("12345","admin","welcome1");
		System.out.println("balance :" + balance);
	}
}
