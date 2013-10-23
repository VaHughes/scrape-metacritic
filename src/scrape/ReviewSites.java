package scrape;

public class ReviewSites {
	
	String[] gameList = {"Giant Bomb","Eurogamer", "GameSpot",
			"Game Trailers", "DarkZero", "NZGamer", "Destructoid",
			"Console Monster", "Game Revolution", "Thunderbolt"};
	
	public ReviewSites() {
		System.out.printf("%-29s %-10s\n", "Site Name", "Score");
		System.out.println("------------------------------------");
	}
	
	public void ReviewNames(String name, String score) {
		
		for (int i = 0; i < gameList.length; i++) {
			if (gameList[i].equals(name)) {
				System.out.printf("%-30s %-10s\n", name, score);
			}
		}
	}
}
