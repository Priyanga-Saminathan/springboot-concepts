package com.example.MyFirstApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
	private final BookService bookservice;
	@Autowired
	public BookController(BookService bookservice) {
		System.out.println("Controler works");
		this.bookservice=bookservice;
	}
	@Autowired
	Order order;
	@PostMapping("/addBook")
	public ResponseEntity<BookDetails> addBook(@RequestBody BookDetails bookdetails) {
		BookDetails saveBook=bookservice.addBook(bookdetails);
		System.out.println("Order:"+this.order);
		return ResponseEntity.ok(saveBook);
	}
	@GetMapping("/getBook/{bookname}")
	public ResponseEntity<BookDetails> getBook(@PathVariable ("bookname")String name){
			BookDetails getName=bookservice.getBook(name);
			return ResponseEntity.ok(getName);
		
	}
	@PutMapping("/updateBook")
	public ResponseEntity<BookDetails> updateBook(@RequestBody BookDetails bookdetails){
		BookDetails updatedBook=bookservice.updateBook(bookdetails);
		return ResponseEntity.ok(updatedBook);
	}
	@DeleteMapping("/deleteBook/{id}")
	public ResponseEntity<BookDetails> deleteBook(@PathVariable("id") Integer id){
		bookservice.deleteBook(id);
		return ResponseEntity.ok().build();
	}
}
