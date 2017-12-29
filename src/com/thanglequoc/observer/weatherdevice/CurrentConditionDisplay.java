package com.thanglequoc.observer.weatherdevice;

public class CurrentConditionDisplay implements Observer, DisplayElement {
	
	private Observable weatherData;
	private float temperature;
	private float humidity;
	private float pressure;
	
	
	
	public CurrentConditionDisplay(Observable weatherData) {
		this.weatherData = weatherData;
		weatherData.register(this);
	}
	

	@Override
	public void display() {
		System.out.println("--- Current Condition --- ");
		System.out.println("Temperature: "+temperature+" C");
		System.out.println("Humidity: "+humidity +" %");
		System.out.println("Pressure: "+pressure);
		
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}
}
