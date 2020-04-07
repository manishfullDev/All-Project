package com.rb.dao.helper;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.rb.helper.ConnectionHelper;

public class DDLHelper {
	public static void sql(String dbConfigFile, String sqlFile)
			throws IOException, ClassNotFoundException, SQLException {
		int c = 0;
		InputStream fis = null;

		Connection con = null;
		Statement stmt = null;
		StringBuffer sqlQueries = null;
		try {
			fis = DDLHelper.class.getClassLoader().getResourceAsStream(sqlFile);
			sqlQueries = new StringBuffer();
			while ((c = fis.read()) != -1) {
				sqlQueries.append((char) c);
			}
			con = new ConnectionHelper(dbConfigFile).getConnection();
			stmt = con.createStatement();
			stmt.execute(sqlQueries.toString());
		} finally {
			if (stmt != null) {
				stmt.close();
			}
			if (con != null) {
				con.commit();
				con.close();
			}

		}
	}
}
