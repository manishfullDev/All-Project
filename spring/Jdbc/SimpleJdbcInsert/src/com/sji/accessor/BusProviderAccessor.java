package com.sji.accessor;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.sji.bo.BusProviderBo;

@Repository
public class BusProviderAccessor {
	@Autowired
	private DataSource dataSource;

	public int saveBusProvider(BusProviderBo bo) {
		MapSqlParameterSource paramSource = null;
		SimpleJdbcInsert sjInsert = null;
		int r = 0;

		sjInsert = new SimpleJdbcInsert(dataSource);
		sjInsert.setTableName("bus_providers");
		paramSource = new MapSqlParameterSource();
		paramSource.addValue("bus_provider_id", bo.getBusProviderId());
		paramSource.addValue("business_nm", bo.getBusinessName());
		paramSource.addValue("associated_dt", bo.getAssociatedDate());
		paramSource.addValue("primary_business_contact_no", bo.getPrimaryBusinessContactNo());
		paramSource.addValue("primary_business_email_address", bo.getPrimaryBusinessEmailAddress());
		paramSource.addValue("status", bo.getStatus());

		r = sjInsert.execute(paramSource);

		return r;
	}
	
	public int add(int a, int b) {
		Object sum = 0;
		SimpleJdbcCall sjCall = null;
		Map<String, Object> inMap = null;
		Map<String, Object> outMap = null;
		
		sjCall = new SimpleJdbcCall(dataSource);
		sjCall.setProcedureName("add");
		inMap = new HashMap<String, Object>();
		inMap.put("a", a);
		inMap.put("b", b);
		inMap.put("sum", sum);
		outMap = sjCall.execute(inMap);
		//sum = (Integer) outMap.get("sum");
		
		return (Integer)sum;
	}

}















