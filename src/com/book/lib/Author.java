package com.book.lib;

public class Author {
private String AuthorName;
private String Email;
private char gender;
private String Address;
//here is constructor to pass the data.
public Author(String authorName, String email, char gender, String address) {
	AuthorName = authorName;
	Email = email;
	this.gender = gender;
	Address = address;
}
public String getAuthorName() {
	return AuthorName;
}


public void DisplayInf() {
	System.out.println("Author Name:"+AuthorName);
	System.out.println("Author Email Address:"+Email);
	System.out.println("Author Gender"+gender);
	System.out.println("Autor's Address "+Address);
	System.out.println();
}


}
