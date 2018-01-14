package com.thanglequoc.decorator.starbuzz;

public class SteamedMilk extends CondimentDecorator {
    
    private Beverage beverage;
    
    private static double SMALL_STEAMED_MILK_PRICE = 0.1;
    private static double MEDIUM_STEAMED_MILK_PRICE = 0.2;
    private static double LARGE_STEAMED_MILK_PRICE = 0.3;
    
    public SteamedMilk(Beverage beverage){
	this.beverage = beverage;
	autoAdaptCondimentSize(beverage);
    }
    
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", steamed milk";
    }
    @Override
    public double cost() {
	if(isSmallSize()){
	    return beverage.cost() + SMALL_STEAMED_MILK_PRICE;
	} else if(isMediumSize()){
	    return beverage.cost() + MEDIUM_STEAMED_MILK_PRICE;
	} else {
	    return beverage.cost() + LARGE_STEAMED_MILK_PRICE;
	}
    }
    
}
