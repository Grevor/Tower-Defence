package model.abilities;

import java.util.LinkedList;

import org.ejml.data.FixedMatrix2_64F;

import model.Entity;
import model.Effeckts.Effeckt;
import model.projectile.Projectile;


public abstract class Ability {
	
	private double cd;
	private double maxCd;
	protected double speed;
	private double range;
	LinkedList <Effeckt> effect;
	
	
	public abstract Projectile newProjectile(FixedMatrix2_64F position, Entity target);
		
	

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
	 * @param position
	 * @param target
	 * @return
	 */
	public Projectile use(FixedMatrix2_64F position, Entity target){
		if (ready()){
			cd = maxCd;
			return newProjectile(position, target);
		}
		return null;
	}
	
	
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
	
	
	
}
