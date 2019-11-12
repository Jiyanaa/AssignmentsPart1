package com.training.assignments.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.assignments.TotalAndAverageMarkCalculator;

public class TotalAndAverageMarkCalculatorTest {

	@Test
	public void testToFindOutAverageAndTotal() {
		int[][] array = {{35,60,76},{65,80,98},{90,88,56}};
		TotalAndAverageMarkCalculator.findTotalAndAverageMark(array);
	}

}
