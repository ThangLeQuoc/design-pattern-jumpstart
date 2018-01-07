package com.thanglequoc.decorator.starbuzz;

public class Espresso extends Beverage {
    
    private static double SMALL_ESPRESSO_PRICE = 1.99;
    private static double MEDIUM_ESPRESSO_PRICE = 2.5;
    private static double LARGE_ESPRESSO_PRICE = 3;
    
    public Espresso(BeverageSize size){
	super.setSize(size);
    }
    
    @Override
    public String getDescription() {
	return getSize() + " Espresso";
    }
    @Override
    public double cost() {
	if(isSmallSize()){
	    return SMALL_ESPRESSO_PRICE;
	} else if(isMediumSize()){
	    return MEDIUM_ESPRESSO_PRICE;
	} else {
	    return LARGE_ESPRESSO_PRICE;
	}
    }
}
