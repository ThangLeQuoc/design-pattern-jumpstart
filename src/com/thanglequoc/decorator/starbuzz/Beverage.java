package com.thanglequoc.decorator.starbuzz;

public abstract class Beverage {
	
    	private BeverageSize size;
    	
    	private String description = "Unknown Beverage";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
	
	public void setSize(BeverageSize size){
	    this.size = size;
	}
	
	public BeverageSize getSize(){
	    return size;
	}
	
	public boolean isSmallSize(){
	    return size.equals(BeverageSize.SMALL);
	}
	
	public boolean isMediumSize(){
	    return size.equals(BeverageSize.MEDIUM);
	}
	
	public boolean isLargeSize(){
	    return size.equals(BeverageSize.LARGE);
	}
}
