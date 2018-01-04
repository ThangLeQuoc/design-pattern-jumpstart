package com.thanglequoc.observer.weatherdevice;

import com.thanglequoc.observer.java.weatherdevice.DisplayElement;

public class CurrentConditionDisplay implements Observer, DisplayElement {
	
	private Observable observableSource;
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	
	
	public CurrentConditionDisplay() {
	}

	@Override
	public void display() {
		System.out.println("Current Condition Screen");
		System.out.println("Temperature: "+temperature);
		System.out.println("Humidity: "+humidity);
		System.out.println("Pressure: "+pressure);		
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
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

}
