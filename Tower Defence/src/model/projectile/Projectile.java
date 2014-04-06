package model.projectile;

import java.util.List;

import model.Entity;
import model.Effeckts.Effeckt;

import org.ejml.data.FixedMatrix2_64F;



public abstract class Projectile extends Entity {

	private List <Effeckt> effeckts;
	double speed;

	
	public Projectile(List <Effeckt> effeckts, double speed, FixedMatrix2_64F position) {
		this.effeckts = effeckts;
		this.speed = speed;
		this.position = position;
	}

	public abstract void update(Long time);
	
	public List<Effeckt> getEffeckts() {
		return effeckts;
	}	
	
}
