package com.oop.asiazeu.abstractionDemo;

public class SpeakingDemo {

	public static void main(String[] args) {
		ISay sl=new SpeakLanguage();
		System.out.println("spekating operations ");
		sl.sayAsBurmese();
		sl.sayAsJapanese();
		sl.sayAsChinese();
		IDbOperation db=new SpeakLanguage();
		System.out.println("db operations functions");
		db.insert();
		db.delete();
		db.getAll();
		db.upate();
	
	}

}
