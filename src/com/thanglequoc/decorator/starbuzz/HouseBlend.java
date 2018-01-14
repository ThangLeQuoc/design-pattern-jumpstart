package com.thanglequoc.decorator.starbuzz;

public class HouseBlend extends Beverage {
    
    private static double SMALL_HOUSEBLEND_PRICE = 1.99;
    private static double MEDIUM_HOUSEBLEND_PRICE = 2.5;
    private static double LARGE_HOUSEBLEND_PRICE = 3;
    
    public HouseBlend(BeverageSize size) {
	this.setSize(size);
    }
    
    @Override
    public String getDescription() {
        return "House Blend Coffee";
    }
    
    private static double HOUSE_BLEND_BASE_PRICE = 1.60;
    
    @Override
    public double cost() {
	if(isSmallSize()){
	    return SMALL_HOUSEBLEND_PRICE;
	}
	else if(isMediumSize()){
	    return MEDIUM_HOUSEBLEND_PRICE;
	} else {
	    return LARGE_HOUSEBLEND_PRICE;
	}
    }
}
