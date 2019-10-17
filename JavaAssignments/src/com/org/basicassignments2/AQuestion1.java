package com.org.basicassignments2;

import java.util.Scanner;

public class AQuestion1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     int var=0;
     Scanner scanner=new Scanner(System.in);
     System.out.println("Enter the number to checked");
     int number=scanner.nextInt();
     int temp=number;
     while(number>0)
    {
    	 int a=number%10;  
 	    number=number/10;  
 	   var=var+(a*a*a); 
    }
     if(temp==var)  
 	    System.out.println("armstrong number");   
 	    else  
 	        System.out.println("Not armstrong number"); 
 	    scanner.close();
    }

}
