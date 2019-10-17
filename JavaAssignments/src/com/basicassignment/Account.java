package com.basicassignment;


public class Account {
	static int balance = 5000, withdraw, deposit;

	public static void withdrawM(int withdraw) {
	 if (balance >= withdraw) {
	  balance = balance - withdraw;
	  
	  
	  System.out.println("money succesfully withdrawn");
	  System.out.println("Account balance is "+balance);
	 } else {
	  System.out.println("Insufficient Balance");
	 }
	 System.out.println("");
	}

	public static void depositM(int deposit) {
	 balance = balance + deposit;
	 System.out.println("Your Money has been successfully depsited");
	 System.out.println("");
	 System.out.println("Account balance is :"+balance);


	}
  
}
