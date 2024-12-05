package com.example.MyFirstApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	@Autowired
	BookRepository bookrepository;
	public BookDetails addBook(BookDetails bookdetails) {
		
		System.out.println("Service works");
		return bookrepository.save(bookdetails);
	}
	public BookDetails getBook(String name) {
		// TODO Auto-generated method stub
		return bookrepository.findByName(name);
	}
	public BookDetails updateBook(BookDetails bookdetails) {
		// TODO Auto-generated method stub
		return bookrepository.save(bookdetails);
	}
	public void deleteBook(Integer id) {
		// TODO Auto-generated method stub
		bookrepository.deleteById(id);;
	}
}
