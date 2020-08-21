package com.book.lib;

public class Book {
private String BookName;
private int Qty;
private int price;

//author and book is have a relatioship here
private Author author;

public Book(String bookName, int qty, int price, Author author) {
	BookName = bookName;
	Qty = qty;
	this.price = price;
	this.author = author;
}

public void DisplayInfo() {
	System.out.println("Book Name:"+BookName);
	System.out.println("Book Qualitity "+Qty);
	System.out.println("Book Price "+price);
	System.out.println(BookName+"'s Author is "+author.getAuthorName());
	System.out.println();
}

}
