package com.inheritance.asiaseu;

public class Book {
	private int bookid;
	private String bookName;
	private double bookPrice;
	private String ISBN;
	
	public Book(int bookid,String bookName,double bookPrice,String ISBN) {
		this.bookid=bookid;
		this.bookName=bookName;
		this.bookPrice=bookPrice;
		this.ISBN=ISBN;
	}
	
	public String toString() {		
		return "["+this.bookid+","+this.bookName+","+this.bookPrice+","+this.ISBN+"]";
	}
	public String getBookName() {
		return this.bookName;
	}
}
