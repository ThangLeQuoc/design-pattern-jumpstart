package com.thanglequoc.observer.weatherdevice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherData implements Observable {
	
	List<Observer> obs;
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	
	private static float MINIMUM_TEMP = 0;
	private static float MAXIMUM_TEMP = 100;
	
	private static float MINIMUM_HUM = 0;
	private static float MAXIMUM_HUM = 250;
	
	private static float MINIMUM_PRESSURE = 15;
	private static float MAXIMUM_PRESSURE = 150;
	
	
	
	public WeatherData() {
		obs = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		if(!obs.contains(o)) {
			obs.add(o);
		} 
		
	}

	@Override
	public void removeObserver(Observer o) {
		if(obs.contains(o)) {
			obs.remove(o);
		}
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : obs) {
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void fetchNewDataFromServer() {
		this.temperature = generateRandomValueWithinRange(MINIMUM_TEMP, MAXIMUM_TEMP);
		this.humidity = generateRandomValueWithinRange(MINIMUM_HUM, MAXIMUM_HUM);
		this.pressure = generateRandomValueWithinRange(MINIMUM_PRESSURE, MAXIMUM_PRESSURE);
		notifyObservers();
	}
	
	
	private float generateRandomValueWithinRange(float lower, float upper) {
		Random r = new Random();
		return lower + r.nextFloat()*(upper-lower);
	}

}
