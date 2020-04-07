package com.atm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.atm.bo.AddressBo;
import com.atm.exception.AddressNotFoundException;

@Repository
public class AddressDao {
	private final String SQL_INSERT_ADDRESS = "insert into agent_address(address_line1, address_line2, city, state, zip, country, agent_no) values(?,?,?,?,?,?,?)";
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void saveAddress(AddressBo addressBo) throws AddressNotFoundException {
		if (addressBo.getZip() > 5000) {
			throw new AddressNotFoundException("address is invalid");
		}
		jdbcTemplate.update(SQL_INSERT_ADDRESS, addressBo.getAddressLine1(), addressBo.getAddressLine2(),
				addressBo.getCity(), addressBo.getState(), addressBo.getZip(), addressBo.getCountry(),
				addressBo.getAgentNo());
	}

}
