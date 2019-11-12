package com.training.assignments.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.assignments.CheckArmstrongNumber;
import com.training.assignments.PrintArmstrongNumberBetweenRange;
import com.training.assignments.exception.InvalidInputException;

public class PrintArmstrongNumberBetweenRangeTest {

	@Test
	public void testPrintArmStrongNumberWithVaidRange() throws InvalidInputException {
		int[] actualArr=PrintArmstrongNumberBetweenRange.calculate();
		
		int[] expectedArr = {153,370,371,407,0};
		assertArrayEquals(expectedArr, actualArr);
	}
	
}
