package model.abilities;

import java.util.List;

import org.ejml.data.FixedMatrix2_64F;

import model.Entity;
import model.Effeckts.Effeckt;
import model.abilities.projectile.Projectile;


public abstract class Ability {
	
	private double cd;
	private double maxCd;
	protected double speed;
	private double range;
	List <Effeckt> effect;
	
	
	public abstract Projectile newProjectile(FixedMatrix2_64F position, Entity target);
		
	

	public Ability(double cd,double range, List <Effeckt> effect,double speed) {
		cd = 0;
		this.maxCd = cd;
		this.speed = speed;
		this.range = range;
		this.effect = effect;
	}
	
	public boolean ready(){
		return cd <= 0;
	}
	
	
	//returns the damge of an attack, returns 0 if the attack isent ready 
	public Projectile use(FixedMatrix2_64F position, Entity target){
		if (ready()){
			cd = maxCd;
			return newProjectile(position, target);
		}
		return null;
	}
	
	
		public void update(long time){
			update(time,1);
		}
	
	//uppdate for etach frame
	public void update(long time, double modifire){
		if (cd > 0)
		cd -= time * modifire;
	}
	
	
	
}
