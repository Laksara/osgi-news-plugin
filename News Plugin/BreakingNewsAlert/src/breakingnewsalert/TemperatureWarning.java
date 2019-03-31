package breakingnewsalert;

public class TemperatureWarning implements BreakingNewsWeather{
	int id;
	
	public TemperatureWarning(int id) {
		this.id = id;
	}
	

	@Override
	public String issueWarning(String city,String date) {
		String start = "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!";
		String message = "Expect hot weather in " + city + " on " + date;
		String end = "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!";
		String display = start + "\n" + message.toUpperCase() + "\n" + end;
		
		return display;		
	}
}
