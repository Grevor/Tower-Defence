package unit;

import java.awt.Color;

public class Team {

	Color teamcolor;
	int teamId;
	
	public Team(Color teamColor, int teamId){
		this.teamcolor = teamColor;
		this.teamId = teamId;
	}
	
	/**
	 * if the two teams are thesame
	 * team 0 is "no team"
	 * @param team
	 * @return
	 */
	public boolean sameTeam(Team team){
		if(0 != this.teamId && 0 != team.teamId)
		return this.teamId == team.teamId;
		
		return false;
	}
	
}
