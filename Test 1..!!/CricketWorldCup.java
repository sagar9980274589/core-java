class CricketWorldCup{
	
	static void registerTeam(String teamName,String captainName,int ranking, boolean isHost,int squadSize){
		
		if(teamName==null){
			System.out.println("invalid team name..");
			return;
			
		}
		if(captainName==null){
			System.out.println("invalid captain name..");
			return;
		}
		if(ranking<0){
			System.out.println("invalid ranking..");
			return;
		}
		if(squadSize<=0){
			System.out.println("invalid squad size..");
			
		}
		System.out.println("all data is valid and saved ...");
		System.out.println("teamName :"+teamName);
		System.out.println("captainName :"+captainName);
		System.out.println("ranking :"+ranking);
		if(isHost){
			System.out.println("he is an host");
		}
		else{
			System.out.println("he is not an host");
		}
		System.out.println("squad size :"+squadSize);
	}
	
	static void saveMatch(int matchId,String team1,String team2,String venue,String city,String date,String time,int overs,boolean isDayNight,String umpire1,String umpire2){
		if(matchId<=0){
			System.out.println("invalid match id..");
			return;
			
		}
		if(team1==null){
			System.out.println("invalid team1 name..");
			return;
			
		}
		if(team2==null){
			System.out.println("invalid team2 name..");
			return;
			
		}
		if(venue==null){
			System.out.println("invalid venue name..");
			return;
			
		}
		if(city==null){
			System.out.println("invalid city name..");
			return;
			
		}
		if(date==null){
			System.out.println("invalid date..");
			return;
			
		}
		if(time==null){
			System.out.println("invalid time..");
			return;
			
		}
		if(overs<=0){
			System.out.println("invalid overs..");
			return;
			
		}
		if(umpire1==null){
			System.out.println("invalid umpire1 name..");
			return;
			
		}
		if(umpire2==null){
			System.out.println("invalid umpire2 name..");
			return;
			
		}
		System.out.println("all data is valid and saved ...");
		System.out.println("matchId :"+matchId);
		System.out.println("team1 :"+team1);
		System.out.println("team2 :"+team2);
		System.out.println("venue :"+venue);
		System.out.println("city :"+city);
		System.out.println("date :"+date);
		System.out.println("time :"+time);
		System.out.println("overs :"+overs);
		if(isDayNight){
			System.out.println("It is an Day Night Match");
		}
		else{
			System.out.println("It is not an Day Night Match");
		}
		System.out.println("umpire1 :"+umpire1);
		System.out.println("umpire2 :"+umpire2);
	}
	
	static void savePlayer(String playerName,String teamName,int jerseyNumber,String role,boolean isCaptain,boolean isViceCaptain,int matchesPlayed,int runsScored,int wicketsTaken,double battingAverage,double bowlingEconomy){
		if(playerName==null){
			System.out.println("invalid player name..");
			return;
			
		}
		if(teamName==null){
			System.out.println("invalid team name..");
			return;
			
		}
		if(jerseyNumber<0){
			System.out.println("invalid jerseyNumber ..");
			return;
			
		}
		if(role==null){
			System.out.println("invalid role..");
			return;
			
		}
		if(matchesPlayed<0){
						System.out.println("invalid matches..");
			return;
		}
		if(runsScored<0){
						System.out.println("invalid runs scored..");
			return;
		}
		if(wicketsTaken<0){
						System.out.println("invalid wickets Taken..");
			return;
		}
				if(battingAverage<0){
						System.out.println("invalid battingAverage..");
			return;
		}
						if(bowlingEconomy<0){
						System.out.println("invalid bowlingEconomy..");
			return;
		}
		System.out.println("all data is valid and saved ...");
		System.out.println("playerName :"+playerName);
		System.out.println("role :"+role);
		System.out.println("team name :"+teamName);
		System.out.println("jerseyNumber :"+jerseyNumber);
		System.out.println("matchesPlayed :"+matchesPlayed);
		System.out.println("runsScored :"+runsScored);
		System.out.println("wicketsTaken :"+wicketsTaken);
		System.out.println("battingAverage :"+battingAverage);
		System.out.println("bowlingEconomy :"+bowlingEconomy);
		if(isCaptain){
			System.out.println("he is an captain !!");
		}
		else if(isViceCaptain){
			System.out.println("he is an vice captain !!");
		}
		else{
			System.out.println("he is neighter captain nor vice captain !!");
		}
		
		
	}
	static double calculateRunRate(int totalRuns,int oversFaced,int wicketsLost){
		if(totalRuns<0){
			System.out.println("invalid Runs..");
			return -1;
		}
		if(oversFaced<=0){
			System.out.println("invalid overs..");
			return -1;
		}
		if(wicketsLost<0){
			System.out.println("invalid wickets..");
			return -1;
		}
	  System.out.println("all data is valid and Calculating Run Rate!! ...");
	  return totalRuns/oversFaced;
		
	}
	static void checkQualification(int points,double netRunRate,int matchesLeft){
		if(points<0){
			System.out.println("invalid points..");
			return ;
		}
		if(netRunRate<0){
			System.out.println("invalid run rate..");
			return ;
		}
		if(matchesLeft<0){
			System.out.println("invalid matches..");
			return ;
		}
		System.out.println("all data is valid and saved ...");
		System.out.println("points :"+points);
		System.out.println("runRate :"+netRunRate);
		System.out.println("matchesLeft :"+matchesLeft);
		
	}
	static void manOfTheMatch(String playerName,int runs,int wickets){
		if(playerName==null){
			System.out.println("invalid player name..");
			return ;
		}
		if(runs<0){
			System.out.println("invalid runs..");
			return ;
		}
		if(wickets<0){
			System.out.println("invalid wickets..");
			return ;
		}
		System.out.println("all data is valid and saved ...");
		System.out.println("playerName :"+playerName);
		System.out.println("runs :"+runs);
		System.out.println("wickets :"+wickets);
		
	}
	
}