package com.boot.webflux.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.webflux.entities.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
