package weatherapp;

import java.util.ArrayList;
import java.util.List;

public class WeatherDB {
	public static List<Weather> weatherlog = new ArrayList<>();
	
	public void setWeather() {
		//weather 1
		Weather data1 = new Weather(1);
		data1.setCity("Kandy");
		data1.setDate("12/04/2019");
		data1.setTemperature();
		data1.setWindSpeed();
		data1.setHumidity();
		weatherlog.add(data1);
		
		//weather 2
		Weather data2 = new Weather(2);
		data2.setCity("Malabe");
		data2.setDate("12/04/2019");
		data2.setTemperature();
		data2.setWindSpeed();
		data2.setHumidity();
		weatherlog.add(data2);
		
		//weather 3
		Weather data3 = new Weather(3);
		data3.setCity("Colombo");
		data3.setDate("13/05/2019");
		data3.setTemperature();
		data3.setWindSpeed();
		data3.setHumidity();
		weatherlog.add(data3);
		
	}
}
