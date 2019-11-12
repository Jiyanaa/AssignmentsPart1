package com.training.assignments.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.assignments.SimpleAndCompoundInterest;
import com.training.assignments.exception.InvalidInputException;

public class SimpleAndCompoundInterestTest {

	@Test
	public void testToCalculateSimpleAndCompoundInterest() throws InvalidInputException {
		double actualArray[] = SimpleAndCompoundInterest.calculateInterest(20000,5,2);
		double expectedArray[] = {2000.0,2050.0};
		assertArrayEquals(expectedArray, actualArray, 0.01);
	}
	
	@Test(expected = InvalidInputException.class)
	public void testToCalculateInterestForNegativeInput() throws InvalidInputException {
		SimpleAndCompoundInterest.calculateInterest(-2000, 2, 2);
	}

}
