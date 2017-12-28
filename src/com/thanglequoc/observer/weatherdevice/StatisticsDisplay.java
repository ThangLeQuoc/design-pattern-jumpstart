package com.thanglequoc.observer.weatherdevice;

public class StatisticsDisplay implements Observer, DisplayElement {

    @Override
    public void update(float temp, float humidity, float pressure) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void display() {
	System.out.println("Statistics Display");
	
    }

}
