package com.buspartner.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.buspartner.bo.BusProviderBo;
import com.buspartner.helper.ConnectionManager;

public class BusProviderDao {
	private final String SQL_GET_BUS_PROVIDERS = "select bus_provider_id, business_nm, associated_dt, primary_business_contact_no, primary_business_email_address, status from bus_providers order by business_nm";
	private final String SQL_GET_NO_OF_BUS_PROVIDERS = "select count(1) from bus_providers";

	public List<BusProviderBo> getBusProviders(int pageNo, int pageSize) throws Exception {
		List<BusProviderBo> busProviderBos = null;
		BusProviderBo bo = null;
		Connection connection = null;
		Statement stmt = null;
		ResultSet rs = null;
		int startIndex = 0;
		int endIndex = 0;
		int row = 1;
		try {
			connection = ConnectionManager.getInstance().getConnection();
			stmt = connection.createStatement();
			rs = stmt.executeQuery(SQL_GET_BUS_PROVIDERS);
			startIndex = (pageSize * (pageNo - 1)) + 1;
			endIndex = (pageSize * (pageNo - 1)) + pageSize;
			busProviderBos = new ArrayList<BusProviderBo>();

			while (rs.next() && row <= endIndex) {
				if (row >= startIndex) {
					bo = new BusProviderBo(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getString(4),
							rs.getString(5), rs.getString(6));
					busProviderBos.add(bo);
				}
				row++;
			}
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (connection != null) {
				connection.close();
			}
		}

		return busProviderBos;
	}

	public int getNoOfBusProviders() throws Exception {
		Connection connection = null;
		Statement stmt = null;
		ResultSet rs = null;
		int c = 0;
		try {
			connection = ConnectionManager.getInstance().getConnection();
			stmt = connection.createStatement();
			rs = stmt.executeQuery(SQL_GET_NO_OF_BUS_PROVIDERS);
			if (rs.next()) {
				c = rs.getInt(1);
			}
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (connection != null) {
				connection.close();
			}
		}

		return c;
	}

}
