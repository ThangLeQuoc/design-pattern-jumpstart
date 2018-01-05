package com.thanglequoc.decorator.starbuzz;

public class Mocha extends CondimentDecorator {
    
    private static double MOCHA_COST = 0.5;
    
    /**
     * This concrete decorator condiment hold a reference to a beverage object it decorate
     * */
    private Beverage beverage;
    
    public Mocha(Beverage beverage){
	this.beverage = beverage;
    }
    
    @Override
    public String getDescription() {
        return "Mocha";
    }
    
    @Override
    public double cost() {
	return beverage.cost()+MOCHA_COST;
    }

}
