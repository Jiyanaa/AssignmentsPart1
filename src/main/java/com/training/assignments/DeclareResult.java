package com.training.assignments;

import com.training.assignments.exception.InvalidInputException;

public class DeclareResult {

	public static String declaredResult(double subject1, double subject2, double subject3) throws InvalidInputException {
		//if given input marks are less than 0 and greater than 100 throw exception
		if((subject1<0 || subject1>100) || (subject2<0 || subject2>100) || (subject3<0 || subject3>100))
			throw new InvalidInputException("Marks should be positive and less than 100.");
		
		/*	code for declared result based on subject marks
			1.all the subject marks is greater than 60
			2.any two subject marks is greater than 60
			3.any one or all subject marks is less than 60
		*/
		if(subject1 > 60 && subject2 >60 && subject3>60)
			return "Passed";
		else if((subject1>60 && subject2>60 && subject3<61 ) || (subject1<61 && subject2>60 && subject3>60 ) || (subject1>60 && subject2<61 && subject3>60))
			return "Promoted";	
		else
			return "Failed";
	}

}
