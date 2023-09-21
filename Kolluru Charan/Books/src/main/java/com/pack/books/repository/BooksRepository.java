package com.pack.books.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pack.books.dao.BooksDAOImpl;
import com.pack.books.models.CharanBooks;
import com.pack.books.models.Publisher;

@Repository
public class BooksRepository {
	private final BooksDAOImpl dao;

	@Autowired
	public BooksRepository(BooksDAOImpl dao) {
		this.dao = dao;
	}

	public List<CharanBooks> getAllBooks() {
		// TODO Auto-generated method stub

		List<CharanBooks> ns = dao.getAllBooks();
		for (CharanBooks nw : ns) {
			System.out.println(nw.toString());
		}

		return ns;
	}

	public int setData(String title, String author, int publicationYear, String isbn, String genre) {
		// TODO Auto-generated method stub
		int rowsAffected = dao.setData(title, author, publicationYear, isbn, genre);
		System.out.println(rowsAffected);
		return rowsAffected;
	}

	public int updateBooks(CharanBooks cb) {
		// TODO Auto-generated method stub
		int rowsUpdated = dao.updateBooks(cb);
		return rowsUpdated;
	}

	public int deleteData(String isbn) {
		// TODO Auto-generated method stub
		int rowsAffected = dao.deleteData(isbn);
		System.out.println(rowsAffected);
		return rowsAffected;
	}

	public List<Publisher> getAllpublisher() {
		// TODO Auto-generated method stub
		List<Publisher> ns = dao.getAllPublisher();
		for (Publisher nw : ns) {
			System.out.println(nw.toString());
		}

		return ns;
	}

	public List<Publisher> getAllPublisher() {
		// TODO Auto-generated method stub

		List<Publisher> ns = dao.getAllPublisher();
		for (Publisher nw : ns) {
			System.out.println(nw.toString());
		}

		return ns;
	}

	public List<CharanBooks> getPublisherBooks(Publisher pb) {
		// TODO Auto-generated method stub
		List<CharanBooks> ns = dao.getPublisherBooks(pb);
		System.out.println("hello");
		for (CharanBooks nw : ns) {
			System.out.println(nw.toString());
		}

		return ns;
	}
}
