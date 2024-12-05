package com.example.MyFirstApp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookDetails, Integer>{
//	System.out.println("Repo works");
	public BookDetails findByName(String name);
}
