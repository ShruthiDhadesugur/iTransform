package com.basicassignment;

public class ComplexNumber {
	private float real,imag;	
	ComplexNumber()
	{
		real=0;
		imag=0;
	}
	ComplexNumber(float Comp1,float Comp2)
	{
		real=Comp1;
		imag=Comp2;
	}	
	void  Add(ComplexNumber C1,ComplexNumber C2)
	{
		this.real = (C1.real + C2.real); 
		this.imag = (C1.imag + C2.imag);
		System.out.println("Answer is:("+this.real+") + ("+this.imag+")i" );		
	}
	void Subtract(ComplexNumber C1,ComplexNumber C2)
	{
		
		this.real = (C1.real - C2.real); 
		this.imag = (C1.imag - C2.imag);
		System.out.println("Answer is:("+this.real+") + ("+this.imag+")i" );		
	}
	void Multiply(ComplexNumber C1,ComplexNumber C2)
	{
		this.real = (C1.real*C2.real - C1.imag*C2.imag); 
		this.imag = (C1.real*C2.imag + C2.real*C1.imag);
		System.out.println("Answer is:("+this.real+") + ("+this.imag+")i" );	
	}
	 public static void Swap(ComplexNumber c1,ComplexNumber c2)
	 {
	 ComplexNumber temp3=new ComplexNumber(0, 0);
	 temp3.real=c1.real;
	 c1.real=c2.real;
	 c2.real=temp3.real;
	 temp3.imag=c1.imag;
	 c1.imag=c2.imag;
	 c2.imag=temp3.imag;
	 System.out.println("swapped numbers are :"+" "+c1.real+"+"+c1.imag+"i"+" & "+c2.real+"+"+c2.imag);
	 }
}
