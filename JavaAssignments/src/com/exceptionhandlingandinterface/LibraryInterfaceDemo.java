package com.exceptionhandlingandinterface;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      KidUser k=new KidUser();
      k.registerAccount(18);
      k.registerAccount(10);
      k.requestBook("Kids");
      k.requestBook("Fiction");
      
      AdultUser a=new AdultUser();
      a.registerAccount(5);
      a.registerAccount(23);
      a.requestBook("Kids");
      a.requestBook("Fiction");
      
	}

}
