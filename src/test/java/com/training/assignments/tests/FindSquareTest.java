package com.training.assignments.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.assignments.FindSquare;

public class FindSquareTest {

	@Test
	public void testToCalculateSquareOfPositiveNo() {
		System.out.println("Square:" + FindSquare.findSquare(2));
		assertEquals(4,FindSquare.findSquare(2));
	}
	
	@Test
	public void testToCalculateSquareOfNegativeNo() {
		System.out.println("Square:" + FindSquare.findSquare(2));
		assertEquals(4,FindSquare.findSquare(-2));
	}
}
