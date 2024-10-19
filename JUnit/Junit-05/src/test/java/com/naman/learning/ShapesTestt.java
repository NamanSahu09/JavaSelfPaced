package com.naman.learning;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapesTestt {

	Shapes obj = new Shapes();
	   @Test
	    public void testcomputeSquareArea() {
	        // Test square area calculation
	        assertEquals(576, obj.computeSquareArea(24), 0);  // No delta needed for integer values
	    }

	    @Test
	    public void testcomputeCircleArea() {
	        // Test circle area calculation with a small delta for floating-point comparison
	        assertEquals(78.5, obj.computeCircleArea(5), 0.01);  // Added a delta of 0.01 for floating-point precision
	    }

}
