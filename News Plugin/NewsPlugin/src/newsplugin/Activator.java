package newsplugin;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {
	
	ServiceRegistration publishServiceRegistration;

	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("News Publisher Start");
		//register newspublisher
		NewsInterface newspublisher =  new NewsImplementation();
		publishServiceRegistration = context.registerService(NewsInterface.class.getName(), newspublisher, null);
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("News Publisher Stop");
		publishServiceRegistration.unregister();
	}

}
