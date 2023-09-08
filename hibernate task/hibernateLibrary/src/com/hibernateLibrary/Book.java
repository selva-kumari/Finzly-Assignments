package com.hibernateLibrary;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
@Id
private int isbn;
private String title;
private String author;
private int year;
Book(){
	
}
public Book(int isbn, String title, String author, int year) {
	this.isbn = isbn;
	this.title = title;
	this.author = author;
	this.year = year;
}
public int getIsbn() {
	return isbn;
}
public void setIsbn(int isbn) {
	this.isbn = isbn;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
@Override
public String toString() {
	return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", year=" + year + "]";
}


}
