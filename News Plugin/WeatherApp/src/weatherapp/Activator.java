package weatherapp;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {
	
	ServiceRegistration publishServiceRegistration;

	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Weather App Start");
		//register weather
		WeatherStation weatherpublisher =  new WeatherImplementation();
		publishServiceRegistration = context.registerService(WeatherStation.class.getName(), weatherpublisher, null);
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Weather App close");
		publishServiceRegistration.unregister();
	}

}
