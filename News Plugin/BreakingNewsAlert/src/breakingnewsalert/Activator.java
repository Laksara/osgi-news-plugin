package breakingnewsalert;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import weatherapp.Weather;
import weatherapp.WeatherDB;
import weatherapp.WeatherStation;

public class Activator implements BundleActivator {
	
	ServiceReference serviceReference;

	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Breaking News Alerts");
		serviceReference = context.getServiceReference(WeatherStation.class.getName());
		WeatherStation weatherinterface  = (WeatherStation) context.getService(serviceReference);
		WeatherDB.weatherlog.clear();
		
		WeatherDB weatherdb = new WeatherDB();
		weatherdb.setWeather();
		
		displaywarning(weatherdb);
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Closing News Alerts");
		WeatherDB.weatherlog.clear();
		context.ungetService(serviceReference);
		
	}
	
	public void displaywarning(WeatherDB weatherdb) {
		int i = 0;
		for(Weather weather : WeatherDB.weatherlog){
			if(weather.getWindSpeed() > 50) {
				BreakingNewsWeather warning = new StormWarning(i);
				String displayMessage = warning.issueWarning(weather.getCity(), weather.getDate());
				i++;
				System.out.println(displayMessage);
			}
			
			if(weather.getTemperature() > 35 && weather.getHumidity() < 20 && weather.getTemperature() < 25) {
				BreakingNewsWeather warning = new TemperatureWarning(i);
				String displayMessage = warning.issueWarning(weather.getCity(), weather.getDate());
				i++;
				System.out.println(displayMessage);
			}
			
			if(weather.getHumidity() > 70) {
				BreakingNewsWeather warning = new HumidityWarning(i);
				String displayMessage = warning.issueWarning(weather.getCity(), weather.getDate());
				i++;
				System.out.println(displayMessage);
			}
			
				
		}
		
	}


}
