package com.thanglequoc.strategypattern;

public class DuckCallDevice implements QuackBehavior {
    
    @Override
    public void quack() {
	System.out.println("Simulate quacking....");
    }
    
}
