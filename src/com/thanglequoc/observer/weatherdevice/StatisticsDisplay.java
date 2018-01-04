package com.thanglequoc.observer.weatherdevice;

import com.thanglequoc.observer.java.weatherdevice.DisplayElement;

public class StatisticsDisplay implements Observer, DisplayElement {

    @Override
    public void update(float temp, float humidity, float pressure) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void display() {
	System.out.println("Statistics Display");
	
    }

	@Override
	public void registerWeatherDataSource(Observable weatherDataSource) {
		// TODO Auto-generated method stub
		
	}

}
