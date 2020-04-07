package com.bp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.bp.bo.BusProviderBo;
import com.bp.bo.JourneyDetailBo;
import com.bp.bo.TicketBo;
import com.bp.bo.TravelCriteriaBo;

@Repository
public class JourneyDao {
	private final String SQL_SEARCH_JOURNEYS = "select b.bus_provider_id, b.business_nm, b.associated_dt, b.primary_business_contact_no, b.primary_business_email_address, b.status, j.journey_id, j.source, j.destnation, j.journey_dt, j.travel_time, j.cost, j.bus_no from journeys j inner join bus_providers b on j.bus_provider_id = b.bus_provider_id where b.bus_provider_id = ? or (j.source = ? and j.destnation = ? and j.journey_dt = ?) or (cost between ? and ?) order by j.journey_dt asc";
	private final String SQL_GET_JOURNEY_BY_ID = "select b.bus_provider_id, b.business_nm, b.associated_dt, b.primary_business_contact_no, b.primary_business_email_address, b.status, j.journey_id, j.source, j.destnation, j.journey_dt, j.travel_time, j.cost, j.bus_no from journeys j inner join bus_providers b on j.bus_provider_id = b.bus_provider_id where j.journey_id = ?";
	private final String SQL_SAVE_TICKET = "insert into tickets(passenger_nm, age, gender, mobile_nbr, email_address, seat_no, price, journey_id) values(?,?,?,?,?,?,?,?)";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<JourneyDetailBo> getJourneys(TravelCriteriaBo bo) {
		return jdbcTemplate.query(SQL_SEARCH_JOURNEYS, new JourneyDetailsRowMapper(), bo.getBusProviderId(),
				bo.getSource(), bo.getDestination(), bo.getTravelDate(), bo.getMinPrice(), bo.getMaxPrice());
	}

	public JourneyDetailBo getJourney(int journeyId) {
		return jdbcTemplate.queryForObject(SQL_GET_JOURNEY_BY_ID, new JourneyDetailsRowMapper(), journeyId);
	}

	public int saveTicket(final TicketBo ticketBo) {
		int ticketNo = 0;
		KeyHolder kh = null;

		kh = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement pstmt = null;

				pstmt = con.prepareStatement(SQL_SAVE_TICKET, new String[] {"ticket_no"});
				pstmt.setString(1, ticketBo.getPassengerName());
				pstmt.setInt(2, ticketBo.getAge());
				pstmt.setString(3, ticketBo.getGender());
				pstmt.setString(4, ticketBo.getMobileNo());
				pstmt.setString(5, ticketBo.getEmailAddress());
				pstmt.setInt(6, ticketBo.getSeatNo());
				pstmt.setDouble(7, ticketBo.getPrice());
				pstmt.setInt(8, ticketBo.getJourneyId());

				return pstmt;
			}
		}, kh);

		ticketNo = kh.getKey().intValue();

		return ticketNo;
	}

	private final class JourneyDetailsRowMapper implements RowMapper<JourneyDetailBo> {
		@Override
		public JourneyDetailBo mapRow(ResultSet rs, int rowNum) throws SQLException {
			JourneyDetailBo journeyDetailBo = null;

			journeyDetailBo = new JourneyDetailBo(rs.getInt(7), rs.getString(8), rs.getString(9), rs.getDate(10),
					rs.getInt(11), rs.getDouble(12), rs.getString(13), new BusProviderBo(rs.getInt(1), rs.getString(2),
							rs.getDate(3), rs.getString(4), rs.getString(5), rs.getString(6)));
			return journeyDetailBo;
		}

	}

}
