package com.jdbcdata.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jdbcdata.core.JdbcConnectionService;
import com.jdbcdata.exception.JdbcDataResourceException;

abstract public class AbstractSqlSelect {
	protected JdbcConnectionService jdbcConnectionService;
	protected String sqlQuery;

	public AbstractSqlSelect(String sqlQuery) {
		this.sqlQuery = sqlQuery;
	}

	public void setJdbcConnectionService(JdbcConnectionService jdbcConnectionService) {
		this.jdbcConnectionService = jdbcConnectionService;
	}

	public List<Object> list() {
		List<Object> records = null;

		try (Connection con = jdbcConnectionService.newConnection();
				PreparedStatement pstmt = con.prepareStatement(sqlQuery);
				ResultSet rs = pstmt.executeQuery();) {
			records = new ArrayList<>();
			while (rs.next()) {
				records.add(mapRecord(rs));
			}
		} catch (SQLException e) {
			throw new JdbcDataResourceException("unable to close jdbc resources", e);
		}

		return records;
	}

	abstract protected Object mapRecord(ResultSet rs) throws SQLException;

}
