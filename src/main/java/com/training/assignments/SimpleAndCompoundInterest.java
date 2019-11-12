package com.training.assignments;

import com.training.assignments.exception.InvalidInputException;

public class SimpleAndCompoundInterest {
	
	public static double[] calculateInterest(double principleAmount, double rate, double time) throws InvalidInputException {
		if(principleAmount<1 || rate <1 || time<1) {
			throw new InvalidInputException("Please Provide Positive Input");
		}
		
		double simpleInterest,compoundInterest;
		int index=0;
		
		double[] resultArray = new double[2];
		
		simpleInterest = (principleAmount * time * rate)/100;
		compoundInterest = principleAmount * Math.pow(1.0+rate/100.0, time) - principleAmount;
	
	    System.out.println("Simple Interest="+simpleInterest);
	    System.out. println("Compound Interest="+compoundInterest);
	    
	    resultArray[index] = simpleInterest;
	    index+=1;
	    resultArray[index] = compoundInterest;
	    return resultArray;
	}
 
}
