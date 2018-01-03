package com.thanglequoc.strategy.ducksimulator;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
	System.out.println("<no sound>");
    }
    
}
