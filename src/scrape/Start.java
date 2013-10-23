package scrape;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


public class Start {

	public static void main(String[] args) {
		try {
			Document doc;
			doc = Jsoup.connect("http://www.metacritic.com/game/xbox-360/splosion-man/critic-reviews").get();
			
			String zzz = "div.review_critic";
			String yyy = "div.review_grade";
			ReviewSites rs = new ReviewSites();
			
			for(int i = 1; i < 100; i++) {
				try {
					Element b = doc.select(zzz).get(i);
					Element c = doc.select(yyy).get(i);
					String g = b.text();
					String gg = c.text();
					
					rs.ReviewNames(g, gg);
					
				} catch (Exception e) {
					return;
				}
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
