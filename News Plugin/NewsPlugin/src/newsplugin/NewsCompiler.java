//class to compile news using attributes and produce news string object
package newsplugin;

public class NewsCompiler{
	
	private int id;
	private String source;
	private String headline;
	private int wordCount;
	private String text;
	private String date;
	
	public NewsCompiler(int id) {
		this.id = id;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date){
		this.date = date;
	}
	
	public String getSource() {
		return source;
	}
	
	public void setSource(String source) {
		this.source = source;
	}
	
	public String getHeadline() {
		return headline;
	}
	
	public void setHeadline(String headline) {
		this.headline = headline.toUpperCase();
	}
	
	public int getWordCount() {
		this.setWordCount();
		return wordCount;
	}
	
	public void setWordCount() {
		if(text == null)
			this.wordCount = 0;
		else {
			wordCount = text.length() - text.replace(" ","").length() + 1;
		}
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	@Override
	public String toString() {
		String start = "****************************************************************************************";
		String head = getHeadline();
		String source = "by " + getSource();
		String date = "updated on " + getDate();
		String count = "Word Count : " + getWordCount();
		String data = getText();
		String end =  "*****************************************************************************************";
		
		return (start + " \n" + head + " \n" + source  + " \n" 
					+ date + " \n"  + count + " \n" + data + " \n" + end);
	}


}
