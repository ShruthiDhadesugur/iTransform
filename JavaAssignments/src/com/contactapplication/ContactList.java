package com.contactapplication;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class ContactList {

		Map<String,Long> map=new HashMap<String,Long>();
		String name;
		Long number;
	 private static Scanner scanner = new Scanner(System.in);


	public void adding() 
	{
		name=scanner.next();
		number=scanner.nextLong();
		map.put(name,number);		
 	}
	public void searching() 
	{
		System.out.println("Enter name to be searched");
		name=scanner.next();
		if(map.containsKey(name))
		System.out.println("name: "+map.get(name)+" "+"Number: "+map.get(number));
		else
		System.out.println("Contact not found");
	}
	public void deleting()
	{
		System.out.println("Enter name to be deleted");
		name=scanner.next();
		if(map.containsKey(name))
	    {
			map.remove(name);
		System.out.println("Contact deleted");
		}
		else
			System.out.println("contact not found");
	}
	public void updating() 
	{
		System.out.println("Enter the contact name to be update");
		name=scanner.next();
		if(map.containsKey(name))
		{
			number=scanner.nextLong();
			map.replace(name,number);
		}
	}
	
}
