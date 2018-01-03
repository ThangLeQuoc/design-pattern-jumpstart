package com.thanglequoc.observer.java.weatherdevice;

import org.junit.Before;
import org.junit.Test;

import com.thanglequoc.observer.java.weatherdevice.CurrentConditionDisplay;
import com.thanglequoc.observer.java.weatherdevice.WeatherData;

public class CurrentConditionDisplayTest {

	private WeatherData weatherData;
	private CurrentConditionDisplay currentConditionDisplay;
	
	@Before
	public void setUp() {
		weatherData = new WeatherData();
		
		/**
		 * Create current condition display, it also register to Observable class
		 * */
		currentConditionDisplay = new CurrentConditionDisplay(weatherData);
		
	}
	
	
	@Test
	public void should_RunDisplay_When_NewDataAvailableInWeatherData() {
		weatherData.fetchNewDataFromServer();
	}
	
	
}
