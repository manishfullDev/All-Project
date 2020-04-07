package com.boot.webflux.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.webflux.entities.Company;
import com.boot.webflux.repository.CompanyRepository;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class CompanyResource {
	@Autowired
	private CompanyRepository companyRepository;

	@GetMapping(value = "/company/{companyNo}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Mono<Company> getCompany(@PathVariable("companyNo") int companyNo) {
		return Mono.just((companyRepository.getOne(companyNo)));
	}

}
