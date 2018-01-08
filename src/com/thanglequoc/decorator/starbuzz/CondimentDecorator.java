package com.thanglequoc.decorator.starbuzz;

public abstract class CondimentDecorator extends Beverage {
    protected void autoAdaptCondimentSize(Beverage beverage){
	setSize(beverage.getSize());
    }
}
