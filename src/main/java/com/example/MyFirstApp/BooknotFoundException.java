package com.example.MyFirstApp;

public class BooknotFoundException extends RuntimeException{
	public BooknotFoundException(String message) {
		super(message);
	}
}
