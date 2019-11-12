package com.training.assignments.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.assignments.CheckArmstrongNumber;
import com.training.assignments.exception.InvalidInputException;

public class CheckArmstrongNumberTest {

	@Test
	public void testCheckArmStrongNumberWithValidNo() throws InvalidInputException {
		assertEquals(true, CheckArmstrongNumber.calculate(371));
	}
	
	@Test
	public void testForNotArmstrongNo() throws InvalidInputException {
		assertEquals(false, CheckArmstrongNumber.calculate(150));
	}
	
	@Test(expected = InvalidInputException.class )
	public void testCheckArmstrongNoWithInvalidInputNegativeNo() throws InvalidInputException{
		CheckArmstrongNumber.calculate(-12);
	}

}
