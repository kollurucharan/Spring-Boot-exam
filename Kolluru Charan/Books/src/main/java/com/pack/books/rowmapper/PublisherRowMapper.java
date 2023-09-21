package com.pack.books.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.pack.books.models.Publisher;

public class PublisherRowMapper implements RowMapper<Publisher> {
	@Override
	public Publisher mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Publisher cb = new Publisher();

		cb.setPublisher_name(rs.getString(2));
		cb.setAddress(rs.getString(3));
		cb.setPhone_number(rs.getString(4));

		return cb;
	}
}
