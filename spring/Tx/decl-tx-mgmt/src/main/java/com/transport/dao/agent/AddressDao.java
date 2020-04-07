package com.transport.dao.agent;

import org.springframework.jdbc.core.JdbcTemplate;

import com.transport.bo.agent.AddressBo;

public class AddressDao {
	private final String SQL_INSERT_ADDRESS = "insert into agent_address(address_line1, address_line2, city, state, zip, country, agent_no) values(?,?,?,?,?,?,?)";

	private JdbcTemplate jdbcTemplate;

	public AddressDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void saveAddress(AddressBo addressBo) {
		jdbcTemplate.update(SQL_INSERT_ADDRESS, addressBo.getAddressLine1(), addressBo.getAddressLine2(),
				addressBo.getCity(), addressBo.getState(), addressBo.getZip(), addressBo.getCountry(),
				addressBo.getAgentNo());
	}
}
