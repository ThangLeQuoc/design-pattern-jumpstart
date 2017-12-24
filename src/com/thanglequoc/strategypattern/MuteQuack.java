package com.thanglequoc.strategypattern;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
	System.out.println("<no sound>");
    }
    
}
