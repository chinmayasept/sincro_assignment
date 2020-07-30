package com.christmas.discount;

public class DiscountFactory {

	// use getDiscount method to get object of type Customer
	public static ChristmasDiscount getDiscountType(String customerType) {
		
		if (customerType == null) {
			return null;
		}
		if (customerType.equalsIgnoreCase("REGULAR")) {
			return new RegularCustomer();
		} else if (customerType.equalsIgnoreCase("PREMIUM")) {
			return new PremiumCustomer();
		} 
		return null;
	}
}
