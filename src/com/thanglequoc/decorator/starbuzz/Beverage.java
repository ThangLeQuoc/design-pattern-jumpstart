package com.thanglequoc.decorator.starbuzz;

public abstract class Beverage {
	private String description = "Unknown Beverage";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
