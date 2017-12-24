package com.thanglequoc.strategypattern;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    
    public abstract void fly();
    public abstract void quack();
    
}
