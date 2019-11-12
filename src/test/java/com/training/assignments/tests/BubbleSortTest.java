package com.training.assignments.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.assignments.BubbleSort;

public class BubbleSortTest {

	@Test
	public void testToSortArrayUsingBubbleSort() {
		int[] inputArray = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int[] expectedArray = {1 ,5, 6, 7 ,12, 14 ,19 ,23 ,26 ,35, 37, 47 ,52 ,78, 86};
		int[] actualArray = BubbleSort.sortArrayUsingBubbleSort(inputArray);
	
		assertArrayEquals(expectedArray, actualArray);
	}

}
