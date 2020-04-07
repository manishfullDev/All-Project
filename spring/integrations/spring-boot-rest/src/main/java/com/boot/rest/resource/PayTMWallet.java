package com.boot.rest.resource;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wallet")
public class PayTMWallet {
	@GetMapping(value = "/{mobileNo}", produces = { MediaType.TEXT_PLAIN_VALUE })
	public String getBalance(@PathVariable("mobileNo") String mobileNo) {
		return "100";
	}
}
