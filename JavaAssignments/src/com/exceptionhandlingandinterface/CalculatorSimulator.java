package com.exceptionhandlingandinterface;

public class CalculatorSimulator {

	public static void main(String[] args) throws AccuredException {
		// TODO Auto-generated method stub
      TaxCalculator tx=new TaxCalculator();
      
      System.out.println("Tax ammount is "+tx.calculateTax("", true , 55000));
	}

}
