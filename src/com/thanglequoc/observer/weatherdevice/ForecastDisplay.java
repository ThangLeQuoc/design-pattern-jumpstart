package com.thanglequoc.observer.weatherdevice;

public class ForecastDisplay implements Observer, DisplayElement {

    @Override
    public void display() {
	System.out.println("Forecast Display");
	
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
	// TODO Auto-generated method stub
	
    }

}
