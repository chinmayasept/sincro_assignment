package com.christmas.discount;

public class PremiumCustomer implements ChristmasDiscount {

	@Override
	public double getDiscount(double value) {
		double discountCalc = 0;
		double finalPrice = 0;
		if (value <= 4000) {
			discountCalc = value * 0.1;
			;
		} else if (value > 4000 && value <= 8000) {
			discountCalc = value * 0.15;
		} else if (value > 8000 && value < 12000) {
			discountCalc = value * 0.2;
		} else if (value > 12000) {
			discountCalc = value * 0.3;
		}
		finalPrice = value - discountCalc;
		System.out.println("The final price for premium..." + finalPrice);
		return finalPrice;
	}

}
