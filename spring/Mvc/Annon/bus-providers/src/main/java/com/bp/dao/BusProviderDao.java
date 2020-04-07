package com.bp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bp.bo.BusProviderBo;

@Repository
public class BusProviderDao {
	private final String GET_BUS_PROVIDERS = "select bus_provider_id, business_nm, associated_dt, primary_business_contact_no, primary_business_email_address, status from bus_providers order by business_nm";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<BusProviderBo> getBusProviderWithActiveStatus() {
		return jdbcTemplate.query(GET_BUS_PROVIDERS, (rs, rowNum) -> {
			BusProviderBo bo = null;
			bo = new BusProviderBo(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getString(5),
					rs.getString(6));
			return bo;
		});
	}
}
