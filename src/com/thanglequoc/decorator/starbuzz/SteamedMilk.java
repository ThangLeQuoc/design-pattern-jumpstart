package com.thanglequoc.decorator.starbuzz;

public class SteamedMilk extends CondimentDecorator {
    
    private Beverage beverage;
    
    private static double STEAMED_MILK_PRICE = 0.1;
    
    public SteamedMilk(Beverage beverage){
	this.beverage = beverage;
    }
    
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", steamed milk";
    }
    @Override
    public double cost() {
	return beverage.cost() + STEAMED_MILK_PRICE;
    }
    
}
