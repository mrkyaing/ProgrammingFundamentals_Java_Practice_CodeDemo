package com.asiazeus.oop;

public class Loan {
private String AccountNo;
private double withdraw;
private double deposite;
public double balance;
public void DisplayLoanInfo() {
	System.out.println("Account No:"+AccountNo);
	System.out.println("Withdraw Amt :"+withdraw);
	System.out.println("Deposite  Amt:"+deposite);
	System.out.println("Balance amt :"+balance);
}
public void setAccountNo(String accountNo) {
	if(accountNo!=null || !accountNo.equals("")) {
		AccountNo = accountNo;
	}else {
		System.out.println("Invalid your account");
		System.exit(0);
	}
	
}
public void setWithdraw(double withdraw) {
	if(balance>withdraw) {
		this.withdraw = withdraw;
		System.out.println("you can withdraw with the amount of "+withdraw);
	}else {
		System.out.println("your can't withdraw .check your balance");
		System.exit(0);
	}
	
}
public void setDeposite(double deposite) {
	if(deposite>0) {
		balance+=deposite;
		System.out.println("deposite is sucess .Now your balance is"+balance);
	}
	
}

public void CheckBalance() {
	balance-=withdraw;
	System.out.println("your balance is"+balance);
}

}
