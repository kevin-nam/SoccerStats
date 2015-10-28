package Model;

import java.util.List;

public class Manager {
	List<Match> leagueMatches;
	List<Team> leagueTeams;
	
	public Manager(List<Match> leagueMatches, List<Team> leagueTeams){
		this.leagueMatches = leagueMatches;
		this.leagueTeams = leagueTeams;
	}
	
	public void DisplayTopScoringMatches(){
		//Keep track of team with highest goals
		int highestGoals = 0;
		Match topScoringMatch = null;
		
		//Loop for each match
		for(Match m : leagueMatches){
			int totalGoals = m.awayGoals + m.homeGoals;
			if(totalGoals > highestGoals){
				highestGoals = totalGoals;
				topScoringMatch = m;
			}
		}
		
		//Display
		System.out.println("TOP SCORING MATCH:");
		System.out.println("ID: " + topScoringMatch.id);
		System.out.println("Team " + topScoringMatch.home.name + " vs. " + "Team " + topScoringMatch.away.name);
		System.out.println("Total goals: " + highestGoals);
		
	}
	public void DisplayTop5Players(){
		//TODO: IMPLEMENT THIS
	}
	public void DisplayTopGoalie(){
		//TODO: IMPLEMENT THIS
	}
	
	public static void main(String args[]){
		Team team1 = new Team("Team Cozy");
		Team team2 = new Team("Team High");
		Team team3 = new Team("Team Low");
		Team team4 = new Team("Team SKT");
		
		Player player1 = new Player(1,1);
		Player player2 = new Player(2,2);
		Player player3 = new Player(3,3);
		Player player4 = new Player(4,1);
		Player player5 = new Player(5,2);
		Player player6 = new Player(6,1);
		Player player7 = new Player(7,3);
		Player player8 = new Player(8,2);
		
		team1.addPlayer(player1);
		team2.addPlayer(player2);
		team3.addPlayer(player3);
		team4.addPlayer(player4);
		
		Match match1 = new Match(team1, team2, 1);
		
		leagueTeams.put(team1);
		
		
		Manager m = new Manager();
		m.DisplayTop5Players();
		m.DisplayTopScoringMatches();
		m.DisplayTopGoalie();
	}
}
