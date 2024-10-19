package com.naman.learning;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalciTest2 {

	@Test
	public void test() {
		Calci c = new Calci();
		int actual = c.divide(10, 5);
		int expectedResult = 2;
		assertEquals(expectedResult, actual);
	}

}
