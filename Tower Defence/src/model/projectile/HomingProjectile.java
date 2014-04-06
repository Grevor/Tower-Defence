package model.projectile;

import java.util.LinkedList;

import model.Entity;
import model.Effeckts.Effeckt;
import model.collision.Collider;

import org.ejml.data.FixedMatrix2_64F;

public class HomingProjectile extends Projectile {

	Entity target;
	
	public HomingProjectile(LinkedList<Effeckt> effeckts, double speed, FixedMatrix2_64F position, Entity target) {
		super(effeckts, speed,position);
		this.target = target;
	}

	@Override
	public void update(Long time){
		
	}

	@Override
	public Collider getCollider() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exist() {
		// TODO Auto-generated method stub
		return true;
	}
}
