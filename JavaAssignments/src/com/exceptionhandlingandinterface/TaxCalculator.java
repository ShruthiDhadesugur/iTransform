package com.exceptionhandlingandinterface;

public class TaxCalculator {

	public int calculateTax(String empName, boolean isIndian, int empSal) throws AccuredException {
		int  taxAmmount;
	
		
			if(isIndian==false) {
				throw new AccuredException("CountryNotValidException");
			}
			
			else if(empName.isEmpty()) {
				throw new AccuredException("EmployeeNameInvalidException");
			}
			else {
				if(empSal>100000) {
					taxAmmount=empSal*8/100;
				}
				else if(100000>empSal && empSal>50000) {
					taxAmmount=empSal*6/100;
				}
				else if(empSal>30000 && empSal<50000) {
					taxAmmount=empSal*5/100;
				}
				else if(empSal>10000 && empSal<30000) {
				    taxAmmount=empSal*4/100;
				}else {
					throw new AccuredException("TaxNotEligibleException");
				
				}
				return taxAmmount;
			}
      
	
	
	
	
	
	
	
	}
	
	
}
