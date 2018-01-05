package com.thanglequoc.decorator.starbuzz;

public class HouseBlend extends Beverage {
    
    @Override
    public String getDescription() {
        return "House Blend Coffee";
    }
    
    private static double HOUSE_BLEND_BASE_PRICE = 1.60;
    @Override
    public double cost() {
	return HOUSE_BLEND_BASE_PRICE;
    }
}
