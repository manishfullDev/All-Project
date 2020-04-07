package com.rb.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.rb.bo.BusProviderBo;
import com.rb.helper.ConnectionHelper;

public class BusProviderDao {
	private final String SQL_GET_BUS_PROVIDER_BY_ID = "select bus_provider_id, business_nm, associated_dt, primary_business_contact_no, primary_business_email_address, status from bus_providers where bus_provider_id = ?";

	public BusProviderBo getBusProvider(int busProviderId) throws ClassNotFoundException, IOException, SQLException {
		ResultSet rs = null;
		Connection con = null;
		BusProviderBo bo = null;
		PreparedStatement pstmt = null;

		try {
			con = new ConnectionHelper().getConnection();
			pstmt = con.prepareStatement(SQL_GET_BUS_PROVIDER_BY_ID);
			pstmt.setInt(1, busProviderId);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				bo = new BusProviderBo(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getString(5),
						rs.getString(6));
			}
		} finally {
			if (pstmt != null) {
				pstmt.close();
			}
			if (con != null) {
				con.close();
			}
		}
		return bo;
	}
}
