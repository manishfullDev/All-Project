package com.datajpa.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.datajpa.entities.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer> {
	List<Company> getCompaniesByBusinessNameLike(String businessName);
	int countCompaniesByBusinessNameLike(String businessName);
	
	@Query("from Company where establishedDate between ?1 and ?2")
	List<Company> getCompaniesBetweenStartAndEnd(Date fromDate, Date toDate);
}
