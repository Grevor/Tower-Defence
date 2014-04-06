package model.abilities;

import java.util.LinkedList;

import model.Effeckts.Effeckt;



public abstract class Ability {
	
	protected double cd;
	protected double maxCd;
	protected double speed;
	private double range;
	LinkedList <Effeckt> effect;
	
	
	//public abstract Projectile newProjectile(FixedMatrix2_64F position, Entity target);
		
	

	public Ability(double cd,double range, LinkedList <Effeckt> effect,double speed) {
		cd = 0;
		this.maxCd = cd;
		this.speed = speed;
		this.range = range;
		this.effect = effect;
	}
	
	public boolean ready(){
		return cd <= 0;
	}
	
	
	
	/**
	 * @param position the curent posistion of the caster
	 * @param target may be null
	 * @return the new projectile
	 */
	/*public Projectile use(FixedMatrix2_64F position, Entity target){
		if (ready()){
			cd = maxCd;
			return newProjectile(position, target);
		}
		return null;
	}*/
	
	
		public void update(long time){
			update(time,0);
		}
	
	
	/**
	 * @param time
	 * @param modifire coldow reductions  -1 < x < .. 
	 */
	public void update(long time, double modifire){
		if (cd > 0)
		cd -= time * (1 + modifire);
	}
	
	
	public double getRange(){
		return range;
	}
	
	
}
