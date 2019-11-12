package com.training.assignments.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.assignments.CUIBasedApplication;
import com.training.assignments.exception.InvalidInputException;

public class CUIBasedApplicationTest {

	@Test
	public void testForValidLoginCredentials() throws InvalidInputException {
		String result = CUIBasedApplication.login("admin","admin123");
		System.out.println(result);
		assertEquals("Welcome admin", result);
		
	}
	
	@Test
	public void testForInValidLoginCredentials() throws InvalidInputException {
		String result = CUIBasedApplication.login("admin","admin");
		System.out.println(result);
		assertEquals("Contact Admin", result);	
	}
	
	@Test(expected = InvalidInputException.class)
	public void testForEmptyUsernameAndPassword() throws InvalidInputException {
		String result = CUIBasedApplication.login("","");
	}
	
	

}
