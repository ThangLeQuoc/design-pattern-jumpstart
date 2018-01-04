package com.thanglequoc.observer.weatherdevice;

import com.thanglequoc.observer.java.weatherdevice.DisplayElement;

public class ForecastDisplay implements Observer, DisplayElement {
	
	private Observable observableSource;
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	
    @Override
    public void display() {
    	System.out.println("Forecast Display");
    	predictWeather(temperature);
		
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
    	/** It's a bit dumb since our forecast display doesn't need any information about humidity and pressure
    	 * , but yet still consume it */
    	this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	
    }

	@Override
	public void registerWeatherDataSource(Observable weatherDataSource) {
		observableSource = weatherDataSource;
		observableSource.registerObserver(this);
	}
	
	private void predictWeather(float temperature) {
		if(temperatureIsBetween(0, 15)) {
			System.out.println("It is cold, seriously");
		} else if (temperatureIsBetween(16, 30)) {
			System.out.println("It's cool today");
		} else if(temperatureIsBetween(31, 42)) {
			System.out.println("Well, it's just a bit hot..");
		} else {
			System.out.println("You can not survive in this environment");
		}
	}
	
	private boolean temperatureIsBetween(float lowerBound, float upperBound) {
		return (temperature >= lowerBound && temperature <= upperBound);
	}

}
