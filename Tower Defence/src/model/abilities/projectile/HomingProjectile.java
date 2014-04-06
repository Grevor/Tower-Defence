package model.abilities.projectile;

import java.util.List;

import org.ejml.data.FixedMatrix2_64F;

import model.Entity;
import model.Effeckts.Effeckt;
import model.collision.Collider;

public class HomingProjectile extends Projectile {

	public HomingProjectile(List<Effeckt> effeckts, double speed, FixedMatrix2_64F position, Entity target) {
		super(effeckts, speed,position,target);
	}

	@Override
	public void update(Long time){
		
	}

	@Override
	public Collider getCollider() {
		// TODO Auto-generated method stub
		return null;
	}
}
