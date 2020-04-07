package com.spring.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.dto.Account;
import com.spring.rest.dto.User;

@RestController
@RequestMapping("/payTMWallet")
public class PayTMWalletController {
	@GetMapping(value = "/{mobileNo}")
	public String getBalance(@PathVariable("mobileNo") String mobileNo) {
		return "100";
	}

	@GetMapping(value = "/history/{mobileNo}", produces = { "application/json" })
	public String getWalletHistory(@PathVariable("mobileNo") String mobileNo,
			@MatrixVariable(name = "city", defaultValue = "chennai") String city,
			@RequestParam(name = "transactionType", defaultValue = "all") String transactionType) {
		return "{'mobileNo': " + mobileNo + ", 'city': " + city + ", 'transactionType' : " + transactionType + "}";
	}

	@GetMapping(value = "/otp/{mobileNo}", produces = { "text/plain" })
	public String requestOtp(@PathVariable("mobileNo") String mobileNo, @RequestHeader("user-agent") String agent) {
		return "mobileNo : " + mobileNo + " user Agent: " + agent;
	}

	@PostMapping(produces = { "application/json" }, consumes = { "application/json" })
	public ResponseEntity<Account> openAccount(@RequestBody User user) {
		Account account = null;

		account = new Account();
		account.setAccountHolderName(user.getFirstName() + " " + user.getLastName());
		account.setAccountNo(33);
		account.setRegisteredMobileNo(user.getMobileNo());
		account.setEmailAddress(user.getEmailAddress());
		account.setStatus("Active");

		return ResponseEntity.status(201).body(account);
	}
}








