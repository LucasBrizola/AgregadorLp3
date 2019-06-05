package com.fundatec.lp3.agregador.domain;


public class Data {
	private float temperature;
	private String wind_direction;
	private String wind_velocity;
	private int humidity;
	private String condition;
	private int pressure;
	private String icon;
	private float sensation;
	private String date;

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public String getWind_direction() {
		return wind_direction;
	}

	public void setWind_direction(String wind_direction) {
		this.wind_direction = wind_direction;
	}

	public String getWind_velocity() {
		return wind_velocity;
	}

	public void setWind_velocity(String wind_velocity) {
		this.wind_velocity = wind_velocity;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public int getPressure() {
		return pressure;
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public float getSensation() {
		return sensation;
	}

	public void setSensation(float sensation) {
		this.sensation = sensation;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
