package model.abilities.projectile;

import java.util.List;

import org.ejml.data.FixedMatrix2_64F;

import model.Entity;
import model.Effeckts.Effeckt;



public abstract class Projectile extends Entity {

	private List <Effeckt> effeckts;
	double speed;
	FixedMatrix2_64F position;
	Entity target;
	
	public Projectile(List <Effeckt> effeckts, double speed, FixedMatrix2_64F position, Entity target) {
		this.effeckts = effeckts;
		this.speed = speed;
		this.position = position;
	}

	public abstract void update(Long time);
	
	public List<Effeckt> getEffeckts() {
		return effeckts;
	}	
	
}
