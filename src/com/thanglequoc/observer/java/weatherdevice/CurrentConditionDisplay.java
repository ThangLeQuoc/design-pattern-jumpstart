package com.thanglequoc.observer.java.weatherdevice;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {
	
	private Observable weatherData;
	private float temperature;
	private float humidity;
	private float pressure;
	
	
	/**
	 * Passing and hold reference to observable object allow object to unsubscribe itself
	 * */
	public CurrentConditionDisplay(Observable weatherData) {
		this.weatherData = weatherData;
		weatherData.addObserver(this);
	}
	

	@Override
	public void display() {
		System.out.println("--- Current Condition --- ");
		System.out.println("Temperature: "+temperature+" C");
		System.out.println("Humidity: "+humidity +" %");
		System.out.println("Pressure: "+pressure);
	}



	@Override
	public void update(Observable obs, Object arg1) {
		if(obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			this.pressure = weatherData.getPressure();
			display();
		}
	}
}
