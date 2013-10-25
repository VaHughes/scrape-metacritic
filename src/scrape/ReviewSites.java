package scrape;

public class ReviewSites {
	
	//List of the game critics you want to return. add or delete them from here
	String[] gameList = {"Giant Bomb","Eurogamer", "GameSpot",
			"Game Trailers", "DarkZero", "NZGamer", "Destructoid",
			"Console Monster", "Game Revolution", "Thunderbolt", "IGN"};
	
	public ReviewSites(String gameName) {
		
		//outputs the header
		System.out.println(gameName + " Reviews" );
		System.out.println();
		System.out.printf("%-29s %-10s\n", "Site Name", "Score");
		System.out.println("------------------------------------");
	}
	
	//outputs the critics review score
	public void ReviewNames(String name, String score) {
		
		for (int i = 0; i < gameList.length; i++) {
			if (gameList[i].equals(name)) {
				System.out.printf("%-30s %-10s\n", name, score);
			}
		}
	}
}
