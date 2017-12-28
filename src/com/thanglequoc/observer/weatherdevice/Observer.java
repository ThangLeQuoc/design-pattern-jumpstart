package com.thanglequoc.observer.weatherdevice;

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
