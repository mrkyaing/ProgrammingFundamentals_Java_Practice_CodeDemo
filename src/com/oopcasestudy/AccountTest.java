package com.oopcasestudy;

public class AccountTest {

	public static void main(String[] args) {
		try {
			Account acc1=new Account(12345,0);	
			System.out.println(acc1.getAccount());
			acc1.setBalance(2000);
			System.out.println(acc1.getBalance());//2000
			acc1.credit(55.6);
			System.out.println(acc1.getBalance());//3000
			acc1.credit(77.8);
			System.out.println(acc1.getBalance());//4000
			acc1.credit(500.5708028348908000);//11000
			acc1.credit(4000.543);//15000
			System.out.println(acc1.getBalance());//0
			acc1.print();//
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
