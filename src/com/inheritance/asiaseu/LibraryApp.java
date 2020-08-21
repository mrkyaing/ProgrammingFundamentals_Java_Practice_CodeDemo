package com.inheritance.asiaseu;

public class LibraryApp {

	public static void main(String[] args) {
		Book book1=new Book(1,"Java Programming",3000,"009123456");
		System.out.println(book1);
		
		Book book2=new Book(2,"Database Fundamentals",5000,"009123457");
		System.out.println(book2);
		
		Author author1=new Author("David Jone","david@gmail.com",'M',book1);
		author1.print();
		author1.printAuthorWriteBook();
		
		Author author2=new Author("Smith","smith@gmail.com",'M',book2);
		author2.print();
		author2.printAuthorWriteBook();
		Book book3=new Book(3,"Data Structure and Algorithm",4000,"009123458");
		System.out.println(book3);
		Author author3=new Author("sunny jone","sunny@gmail.com",'M',book3);
		author3.printAuthorWriteBook();//

		
	}

}
