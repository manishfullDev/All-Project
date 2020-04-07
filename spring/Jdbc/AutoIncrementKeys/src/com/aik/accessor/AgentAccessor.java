package com.aik.accessor;

import java.sql.PreparedStatement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.aik.bo.AgentBo;

@Repository
public class AgentAccessor {
	private final String SQL_SAVE_AGENT = "insert into agent(agent_nm, age, gender, contact_no, email_address) values(?,?,?,?,?)";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int saveAgent(final AgentBo bo) {
		int agentNo = 0;
		KeyHolder kh = null;

		kh = new GeneratedKeyHolder();
		jdbcTemplate.update((con) -> {
			PreparedStatement pstmt = null;
			pstmt = con.prepareStatement(SQL_SAVE_AGENT, new String[] { "agent_no" });
			pstmt.setString(1, bo.getAgentName());
			pstmt.setInt(2, bo.getAge());
			pstmt.setString(3, bo.getGender());
			pstmt.setString(4, bo.getMobileNo());
			pstmt.setString(5, bo.getEmailAddress());
			return pstmt;
		}, kh);
		agentNo = kh.getKey().intValue();
		return agentNo;
	}

}
