package com.thanglequoc.strategypattern;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
	System.out.println("Quack quack !");
    }

}
