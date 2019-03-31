package weatherapp;

import java.util.Random;

public class Weather {
	private int id;
	private String city;
	private String date;
	private double temperature;
	private double windspeed;
	private double humidity;
	Random random = new Random();
	
	public Weather(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature() {
		this.temperature = Math.round(random.nextDouble() * 100);
	}
	public double getWindSpeed() {
		return windspeed;
	}
	public void setWindSpeed() {
		this.windspeed = Math.round(random.nextDouble() * 100);
	}
	public double getHumidity() {
		return humidity;
	}
	public void setHumidity() {
		this.humidity = Math.round(random.nextDouble() * 100);
	}
	
	@Override
	public String toString() {
		String start = "*************************************************************";
		String city = getCity();
		String date = getDate();
		String temperature = "Temperature " + getTemperature() + " C";
		String humidity = "Humidity " + getHumidity() + "%";
		String windspeed = "Wind Speed " + getWindSpeed() + "Kmph";
		String end =  "***************************************************************";
		
		return (start + " \n" + city + "\t" + date  + "\n" 
					+ temperature + " \n" + humidity + " \n" + windspeed + "\n" + end);
	}
}
