package com.naman.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

//Instance ek baar hoga aur uska refernce se sab chalega constructor bas ek bar chalega
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestBeforeAfter {
	TestBeforeAfter()
	{

		System.out.println("Test Obj is created in constructor/");
	}

	@BeforeAll
	static void beforeAll()
	{
		System.out.println("Before All TEST");
	}
	
	@AfterAll
	static void afterAll()
	{
		System.out.println("After All TEST");
	}
	
	
	Shapes shape;
	
	@BeforeEach
	void init()
	{
		shape = new Shapes();
		System.out.println("Before Test");
	}
	@Test
	void testcomputeSquareArea()
	{
		
		assertEquals(576,shape.computeSquareArea(24));
		System.out.println("Actual Test Running");
		
	}
	@Test
	void testcomputeSquareArea_Supplier()
	{
		
		assertEquals(576,shape.computeSquareArea(24));
		System.out.println("Actual Test Running");
	}
	
	@AfterEach
	void destroy()
	{
		System.out.println("After Each");
	}

}
