package com.msosc.accessor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLType;
import java.sql.Types;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;
import org.springframework.stereotype.Repository;

import com.msosc.bo.BusProviderBo;

@Repository
public class BusProviderAccessor {
	private final String SQL_GET_BUS_PROVIDERS_BETWEEN_ASSOCIATED_DT = "select bus_provider_id, business_nm, associated_dt, primary_business_contact_no, primary_business_email_address, status from bus_providers where associated_dt between ? and ?";
	private final String SQL_UPDATE_BUSINESS_NM_BY_PROVIDER_ID = "update bus_providers set business_nm = ? where bus_provider_id = ?";

	private GetBusProvidersByAssociatedDate getBusProvidersByAssociatedDate;
	private UpdateBusinessNameByProviderId updateBusinessNameByProviderId;
	private DataSource dataSource;

	@Autowired
	public BusProviderAccessor(DataSource dataSource) {
		this.dataSource = dataSource;
		getBusProvidersByAssociatedDate = new GetBusProvidersByAssociatedDate(dataSource,
				SQL_GET_BUS_PROVIDERS_BETWEEN_ASSOCIATED_DT);
		updateBusinessNameByProviderId = new UpdateBusinessNameByProviderId(dataSource,
				SQL_UPDATE_BUSINESS_NM_BY_PROVIDER_ID);
	}

	public List<BusProviderBo> getBusProviders(Date fromDate, Date toDate) {
		return getBusProvidersByAssociatedDate.execute(fromDate, toDate);
	}

	public int updateBusinessNameByBusProviderId(int busProviderId, String businessName) {
		return updateBusinessNameByProviderId.update(businessName, busProviderId);
	}

	private final class GetBusProvidersByAssociatedDate extends MappingSqlQuery<BusProviderBo> {
		public GetBusProvidersByAssociatedDate(DataSource ds, String sql) {
			super(ds, sql);
			super.declareParameter(new SqlParameter(Types.DATE));
			super.declareParameter(new SqlParameter(Types.DATE));
			compile();
		}

		@Override
		protected BusProviderBo mapRow(ResultSet rs, int rowNum) throws SQLException {
			BusProviderBo bo = null;
			bo = new BusProviderBo(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getString(5),
					rs.getString(6));
			return bo;
		}
	}

	private final class UpdateBusinessNameByProviderId extends SqlUpdate {
		public UpdateBusinessNameByProviderId(DataSource ds, String sql) {
			super(ds, sql);
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.INTEGER));
			compile();
		}

	}
}
