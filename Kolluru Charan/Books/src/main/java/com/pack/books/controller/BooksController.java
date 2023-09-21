package com.pack.books.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pack.books.models.CharanBooks;
import com.pack.books.models.Publisher;
import com.pack.books.repository.BooksRepository;

@RestController
public class BooksController {

	private BooksRepository irep;

	@Autowired
	public BooksController(BooksRepository irep) {
		this.irep = irep;
	}
	// ----------------------------------------------------------------------------

	@GetMapping(value = "/books")
	public List<CharanBooks> getAllBooks() {
		System.out.println("calling the repository");
		List<CharanBooks> books = irep.getAllBooks();
		return books;
	}

	@PostMapping(value = "/addBooks")
	public ResponseEntity<String> addBooks(@RequestBody CharanBooks cb) {
		System.out.println("post");
		int ul = irep.setData(cb.getTitle(), cb.getAuthor(), cb.getPublicationYear(), cb.getIsbn(), cb.getGenre());
		if (ul == 1) {
			System.out.println("inserted");
			return ResponseEntity.ok("Data inserted successfully");
		} else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to insert data");
		}

	}

	@PutMapping(value = "/updateBooks")
	public ResponseEntity<String> updateBooks(@RequestBody CharanBooks cb) {
		System.out.println(cb);
		int ul = irep.updateBooks(cb);
		if (ul == 1) {
			System.out.println("updated");
			return ResponseEntity.ok("Data updated successfully");
		} else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to insert data");
		}
	}

	@DeleteMapping(value = "/delete")
	public ResponseEntity<String> deleteBooks(@RequestBody CharanBooks cb) {
		System.out.println("post");
		int ul = irep.deleteData(cb.getIsbn());
		if (ul == 1) {
			System.out.println("inserted");
			return ResponseEntity.ok("Data inserted successfully");
		} else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to insert data");
		}

	}

	@GetMapping(value = "/publisher")
	public List<Publisher> getAllPublisher() {
		System.out.println("calling the repository");
		List<Publisher> pub = irep.getAllPublisher();
		return pub;
	}

	@GetMapping(value = "/PublisherBooks")
	public List<CharanBooks> getPublisherBooks(Publisher pb) {
		System.out.println("calling the repository");
		List<CharanBooks> books = irep.getPublisherBooks(pb);
		return books;
	}

}
