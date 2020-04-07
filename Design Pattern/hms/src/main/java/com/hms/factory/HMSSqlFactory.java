package com.hms.factory;

import com.hms.dao.BusProviderDao;
import com.jdbcdata.factory.SqlFactory;
import com.jdbcdata.sql.AbstractSqlSelect;

public class HMSSqlFactory extends SqlFactory {

	@Override
	protected AbstractSqlSelect newSqlSelect(String lClassName) {
		AbstractSqlSelect abstractSqlSelect = null;

		if (lClassName.equals("busProviders")) {
			abstractSqlSelect = new BusProviderDao.GetBusProvidersSqlSelect();
		}
		return abstractSqlSelect;
	}

}
