package com.thanglequoc.decorator.starbuzz;

public class Espresso extends Beverage {
    
    private static double ESPRESSO_BASE_PRICE = 2.99;
    
    @Override
    public String getDescription() {
        return "Espresso";
    }
    @Override
    public double cost() {
	// TODO Auto-generated method stub
	return ESPRESSO_BASE_PRICE;
    }

}