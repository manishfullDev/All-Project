package com.qba.accessor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.qba.bo.BusProviderBo;
import com.qba.bo.BusProviderWithJourneyBo;
import com.qba.bo.JourneyBo;

@Repository
public class BusProviderAccessor {
	private final String SQL_COUNT_BUS_PROVIDERS = "select count(1) from bus_providers";
	private final String SQL_FIND_BUSINESS_NM_BY_PROVIDER_ID = "select business_nm from bus_providers where bus_provider_id = ?";
	private final String SQL_FIND_BUS_PROVIDER_BY_PROVIDER_ID = "select bus_provider_id, business_nm, associated_dt, primary_business_contact_no, primary_business_email_address, status from bus_providers where bus_provider_id = ?";
	private final String SQL_GET_BUS_PROVIDERS = "select bus_provider_id, business_nm, associated_dt, primary_business_contact_no, primary_business_email_address, status from bus_providers";
	private final String SQL_INSERT_BUS_PROVIDER = "insert into bus_providers(bus_provider_id, business_nm, associated_dt, primary_business_contact_no, primary_business_email_address, status) values(?,?,?,?,?,?)";
	private final String SQL_GET_BUS_PROVIDERS_WITH_JOURNEYS = "select  bp.bus_provider_id,bp.business_nm,bp.associated_dt,bp.primary_business_contact_no,bp.primary_business_email_address,bp.status,j.journey_id, j.source, j.destnation, j.journey_dt, j.travel_time, j.cost, j.bus_no from bus_providers bp inner join journeys j on bp.bus_provider_id = j.bus_provider_id";
	private final String SQL_GET_BUS_PROVIDERS_ORDER_BY_BUSINESS_NM = "select bus_provider_id, business_nm, associated_dt, primary_business_contact_no, primary_business_email_address, status from bus_providers order by business_nm asc";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int getNoOfBusProviders() {
		return jdbcTemplate.queryForObject(SQL_COUNT_BUS_PROVIDERS, Integer.class);
	}

	public String getBusinessNameByProviderId(int busProviderId) {
		return jdbcTemplate.queryForObject(SQL_FIND_BUSINESS_NM_BY_PROVIDER_ID, String.class, busProviderId);
	}

	public BusProviderBo findBusProvider(int busProviderId) {
		return jdbcTemplate.queryForObject(SQL_FIND_BUS_PROVIDER_BY_PROVIDER_ID, new BusProviderRowMapper(),
				busProviderId);
	}

	public List<BusProviderBo> getBusProviders() {
		return jdbcTemplate.query(SQL_GET_BUS_PROVIDERS, new BusProviderRowMapper());
	}

	public int saveBusProvider(BusProviderBo bo) {
		return jdbcTemplate.update(SQL_INSERT_BUS_PROVIDER, bo.getBusProviderId(), bo.getBusinessName(),
				bo.getAssociatedDate(), bo.getPrimaryBusinessContactNo(), bo.getPrimaryBusinessEmailAddress(),
				bo.getStatus());
	}

	public List<BusProviderWithJourneyBo> getBusProvidersWithJourneys() {
		return jdbcTemplate.query(SQL_GET_BUS_PROVIDERS_WITH_JOURNEYS, new BusProviderResultsetExtractor());
	}

	public List<BusProviderBo> getBusProvidersByPagination(final int pageSize, final int pageNo) {
		return jdbcTemplate.query(SQL_GET_BUS_PROVIDERS_ORDER_BY_BUSINESS_NM, (rs) -> {
			List<BusProviderBo> busProviders = null;
			BusProviderBo bo = null;
			int startIndex = 0;
			int endIndex = 0;
			int row = 1;

			busProviders = new ArrayList<>();
			startIndex = (pageSize * (pageNo - 1)) + 1;
			endIndex = (pageSize * (pageNo - 1)) + pageSize;

			while (rs.next() && row <= endIndex) {
				if (row >= startIndex) {
					bo = new BusProviderBo(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getString(4),
							rs.getString(5), rs.getString(6));
					busProviders.add(bo);
				}
				row++;
			}

			return busProviders;
		});
	}

	private final class BusProviderRowMapper implements RowMapper<BusProviderBo> {
		@Override
		public BusProviderBo mapRow(ResultSet rs, int row) throws SQLException {
			BusProviderBo bo = null;
			bo = new BusProviderBo(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getString(5),
					rs.getString(6));
			return bo;
		}
	}

	private final class BusProviderResultsetExtractor implements ResultSetExtractor<List<BusProviderWithJourneyBo>> {
		@Override
		public List<BusProviderWithJourneyBo> extractData(ResultSet rs) throws SQLException, DataAccessException {
			Map<Integer, BusProviderWithJourneyBo> busProvidersMap = null;
			BusProviderWithJourneyBo busProviderWithJourneyBo = null;
			List<BusProviderWithJourneyBo> busProviderWithJourneys = null;
			BusProviderBo busProviderBo = null;
			JourneyBo journeyBo = null;
			int busProviderId = 0;

			busProvidersMap = new HashMap<Integer, BusProviderWithJourneyBo>();

			while (rs.next()) {
				busProviderId = rs.getInt(1);
				if (busProvidersMap.containsKey(busProviderId) == false) {
					busProviderBo = new BusProviderBo(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getString(4),
							rs.getString(5), rs.getString(6));
					busProviderWithJourneyBo = new BusProviderWithJourneyBo(busProviderBo);
					busProvidersMap.put(busProviderId, busProviderWithJourneyBo);
				} else {
					busProviderWithJourneyBo = busProvidersMap.get(busProviderId);
				}

				journeyBo = new JourneyBo(rs.getInt(7), rs.getString(8), rs.getString(9), rs.getDate(10), rs.getInt(11),
						rs.getDouble(12), rs.getString(13));
				busProviderWithJourneyBo.getJourneys().add(journeyBo);
			}

			if (busProvidersMap.size() > 0) {
				busProviderWithJourneys = new ArrayList<BusProviderWithJourneyBo>();
				for (BusProviderWithJourneyBo bo : busProvidersMap.values()) {
					busProviderWithJourneys.add(bo);
				}
			}
			return busProviderWithJourneys;
		}

	}
}
