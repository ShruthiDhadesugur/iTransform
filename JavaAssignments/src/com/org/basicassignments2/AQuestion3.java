package com.org.basicassignments2;

import java.util.Scanner;

public class AQuestion3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         double p,t,r;
         Scanner scanner=new Scanner(System.in);
         System.out.println("Enter Principle :");
        	p=scanner.nextDouble();	 
        System.out.println("Enter time period:");	
           t=scanner.nextDouble();
        System.out.println("Enter rate of interest");
           r=scanner.nextDouble();
         simpleInterest(p,t,r);
         compoundInterest(p, t, r);
	}
	public static void simpleInterest(double p,double t,double r)
	{
	  	double si=(p*t*r)/100;
	  	System.out.println("Obtained simple interest is "+si);
	  	System.out.println("Ammount="+(si+p));
	}
    public static void compoundInterest(double p,double t,double r)
    {
    	double ci=p*(Math.pow((1+(r/100)), t))-p;
    	System.out.println("Obtained compount interest is "+ci);
    	System.out.println("Ammount="+(ci+p));
    }
}
