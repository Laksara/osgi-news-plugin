package weatherapp;


public class WeatherImplementation implements WeatherStation{
	
	@Override
	public void publishWeather() {
		WeatherDB data = new WeatherDB();
		data.setWeather();
		
		for(Weather weather : WeatherDB.weatherlog){
			System.out.println(weather.toString());
		}
	}
	
	@Override
	public String searchWeather(String keyword) {
		for(Weather weather : 	WeatherDB.weatherlog) {
			if((weather.getCity()).equalsIgnoreCase(keyword)) {
				return weather.toString();
			}
		}
		return "Weather details not found";
	}
	
	
	
}
