package com.naman.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestException {

//	@Test
//	void testSortingArray_Exception() 
//	{
//		try
//		{
//	   SortingArray array = new SortingArray();
//	   int unsorted[] = {15,6,4};
//	   int sortedArray[] = array.sortingArray(unsorted);
//	     for(int elem:sortedArray)
//	     {
//		   System.out.println(elem);
//	     }
//	     System.out.println("Statements below exception ");
//	     fail();//fail explicitly 
//		}
//		catch(NullPointerException e)
//		{
//			System.out.println("Exception generated");
//		}
		@Test
		void testSortingArray_Exception()
		{
			SortingArray array = new SortingArray(); int unsorted[] = null;
			assertThrows(NullPointerException.class,()-> array.sortingArray(unsorted));
		}


	}


