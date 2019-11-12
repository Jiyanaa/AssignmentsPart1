package com.training.assignments;

import com.training.assignments.exception.InvalidInputException;

public class IncomeTaxCalculator {
	
	public static double displayTaxAmount(double ctc) throws InvalidInputException {
		double tax = 0.0;
		if(ctc >= 0 && ctc <= 180000) {
			return tax;
		}
		else if(ctc >= 180001 && ctc <= 300000) {
			tax = ctc * 10/100;
			return tax;
		}
		else if(ctc >= 300001 && ctc <= 500000) {
			tax = ctc * 20/100;
			return tax;
		}
		else if(ctc >= 500001 && ctc <= 1000000) {
			tax = ctc * 30/100;
			return tax;
		}
		else {
			throw new InvalidInputException("Invalid Input Number:Please Enter Positive Number");
		}
	}

}
