package com.naman.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RevStringTest {

	@Test
	void test() 
	//can be public private protected or default in JUnit Jupyter 5
	{
		RevString reverse = new RevString();
		String actual = reverse.reverseString("Java");
		String expected = "avaJ";
		assertEquals(expected , actual);
		assertEquals("neilA", reverse.reverseString("Alien"));
		
		
		
	
	}

}
