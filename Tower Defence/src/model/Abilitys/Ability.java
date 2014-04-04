package model.Abilitys;

public class Ability {
	private double cd;
	private double maxCd;
	private double range;
	
	public boolean ready(){
		return cd < 0;
	}
	
	
	//returns the dmage of an attack, returns 0 if the attack isent ready 
	public boolean attack(){
		if (ready()){
			cd = maxCd;
			//TODO use ability
			return true;
		}
		return false;
	}
	
	
	//uppdate for etach frame
	public void uppdate(long time){
		if (cd > 0)
		cd -= time;
	}
	
	
	
}
