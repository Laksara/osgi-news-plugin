//this class will be replaced by a news aggregation database

package newsplugin;


import java.util.ArrayList;
import java.util.List;

public class NewsDB {
	//add news article to arraylist
	public static List<NewsCompiler> newsFeed = new ArrayList<>();

	public void setNewsArticle() {
		
		//article 1
		NewsCompiler newsArticle1 = new NewsCompiler(1);
		newsArticle1.setSource("CNN");
		newsArticle1.setHeadline("Trump and Democrats can't move on from \'collusion delusion\'");
		newsArticle1.setDate("29-March-2019");
		newsArticle1.setText("The 2020 presidential campaign is more likely to turn on rising health care costs,"
				+ "\nthe dysfunction in the immigration system and the state of the economy than the poisoned legacy"
				+ "\nof the 2016 election."
				+ "\rBut the triumphalism of President Donald Trump and the building power struggle in Washington"
				+ "\nafter Robert Mueller's investigation show that while both parties are positioning for the next"
				+ "\nWhite House race, the bitter recriminations over Russian election meddling are likely to reverberate"
				+ "\nfor months.");
		newsFeed.add(newsArticle1);
		
		//article 2
		NewsCompiler newsArticle2 = new NewsCompiler(2);
		newsArticle2.setSource("CNN");
		newsArticle2.setHeadline("Russia confirms its military personnel are in Venezuela");
		newsArticle2.setDate("29-March-2019");
		newsArticle2.setText("In a briefing Thursday in Moscow, Foreign Ministry spokeswoman Maria Zakharova "
				+ "\nsaid \"Russian specialists\" were on Venezuelan soil but declared their deployment to be"
				+ "\n\"in accordance with the provisions of the bilateral intergovernmental agreement on "
				+ "\nmilitary-technical cooperation\" between Moscow and Caracas.");
		newsFeed.add(newsArticle2);
		
		//article 3
		NewsCompiler newsArticle3 = new NewsCompiler(3);
		newsArticle3.setSource("Al Jazeera");
		newsArticle3.setHeadline("Hosni Mubarak resigns as president");
		newsArticle3.setDate("11-February-2011");
		newsArticle3.setText("Hosni Mubarak, the Egyptian president, has resigned from his post,handing over power "
							+ "\nto the armed forces."
							+ "\r\nOmar Suleiman, the vice-president, announced in a televised address that the "
							+ "\npresident was \"waiving\" his office, and had handed over authority to the Supreme"
							+ "\nCouncil of the armed forces.");
		newsFeed.add(newsArticle3);
		
	}

}
