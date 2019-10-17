package com.contactapplication;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;




public class ContactApplication {
	

	 private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args)
	{
		
		String name;
		Long number;
		
		ContactList cl=new ContactList();
		 boolean quit = false;
		while (!quit) {
	            System.out.println("Enter your"
	            		+ " choice: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine();

	            switch (choice) {
	                case 0:
	                    printInstructions();
	                    break;
	                case 1:
                         cl.adding();
	                	break;
	                case 2:
	                    cl.searching();
	                    break;
	                case 3:
	                    cl.deleting();
	                    break;
	                case 4:
	                	cl.updating();
	                	break;
	                case 5:
	                    quit = true;
	                    break;
	            }
		
		
    }

	
  }
	
	private static void printInstructions() {
		// TODO Auto-generated method stub
		
	}
}
