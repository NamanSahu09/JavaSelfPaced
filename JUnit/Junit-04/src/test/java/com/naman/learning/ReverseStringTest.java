package com.naman.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {
	ReverseString obj = new ReverseString();
	@Test
	void testReverseString_OneWord() 
	{
		
		String expected = obj.reverseString("Java");
		assertEquals("avaJ",expected);
		
	}
	@Test
	void testReverseString_MultipleWords()
	{
		
		assertEquals("ysae si avaJ",obj.reverseString("Java is easy"));
	
		
	}

}
