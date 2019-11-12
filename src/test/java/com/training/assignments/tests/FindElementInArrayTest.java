package com.training.assignments.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.assignments.FindElementInArray;

public class FindElementInArrayTest {

	@Test()
	public void testToCheckNoContaineInArrayWithValidInput() {
		boolean actualResult = FindElementInArray.checkNoIsPresentInArrayOrNot(19);
		assertEquals(true, actualResult);
	}
	
	@Test
	public void testtoCheckNoNotContaineInArray() {
		boolean actualResult = FindElementInArray.checkNoIsPresentInArrayOrNot(200);
		assertEquals(false, actualResult);
	}

}
