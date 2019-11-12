package com.training.assignments.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.assignments.DeclareResult;
import com.training.assignments.exception.InvalidInputException;

public class DeclareResultTest {

	@Test
	public void testForDeclareResultWithMarksOfAllSubjectIsGreaterThanSixty() throws InvalidInputException {
		String result = DeclareResult.declaredResult(65,70,75);
		System.out.println(result);
		assertEquals("Passed", result);
	}
	
	@Test
	public void testForDeclareResultWithTwoSubjectMarksIsGreaterThanSixty() throws InvalidInputException {
		String result = DeclareResult.declaredResult(60, 65, 70);
		System.out.println(result);
		assertEquals("Promoted", result);
	}
	
	@Test
	public void testForDeclareResultWithAllSubjectMarksIsLessThanSixty() throws InvalidInputException {
		String result = DeclareResult.declaredResult(30, 99, 56);
		System.out.println(result);
		assertEquals("Failed", result);
	}
	
	@Test(expected = InvalidInputException.class)
	public void testForDeclaredResultIfMarksIsGreaterThanHundred() throws InvalidInputException {
		DeclareResult.declaredResult(150, 60, 99);		
	}

}
