package model.projectile;

import java.util.LinkedList;
import java.util.List;

import model.Entity;
import model.Effeckts.Effeckt;

import org.ejml.data.FixedMatrix2_64F;



public abstract class Projectile extends Entity {

	private LinkedList <Effeckt> effeckts;
	double speed;
	double size;
	public Projectile(LinkedList <Effeckt> effeckts, double speed,double size, FixedMatrix2_64F position) {
		this.effeckts = effeckts;
		this.speed = speed;
		this.position = position;
		this.size = size;
	}

	public abstract void update(Long time);
	
	public List<Effeckt> getEffeckts() {
		return effeckts;
	}	
	
}
