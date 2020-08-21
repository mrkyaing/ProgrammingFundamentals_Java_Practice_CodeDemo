package com.book.lib;

public class BookLibDemo {

	public static void main(String[] args) {
		Author author1=new Author("Smith","smith@bmail.com",'M',"NO(12),smooth steet,USA");
		Book mybook=new Book("Java Advance ",20,50,author1);
		
	    author1.DisplayInf();
        mybook.DisplayInfo();
         
        Author author2=new Author("David Jone","jone@gmail.com",'M',"NO(12),smooth steet,USA");
        author2.DisplayInf();
        Book mybook2=new Book("C# Advance ",20,50,author2);
        mybook2.DisplayInfo();
	}

}
