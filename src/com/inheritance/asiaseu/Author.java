package com.inheritance.asiaseu;

public class Author {
private String name,email;
private char gender;
Book book;// has-A relation ( author and book)>>aggregation mode
public Author(String name,String email,char gender,Book Authorbook) {
	this.name=name;
	this.email=email;
	this.gender=gender;
	this.book=Authorbook;
}

public String getName() {
	return this.name;
}
public void setEmail(String email) {
	if(!email.contains("@")) {
		throw new IllegalArgumentException("invalid email address ");
	}
	this.email=email;
}
public String getEmail() {
	return this.getEmail();
}
public char getGender() {
	return this.gender;
}
public void print() {
	System.out.println("===========================================");
	System.out.println(this.name+"("+this.gender+") at "+this.email);
	System.out.println("===========================================");
}
public void printAuthorWriteBook() {
	System.out.println("===========================================");
	System.out.println(this.name+" Write "+this.book.getBookName());
	System.out.println("===========================================");
}
}
