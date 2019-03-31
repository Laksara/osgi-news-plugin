package breakingnewsalert;

public class HumidityWarning implements BreakingNewsWeather{
	int id;
	
	public HumidityWarning(int id) {
		this.id = id;
	}
	

	@Override
	public String issueWarning(String city,String date) {
		String start = "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!";
		String message = "Expect heavy rain in " + city + " on " + date;
		String end = "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!";
		String display = start + "\n" + message.toUpperCase() + "\n" + end;
		
		return display;		
	}
}
