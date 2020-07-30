package com.christmas.discount;

public class DiscountedPricingToCustomer {

	public static void main(String[] args) {

		ChristmasDiscount regDiscount = DiscountFactory.getDiscountType("REGULAR");

		regDiscount.getDiscount(10000);

		ChristmasDiscount premDiscount = DiscountFactory.getDiscountType("PREMIUM");

		premDiscount.getDiscount(10000);
		

	}

}
