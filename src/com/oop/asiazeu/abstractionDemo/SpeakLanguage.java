package com.oop.asiazeu.abstractionDemo;
public class SpeakLanguage implements ISay,IDbOperation{
	@Override
	public void sayAsBurmese() {
		System.out.println("မင်္ဂလာပါဗျာ");
	}
	@Override
	public void sayAsJapanese() {
		System.out.println("Ohai YogoZaiMasu!!");
	}
	@Override
	public void sayAsChinese() {
		System.out.println("NeiHong!!!");	
	}
	@Override
	public void insert() {
		System.out.println("saving data");
		
	}
	@Override
	public void upate() {
	System.out.println("updating data.");
		
	}
	@Override
	public void delete() {
		System.out.println("deleting data.");
		
	}
	@Override
	public void getAll() {
		System.out.println("getting all data.");
		
	}

}
