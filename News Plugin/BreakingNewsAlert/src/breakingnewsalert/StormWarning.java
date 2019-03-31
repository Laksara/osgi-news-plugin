package breakingnewsalert;

public class StormWarning implements BreakingNewsWeather{
	
	int id;
	
	public StormWarning(int id) {
		this.id = id;
	}
	

	@Override
	public String issueWarning(String city,String date) {
		String start = "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!";
		String message = "Possibility of major storm in " + city + " on " + date;
		String end = "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!";
		String display = start + "\n" + message.toUpperCase() + "\n" + end;
		
		return display;		
	}

}
