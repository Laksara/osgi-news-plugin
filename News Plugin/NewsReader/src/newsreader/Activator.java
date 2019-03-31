package newsreader;

import newsplugin.NewsDB;
import newsplugin.NewsInterface;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class Activator implements BundleActivator {

	ServiceReference serviceReference;
	
	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Opening News Reader");
		serviceReference = context.getServiceReference(NewsInterface.class.getName());
		NewsInterface newsinterface  = (NewsInterface) context.getService(serviceReference);
		NewsDB.newsFeed.clear();
		newsinterface.publishNews();
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Closing News Reader");
		NewsDB.newsFeed.clear();
		context.ungetService(serviceReference);
	}

}
