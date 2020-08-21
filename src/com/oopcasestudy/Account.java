package com.oopcasestudy;

import java.text.DecimalFormat;

public class Account {
	//data field
private int accountNumber;
private double balance=0.0;

public Account(int accountNumber,double balance) {
	if(accountNumber<=0) {
		throw new IllegalArgumentException("invalid account number");
	}
	if(balance<0) {
		throw new IllegalArgumentException("invalid balance amount");
	}
	this.accountNumber=accountNumber;
	this.balance=balance;
}

public void print() {
	DecimalFormat df2 = new DecimalFormat("#.##");
	System.out.println("A/C no:"+this.accountNumber+" Balance=$"+df2.format(this.balance));
}

public int getAccount() {
	return this.accountNumber;
}

public double getBalance() {
	return this.balance;
}

public void setBalance(double balance) {
	if(balance<0) {
		throw new IllegalArgumentException("invalid balance amount");
	}
	this.balance=balance;
}
public void credit(double amount) {
	if(amount<0) {
		throw new IllegalArgumentException("invalid credit amount");
	}
	this.balance+=amount;
}
public void debit(double amount) {
	if(amount<0) {
		throw new IllegalArgumentException("invalid debit amount");
	}
	if(amount>balance) {
		throw new IllegalArgumentException("amount withdrawn exceeds the current balance! your current balance is "+this.balance); 
	}
	this.balance-=amount;
}

}
