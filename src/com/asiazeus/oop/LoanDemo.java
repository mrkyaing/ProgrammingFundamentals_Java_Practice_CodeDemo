package com.asiazeus.oop;

public class LoanDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Loan homeloan=new Loan();
     homeloan.CheckBalance();
     homeloan.setAccountNo("123456789");
     homeloan.setDeposite(20);
     homeloan.CheckBalance();
     homeloan.setWithdraw(10);
     homeloan.CheckBalance();
     homeloan.setWithdraw(10);
     homeloan.CheckBalance();
     homeloan.setDeposite(50);
     homeloan.setWithdraw(10);
     
	}

}
