package com.rc.test;

import in.airtel.recharge.service.RechargeGatewayPartner;
import in.airtel.recharge.service.RechargeGatewayPartnerImplService;
import in.airtel.recharge.types.Receipt;
import in.airtel.recharge.types.Topup;

public class RechargeTest {
	public static void main(String[] args) {
		RechargeGatewayPartnerImplService service = new RechargeGatewayPartnerImplService();
		RechargeGatewayPartner port = service.getRechargeGatewayPartnerImplPort();
		Topup topup = new Topup();
		topup.setMobileNo("03940484");
		topup.setSubscriberName("Airtel");
		topup.setPlanName("399-4G");
		topup.setCircle("TS");
		topup.setAmount(349);
		Receipt receipt = port.recharge(topup);
		System.out.println("reference no :  " + receipt.getReferenceNo());
	}
}
