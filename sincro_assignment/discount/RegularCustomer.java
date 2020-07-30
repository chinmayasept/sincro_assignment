package com.christmas.discount;

public class RegularCustomer implements ChristmasDiscount {

	@Override
	public double getDiscount(double value) {
		double discountCalc = 0;
		double finalPrice = 0;
		if (value <= 5000) {
			discountCalc = 0;
		} else if (value > 5000 && value <= 10000) {
			discountCalc = value * 0.1;
		} else if (value > 10000) {
			discountCalc = value * 0.2;
		}
		finalPrice = value - discountCalc;
		System.out.println("The final price for regular ..." + finalPrice);
		return finalPrice;
	}

}
