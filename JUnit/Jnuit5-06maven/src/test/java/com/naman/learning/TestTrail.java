package com.naman.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTrail {

	@Test
	void test() {
		assertEquals(6,6);
	}
	@Test
	void testcomputeSquareArea()
	{
		Shapes shape = new Shapes();
//		assertEquals(57,shape.computeSquareArea(24),"Area of circle calculation is incorrect.");
		assertEquals(576,shape.computeSquareArea(24),"Area of circle calculation is incorrect.");
		
	}
	@Test
	void testcomputeSquareArea_Supplier()
	{
		Shapes shape = new Shapes();
		//supplier is the functional interface ..
		//It executes if failed test case and is more efficient.
		//in the previous one if the assertEquals passes or not passes it will be evaluated but in this Supplier it only evaluates if the test case fails
//		assertEquals(57,shape.computeSquareArea(24),"Area of circle calculation is incorrect.");
		assertEquals(576,shape.computeSquareArea(24),()->"Area of circle calculation is incorrect.");
		
	}
	

}
