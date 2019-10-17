package com.org.basicassignments2;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter sub1 marks");
		int subject1=scanner.nextInt();
		System.out.println("Enter sub2 marks");
		int subject2=scanner.nextInt();
		System.out.println("Enter sub3 marks");
		int subject3=scanner.nextInt();
		
      if(subject1>60 && subject2>60 && subject3>60)
      {
    	  System.out.println("passed");
      }
      else if(subject1>60 && subject2>60 ||subject2>60 && subject3>60 ||subject3>60&& subject1>60)
      {
    	  System.out.println("promoted");
      }
	
      else if(subject1>60 && subject2<60 &&subject3<60 ||subject2>60 && subject3<60 &&subject1<60 ||subject3>60 && subject1<60 &&subject2<60)
	{
		System.out.println("fail");
	
	}
      else
      {
    	  System.out.println("fail");
      }
  	scanner.close();
	}
}
