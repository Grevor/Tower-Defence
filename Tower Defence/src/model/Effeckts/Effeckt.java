package model.Effeckts;

import model.types.DamageType;
import model.types.EffecktType;

public class Effeckt {

	EffecktType type;
	double radius;
	DamageType damageType;
	double duration;
	double value;
	
	/**
	 * @param type
	 * @param radius
	 * @param damageType
	 * @param value
	 */
	public Effeckt(EffecktType type,double radius,DamageType damageType, double value) {
		this.type = type;
		this.radius = radius;
		this.damageType = damageType;
		this.value = value;
	}
	
	public double getValue(){
		return value;
	}
	
	boolean uppdate(long time){
		duration =- time;
		return 0 < duration; 
	}

	public EffecktType getType() {
		return type;
	}
}			
