package com.basicassignment;

import java.util.Scanner;

public class Question6 {
  public static void main(String[] args) 
  {   
	  
	  Account acc=new Account();
	  
  
	  Scanner s = new Scanner(System.in);
	  while (true) {
	   System.out.println("Automated Teller Machine");
	   System.out.println("Choose 1 for Withdraw");
	   System.out.println("Choose 2 for Deposit");
	   System.out.println("Choose 3 for EXIT");
	   System.out.print("Choose the operation you want to perform:");
	   int n = s.nextInt();
	   switch (n) {
	   case 1:
	    System.out.print("Enter money to be withdrawn:");
	    int w= s.nextInt();
	    acc.withdrawM(w);
	    break;

	   case 2:
	    System.out.print("Enter money to be deposited:");
	    int d = s.nextInt();
	    acc.depositM(d);
	    break;

	   case 3:
	    System.exit(0);

	   }
	  }
  
  }
}

