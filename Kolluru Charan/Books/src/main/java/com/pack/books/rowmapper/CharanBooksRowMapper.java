package com.pack.books.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.pack.books.models.CharanBooks;

public class CharanBooksRowMapper implements RowMapper<CharanBooks> {
	@Override
	public CharanBooks mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		CharanBooks cb = new CharanBooks();
		cb.setBookId(rs.getInt(1));
		cb.setTitle(rs.getString(2));
		cb.setAuthor(rs.getString(3));
		cb.setPublicationYear(rs.getInt(4));
		cb.setIsbn(rs.getString(5));
		cb.setGenre(rs.getString(6));

		return cb;
	}
}
