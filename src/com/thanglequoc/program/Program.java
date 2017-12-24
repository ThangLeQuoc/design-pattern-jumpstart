package com.thanglequoc.program;

import com.thanglequoc.strategypattern.DuckCallDevice;
import com.thanglequoc.strategypattern.MallardDuck;

/**
 * @author ThangLeQuoc
 * */
public class Program {
    public static void main(String[] args) {
	
	/**
	 * === STRATEGY PATTERN SHOWCASES ===
	 * */
	MallardDuck myMallard = new MallardDuck();
	myMallard.quack();
	myMallard.fly();
	
	DuckCallDevice duckCall = new DuckCallDevice();
	duckCall.quack();
	
	
	
	
    }
}
