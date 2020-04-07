package com.boot.oauth2.resource;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payTM")
public class PayTMAccount {

	@GetMapping(value = "/{mobileNo}", produces = MediaType.TEXT_PLAIN_VALUE)
	public String getAccountBalance(@PathVariable("mobileNo") String mobileNo) {
		return "343.3";
	}

}
