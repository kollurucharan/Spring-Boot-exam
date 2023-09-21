package com.pack.books.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.pack.books.contract.BooksDAOInterface;
import com.pack.books.models.CharanBooks;
import com.pack.books.models.Publisher;
import com.pack.books.rowmapper.CharanBooksRowMapper;
import com.pack.books.rowmapper.PublisherRowMapper;

@Component
public class BooksDAOImpl implements BooksDAOInterface {
	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public BooksDAOImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<CharanBooks> getAllBooks() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM charan_books";
		return jdbcTemplate.query(sql, new CharanBooksRowMapper());
	}

	public int setData(String title, String author, int publicationYear, String isbn, String genre) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO charan_books (title, author, publication_year, isbn, genre) VALUES (?, ?, ?, ?, ?)";

		int rowsAffected = jdbcTemplate.update(sql, title, author, publicationYear, isbn, genre);
		System.out.println(rowsAffected);
		return rowsAffected;
	}

	public int updateBooks(CharanBooks cb) {
		// TODO Auto-generated method stub

		String sql = "UPDATE charan_books SET isbn=? WHERE title=? AND author=?";

		Object[] params = { cb.getIsbn(), cb.getTitle(), cb.getAuthor() };

		int rowsUpdated = jdbcTemplate.update(sql, params);

		return rowsUpdated;
	}

	public int deleteData(String isbn) {

		String sql = "DELETE FROM charan_books WHERE isbn = ?";

		int rowsAffected = jdbcTemplate.update(sql, isbn);
		System.out.println(rowsAffected);
		return rowsAffected;
	}

	public List<Publisher> getAllPublisher() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM charan_publisher";
		return jdbcTemplate.query(sql, new PublisherRowMapper());
	}

	public List<CharanBooks> getPublisherBooks(Publisher pb) {
		// TODO Auto-generated method stub
		String sql = "SELECT id  FROM charan_publisher WHERE publisher_name=?";

		Object[] params = { pb.getPublisher_name() };
		int rowsUpdated = jdbcTemplate.update(sql, params);
		String query = "SELECT *  FROM charan_books WHERE p_id=?";
		Object[] param = { rowsUpdated };
		return jdbcTemplate.query(query, param, new CharanBooksRowMapper());
	}

}
