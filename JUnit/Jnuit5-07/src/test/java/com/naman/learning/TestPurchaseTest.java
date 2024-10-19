package com.naman.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.learning.dao.JavaCourse;
import com.naman.service.PurchaseCourse;

class TestPurchaseTest {

	@Test
	void testproceedWithCourse() {
		PurchaseCourse pc = new PurchaseCourse();
		boolean status = pc.proceedWithCourse(new JavaCourse());
//		assertTrue(status);
		assertFalse(status,"It is falied because unit is results in true.");
	}

}
