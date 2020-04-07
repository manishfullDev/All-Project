package com.npjt.accessor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.npjt.bo.BusProviderBo;

@Repository
public class BusProviderAccessor {
	private final String SQL_BUSINESS_NM_BY_ID = "select business_nm from bus_providers where bus_provider_id = :busProviderId";
	private final String SQL_GET_BUS_PROVIDERS_BY_CONTACT_NO_OR_EMAIL_ADDRESS = "select bus_provider_id, business_nm, associated_dt, primary_business_contact_no, primary_business_email_address, status from bus_providers where primary_business_contact_no = :contactNo or primary_business_email_address = :emailAddress";
	private final String SQL_SAVE_BUS_PROVIDER = "insert into bus_providers(bus_provider_id, business_nm, associated_dt, primary_business_contact_no, primary_business_email_address, status) values(:busProviderId, :businessName, :associatedDate, :primaryBusinessContactNo, :primaryBusinessEmailAddress, :status)";

	@Autowired
	private NamedParameterJdbcTemplate npJdbcTemplate;

	public String getBusinessNameById(int busProviderId) {
		Map<String, Object> paramMap = null;

		paramMap = new HashMap<String, Object>();
		paramMap.put("busProviderId", busProviderId);
		return npJdbcTemplate.queryForObject(SQL_BUSINESS_NM_BY_ID, paramMap, String.class);
	}

	public List<BusProviderBo> getBusProvidersByContactNoOrEmailAddress(final String contactNo,
			final String emailAddress) {
		MapSqlParameterSource paramSource = null;

		paramSource = new MapSqlParameterSource();
		paramSource.addValue("contactNo", contactNo);
		paramSource.addValue("emailAddress", emailAddress);

		return npJdbcTemplate.query(SQL_GET_BUS_PROVIDERS_BY_CONTACT_NO_OR_EMAIL_ADDRESS, paramSource, (rs, row) -> {
			return new BusProviderBo(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getString(5),
					rs.getString(6));

		});
	}

	public void saveBusProvider(BusProviderBo bo) {
		BeanPropertySqlParameterSource paramSource = null;

		paramSource = new BeanPropertySqlParameterSource(bo);
		npJdbcTemplate.update(SQL_SAVE_BUS_PROVIDER, paramSource);
	}

}










