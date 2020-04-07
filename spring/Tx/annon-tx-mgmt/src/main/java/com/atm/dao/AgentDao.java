package com.atm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.atm.bo.AgentBo;

@Repository
public class AgentDao {
	private final String SQL_INSERT_AGENT = "insert into agent(agent_nm,age,gender,contact_no,email_address) values(?,?,?,?,?) ";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int saveAgent(final AgentBo agentBo) {
		int agentNo = 0;
		KeyHolder kh = null;

		kh = new GeneratedKeyHolder();
		jdbcTemplate.update((con) -> {
			PreparedStatement pstmt = null;

			pstmt = con.prepareStatement(SQL_INSERT_AGENT, new String[] { "agent_no" });
			pstmt.setString(1, agentBo.getAgentName());
			pstmt.setInt(2, agentBo.getAge());
			pstmt.setString(3, agentBo.getGender());
			pstmt.setString(4, agentBo.getContactNo());
			pstmt.setString(5, agentBo.getEmailAddress());

			return pstmt;
		}, kh);
		agentNo = kh.getKey().intValue();
		return agentNo;
	}

}
