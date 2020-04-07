package com.ca.accessor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.PreparedStatementCreator;

import com.ca.bo.BusProviderBo;

public class BusProviderAccessor {
	private final String SQL_GET_BUS_PROVIDERS = "select bus_provider_id, business_nm, associated_dt, primary_business_contact_no, primary_business_email_address, status from bus_providers";
	private final String SQL_SEARCH_BUS_PROVIDERS_BY_NAME = "select bus_provider_id, business_nm, associated_dt, primary_business_contact_no, primary_business_email_address, status from bus_providers where business_nm like ?";
	private final String SQL_SAVE_BUS_PROVIDER = "insert into bus_providers(bus_provider_id, business_nm, associated_dt, primary_business_contact_no, primary_business_email_address, status) values(?,?,?,?,?,?)";

	private JdbcTemplate jdbcTemplate;

	public BusProviderAccessor(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<BusProviderBo> getBusProviders() {
		List<BusProviderBo> busProviderBos = null;
		GetBusProviderPreparedStatementCreator creator = null;
		CommonBusProviderPreparedStatementCallback callback = null;

		creator = new GetBusProviderPreparedStatementCreator();
		callback = new CommonBusProviderPreparedStatementCallback();
		busProviderBos = jdbcTemplate.execute(creator, callback);

		return busProviderBos;
	}

	public List<BusProviderBo> searchBusProviders(String businessName) {
		SearchBusProvidersPreparedStatementCreator searchBusProvidersPreparedStatementCreator = null;
		CommonBusProviderPreparedStatementCallback commonBusProviderPreparedStatementCallback = null;
		List<BusProviderBo> busProviders = null;

		searchBusProvidersPreparedStatementCreator = new SearchBusProvidersPreparedStatementCreator(
				"%" + businessName + "%");
		commonBusProviderPreparedStatementCallback = new CommonBusProviderPreparedStatementCallback();
		busProviders = jdbcTemplate.execute(searchBusProvidersPreparedStatementCreator,
				commonBusProviderPreparedStatementCallback);

		return busProviders;
	}

	public void saveBusProvider(BusProviderBo bo) {
		InsertBusProviderPreparedStatementCreator insertBusProviderPreparedStatementCreator = null;
		insertBusProviderPreparedStatementCreator = new InsertBusProviderPreparedStatementCreator(bo);
		jdbcTemplate.update(insertBusProviderPreparedStatementCreator);
	}

	private final class GetBusProviderPreparedStatementCreator implements PreparedStatementCreator {
		@Override
		public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
			PreparedStatement pstmt = null;
			pstmt = con.prepareStatement(SQL_GET_BUS_PROVIDERS);
			return pstmt;
		}
	}

	private final class CommonBusProviderPreparedStatementCallback
			implements PreparedStatementCallback<List<BusProviderBo>> {
		@Override
		public List<BusProviderBo> doInPreparedStatement(PreparedStatement pstmt)
				throws SQLException, DataAccessException {
			ResultSet rs = null;
			BusProviderBo bo = null;
			List<BusProviderBo> busProviders = null;

			rs = pstmt.executeQuery();
			busProviders = new ArrayList<BusProviderBo>();
			while (rs.next()) {
				bo = new BusProviderBo(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getString(5),
						rs.getString(6));
				busProviders.add(bo);

			}
			return busProviders;
		}
	}

	private final class SearchBusProvidersPreparedStatementCreator implements PreparedStatementCreator {
		private String businessName;

		public SearchBusProvidersPreparedStatementCreator(String businessName) {
			this.businessName = businessName;
		}

		@Override
		public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
			PreparedStatement pstmt = null;

			pstmt = con.prepareStatement(SQL_SEARCH_BUS_PROVIDERS_BY_NAME);
			pstmt.setString(1, businessName);

			return pstmt;
		}
	}

	private final class InsertBusProviderPreparedStatementCreator implements PreparedStatementCreator {
		private BusProviderBo bo;

		public InsertBusProviderPreparedStatementCreator(BusProviderBo bo) {
			this.bo = bo;
		}

		@Override
		public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
			PreparedStatement pstmt = null;
			pstmt = con.prepareStatement(SQL_SAVE_BUS_PROVIDER);
			pstmt.setInt(1, bo.getBusProviderId());
			pstmt.setString(2, bo.getBusinessName());
			pstmt.setDate(3, new java.sql.Date(bo.getAssociatedDate().getTime()));
			pstmt.setString(4, bo.getPrimaryBusinessContactNo());
			pstmt.setString(5, bo.getPrimaryBusinessEmailAddress());
			pstmt.setString(6, bo.getStatus());

			return pstmt;
		}

	}

}
