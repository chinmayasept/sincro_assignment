package com.christmas.discount.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.christmas.discount.DiscountFactory;

public class TestDiscount {

	@Test(expected = NullPointerException.class)
	public void testChristmasDiscountInvalidCustomerType() {
		assertEquals(9000.00, DiscountFactory.getDiscountType("EGULAR").getDiscount(10000), 0.0);
		assertEquals(8000.00, DiscountFactory.getDiscountType("PREMIU").getDiscount(10000), 0.0);
		assertEquals(9000.00, DiscountFactory.getDiscountType("null").getDiscount(10000), 0.0);
		assertEquals(8000.00, DiscountFactory.getDiscountType("null").getDiscount(10000), 0.0);
	}
	
	@Test
	public void testChristmasDiscountValidCustomerType() {
		assertEquals(9000.00, DiscountFactory.getDiscountType("REGULAR").getDiscount(10000), 0.0);
		assertEquals(8000.00, DiscountFactory.getDiscountType("PREMIUM").getDiscount(10000), 0.0);
	}

}
