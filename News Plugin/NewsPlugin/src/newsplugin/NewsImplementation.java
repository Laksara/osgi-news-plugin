//implement news interface and display news
package newsplugin;

public class NewsImplementation implements NewsInterface{
	
	@Override
	public void publishNews() {
		NewsDB newsdb = new NewsDB();
		newsdb.setNewsArticle();
		
		for(NewsCompiler article : NewsDB.newsFeed) {
			System.out.println(article.toString());
		}
		
	}

	@Override
	public String searchNews(String keyword) {
		for(NewsCompiler article : NewsDB.newsFeed) {
			if(article.getHeadline().contains(keyword.toUpperCase())) {
				return article.toString();
			}
		}
		return "Article not found";
	}
}
