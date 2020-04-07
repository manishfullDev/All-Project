package com.hms.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.hms.bo.BusProviderBo;
import com.hms.factory.HMSSqlFactory;
import com.jdbcdata.factory.SqlFactory;
import com.jdbcdata.sql.AbstractSqlSelect;

public class BusProviderDao {

	public List<?> getBusProviders() {
		SqlFactory sqlFactory = null;
		AbstractSqlSelect abstractSqlSelect = null;

		sqlFactory = new HMSSqlFactory();
		abstractSqlSelect = sqlFactory.createSqlSelect("busProviders");
		return abstractSqlSelect.list();
	}

	public final static class GetBusProvidersSqlSelect extends AbstractSqlSelect {
		private final static String SQL_SELECT_BUS_PROVIDERS = "select * from bus_providers";

		public GetBusProvidersSqlSelect() {
			super(SQL_SELECT_BUS_PROVIDERS);
		}

		@Override
		protected Object mapRecord(ResultSet rs) throws SQLException {
			return new BusProviderBo(rs.getInt("bus_provider_id"), rs.getString("business_nm"),
					rs.getDate("associated_dt"), rs.getString("primary_business_contact_no"),
					rs.getString("primary_business_email_address"), rs.getString("status"));
		}

	}
}
