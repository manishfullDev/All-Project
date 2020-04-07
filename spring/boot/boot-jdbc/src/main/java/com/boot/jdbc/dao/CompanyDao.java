package com.boot.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.boot.jdbc.bo.CompanyBo;

@Repository
public class CompanyDao {
	private final String SQL_GET_COMPANIES = "select company_no, business_nm, established_dt from company";
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<CompanyBo> getCompanies() {
		return jdbcTemplate.query(SQL_GET_COMPANIES, (rs, rowNum) -> {
			return new CompanyBo(rs.getInt(1), rs.getString(2), rs.getDate(3));
		});
	}
}








