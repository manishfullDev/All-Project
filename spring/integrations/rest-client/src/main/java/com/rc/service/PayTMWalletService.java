package com.rc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.rc.dto.Account;
import com.rc.dto.User;

@Service
public class PayTMWalletService {
	private final String ROOT_RESOURCE_URI = "http://localhost:8081/spring-rest/api/payTMWallet/";
	@Autowired
	private RestTemplate restTemplate;

	public String getBalance(String mobileNo) {
		return restTemplate.getForObject(ROOT_RESOURCE_URI + mobileNo, String.class);
	}

	public Account openAccount(User user) {
		return restTemplate.postForObject(ROOT_RESOURCE_URI, user, Account.class);
	}
}
