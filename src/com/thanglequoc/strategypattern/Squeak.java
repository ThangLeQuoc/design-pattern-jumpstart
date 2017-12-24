package com.thanglequoc.strategypattern;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
	System.out.println("Squeak squeak !");
    }

}
