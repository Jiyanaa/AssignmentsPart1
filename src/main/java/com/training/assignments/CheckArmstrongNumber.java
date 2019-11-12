package com.training.assignments;

import com.training.assignments.exception.InvalidInputException;

public class CheckArmstrongNumber {
	
	public static boolean calculate(int number) throws InvalidInputException {
		//check if given input is less than 0 then it throw exception
		if(number < 0) {
			throw new InvalidInputException("Please provide positive Integer");
		}
		
		int originalNo = number; 	//store given input number to another number
		int rem=0,result = 0;
		
		//rem variable is used to find out remainder (i.e last digit in given input)
		//loop is iterate till number value is equals to 0
		while(number != 0 ) {
			rem = number % 10;
			result += (rem * rem * rem);	//here cube of last digit from current number  is added to result variable in result variabe
			number/=10;
		}
		
		//compare original number to resultant variable if value is true then the number is Armstrong number
		if(originalNo == result) 
			return true;
		else 
			return false;	
		
	}

}
