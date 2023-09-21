package com.pack.books.contract;

import java.util.List;

import com.pack.books.models.CharanBooks;
import com.pack.books.models.Publisher;

public interface BooksDAOInterface {
	public List<CharanBooks> getAllBooks();

	public int setData(String title, String author, int publicationYear, String isbn, String genre);

	public int updateBooks(CharanBooks cb);

	public int deleteData(String isbn);

	public List<Publisher> getAllPublisher();
}
