package com.thanglequoc.observer.weatherdevice;

public class CurrentConditionDisplay implements Observer, DisplayElement {
	
	
	

	@Override
	public void display() {
		System.out.println("Current Condition Screen");
		
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		
		
	}

}
