package com.naman.learning;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class SortingArrray {

	@Test
	void testSortingMethod_Performance()
	{
		SortingArray array = new SortingArray();
		int unsorted[] = {2,5,1};
		assertTimeout(Duration.ofMillis(100),()->array.sortingArray(unsorted));
	}
	// Using anonymous inner class instead of lambda
//    assertTimeout(Duration.ofMillis(10), new Executable() {
//        @Override
//        public void execute() throws Throwable {
//            array.sortingArray(unsorted);  // Call the method directly here
//        }
//    });

}
