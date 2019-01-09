package com.practice.batch;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {

		User user = new User();

		user.setUserId(rs.getInt("user_id"));
		user.setUsername(rs.getString("username"));
		user.setPassword(rs.getString("userpwd"));
		user.setAge(rs.getInt("age"));

		return user;
	}

}