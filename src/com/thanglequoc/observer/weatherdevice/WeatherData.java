package com.thanglequoc.observer.weatherdevice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherData implements Observable {
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	private List<Observer> observers;
	
	private static float MINIMUM_TEMP = 0;
	private static float MAXIMUM_TEMP = 100;
	
	private static float MINIMUM_HUM = 0;
	private static float MAXIMUM_HUM = 250;
	
	private static float MINIMUM_PRESSURE = 15;
	private static float MAXIMUM_PRESSURE = 150;
	
	
	public WeatherData() {
		observers = new ArrayList<>();
		fetchNewDataFromServer();
	}
	
	public void fetchNewDataFromServer() {
		this.temperature = generateRandomValueWithinRange(MINIMUM_TEMP, MAXIMUM_TEMP);
		this.humidity = generateRandomValueWithinRange(MINIMUM_HUM, MAXIMUM_HUM);
		this.pressure = generateRandomValueWithinRange(MINIMUM_PRESSURE, MAXIMUM_PRESSURE);
		notifyObservers();
	}
	
	
	
	@Override
	public void register(Observer o) {
		observers.add(o);
	}

	@Override
	public void remove(Observer o) {
		if(observers.contains(o)) {
			observers.remove(o);
		}
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}
	
	private float generateRandomValueWithinRange(float lower, float upper) {
		Random r = new Random();
		return lower + r.nextFloat()*(upper-lower);
	}

}
