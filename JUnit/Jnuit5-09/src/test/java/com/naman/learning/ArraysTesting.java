package com.naman.learning;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ArraysTesting {

	@Test
	void testArray() {
		int []expected = {2,4,5,6};
		int []actual = {4,5,6,2};
	
		Arrays.sort(actual);
//		assertArrayEquals(expected,actual); // checks the elements present in the array
		assertEquals(expected,actual); // checking the reference of 2 different objects Hash Code
		
	
	}

}
