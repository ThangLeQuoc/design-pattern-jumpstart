package com.thanglequoc.strategypattern;

public class MallardDuck extends Duck {
    
    public MallardDuck() {
	flyBehavior = new FlyWithWingsBehavior();
	quackBehavior = new Quack();
    }
    
    @Override
    public void fly() {
	flyBehavior.fly();
    }

    @Override
    public void quack() {
	quackBehavior.quack();
    }

}
