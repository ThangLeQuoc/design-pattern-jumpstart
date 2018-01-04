package com.thanglequoc.observer.java.weatherdevice;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;

public class WeatherData extends Observable {
	
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
		fetchNewDataFromServer();
	}
	
	public void measurementChanged() {
		setChanged();
		notifyObservers();
	}
	
	public void fetchNewDataFromServer() {
		this.temperature = generateRandomValueWithinRange(MINIMUM_TEMP, MAXIMUM_TEMP);
		this.humidity = generateRandomValueWithinRange(MINIMUM_HUM, MAXIMUM_HUM);
		this.pressure = generateRandomValueWithinRange(MINIMUM_PRESSURE, MAXIMUM_PRESSURE);
		measurementChanged();
	}
	
	
	private float generateRandomValueWithinRange(float lower, float upper) {
		Random r = new Random();
		return lower + r.nextFloat()*(upper-lower);
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
	
	

}
