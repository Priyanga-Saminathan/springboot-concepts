package com.example.MyFirstApp;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDetails {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String author;
	private String genre;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	public String getAuthor() {
		return this.author;
	}
	public void setGenre(String genre) {
		this.genre=genre;
	}
	public String getGenre() {
		return this.genre;
	}
}
