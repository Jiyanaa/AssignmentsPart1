package com.training.assignments.tests;

import static org.junit.Assert.*;

import java.text.ParseException;

import org.junit.Test;

import com.training.assignments.DateFormat;
import com.training.assignments.exception.InvalidDateFormatException;

public class DateFormatTest {

	@Test
	public void testToConvertDateIntoSpecifiedPatternWithValidInput() throws ParseException{
		String date = DateFormat.convertDateToSpecifiedFormat("12,03,2014");
		assertEquals("12/March/2014", date);
		
	}
	
	
}
