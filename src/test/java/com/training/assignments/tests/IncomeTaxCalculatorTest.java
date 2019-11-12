package com.training.assignments.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.assignments.IncomeTaxCalculator;
import com.training.assignments.exception.InvalidInputException;

public class IncomeTaxCalculatorTest {

	@Test(expected = InvalidInputException.class)
	public void testToDisplayTaxAmountForInValidCTCAmount() throws InvalidInputException {
		double result = IncomeTaxCalculator.displayTaxAmount(-1000);
		System.out.println(result);
	}
	
	@Test
	public void testToDisplayTaxAmountForSlabA() throws InvalidInputException {
		double result = IncomeTaxCalculator.displayTaxAmount(10000);
		System.out.println(result);
		assertEquals(0.0, result,0.01);
	}
	
	@Test
	public void testToDisplayTaxAmountForSlabB() throws InvalidInputException {
		double result = IncomeTaxCalculator.displayTaxAmount(200000);
		System.out.println(result);
		assertEquals(20000.0, result,0.01);
	}
	
	@Test
	public void testToDisplayTaxAmountForSlabC() throws InvalidInputException {
		double result = IncomeTaxCalculator.displayTaxAmount(400000);
		System.out.println(result);
		assertEquals(80000.0, result,0.01);
	}
	
	@Test
	public void testToDisplayTaxAmountForSlabD() throws InvalidInputException {
		double result = IncomeTaxCalculator.displayTaxAmount(650000);
		System.out.println(result);
		assertEquals(195000.0, result,0.01);
	}
	
	
	

}
