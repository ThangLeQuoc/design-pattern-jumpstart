package com.thanglequoc.decorator.starbuzz;

public class Mocha extends CondimentDecorator {
    
    private static double SMALL_MOCHA_PRICE = 0.4;
    private static double MEDIUM_MOCHA_PRICE = 0.5;
    private static double LARGE_MOCHA_PRICE = 0.6;
    
    /**
     * This concrete decorator condiment hold a reference to a beverage object it decorate
     * */
    private Beverage beverage;
    
    public Mocha(Beverage beverage){
	this.beverage = beverage;
	autoAdaptCondimentSize(beverage);
    }
    
    @Override
    public String getDescription() {	
	return beverage.getDescription() + ", mocha";
    }
    
    @Override
    public double cost() {
	if(isSmallSize()){
	    return beverage.cost() + SMALL_MOCHA_PRICE;
	} else if(isMediumSize()){
	    return beverage.cost() + MEDIUM_MOCHA_PRICE;
	} else {
	    return beverage.cost() + LARGE_MOCHA_PRICE;
	}
    }
}
