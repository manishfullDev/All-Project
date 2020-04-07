package com.transport.dao.agent;

import java.sql.PreparedStatement;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.transport.bo.agent.AgentBo;

public class AgentDao {
	private final String SQL_INSERT_AGENT = "insert into agent(agent_nm, age, gender, email_address, contact_no) values(?,?,?,?,?) ";

	private JdbcTemplate jdbcTemplate;

	public AgentDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveAgent(final AgentBo agentBo) {
		KeyHolder kg = null;
		int agentNo = 0;

		kg = new GeneratedKeyHolder();
		jdbcTemplate.update((con) -> {
			PreparedStatement pstmt = null;
			pstmt = con.prepareStatement(SQL_INSERT_AGENT, new String[] { "agent_no" });
			pstmt.setString(1, agentBo.getAgentName());
			pstmt.setInt(2, agentBo.getAge());
			pstmt.setString(3, agentBo.getGender());
			pstmt.setString(4, agentBo.getEmailAddress());
			pstmt.setString(5, agentBo.getContactNo());

			return pstmt;
		}, kg);

		agentNo = kg.getKey().intValue();
		return agentNo;
	}

}
