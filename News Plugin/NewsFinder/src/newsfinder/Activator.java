package newsfinder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import newsplugin.NewsDB;
import newsplugin.NewsInterface;

public class Activator implements BundleActivator {
	
	ServiceReference serviceReference;
	String foundArticle;
	String keyword = "";
	BufferedReader in;
	
	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Opening News Finder");
		System.out.println("Enter blank space to exit");
		serviceReference = context.getServiceReference(NewsInterface.class.getName());
		NewsInterface newsinterface  = (NewsInterface) context.getService(serviceReference);
		NewsDB newsdb =  new NewsDB();
		newsdb.setNewsArticle();
		searchActivation(newsinterface);

	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Closing News Finder");
		NewsDB.newsFeed.clear();
		foundArticle = "";
		keyword = "";
		context.ungetService(serviceReference);
	}
	
	public void searchActivation(NewsInterface newsinterface) throws IOException {
			
		System.out.print("Enter keyword to find article: ");
		in = new BufferedReader(new InputStreamReader(System.in));
		keyword = in.readLine();
		foundArticle = newsinterface.searchNews(keyword);
		
		if(keyword == " ") {
			System.out.println("Exiting NewsFinder");
			return;
		}
		else if(foundArticle != null) {
			System.out.println(foundArticle);
			return;
		}
		else if(foundArticle == null){
			System.out.println("Article not found");
			return;
		}
	}

}
