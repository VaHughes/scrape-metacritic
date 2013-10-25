package scrape;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


public class Start {
	
	//Change the url here for the chosen game on metacritic
	static String urlAddress = "http://www.metacritic.com/game/xbox-360/street-fighter-iv/critic-reviews";

	public static void main(String[] args) {
		
		try {
			Document doc;
			doc = Jsoup.connect(urlAddress).get();
			
			String critic = "div.review_critic";
			String reviewGrade = "div.review_grade";
			Element metalinks = doc.select("meta[name=og:title]").first();
			String gameTitle = metalinks.attr("content").toString();
			
			ReviewSites rs = new ReviewSites(gameTitle);
			
			for(int i = 1; i < 100; i++) {
				try {
					Element b = doc.select(critic).get(i);
					Element c = doc.select(reviewGrade).get(i);
					String criticText = b.text();
					String reviewGradeText = c.text();
					
					rs.ReviewNames(criticText, reviewGradeText);
					
				} catch (Exception e) {
					return;
				}
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
