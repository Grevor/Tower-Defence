package model.abilities;

import java.util.LinkedList;

import model.Entity;
import model.Effeckts.Effeckt;
import model.projectile.HomingProjectile;
import model.projectile.Projectile;

import org.ejml.data.FixedMatrix2_64F;

public class HomingAbility extends Ability {

	public HomingAbility(double cd, double range, LinkedList<Effeckt> effect,double speed) {
		super(cd, range, effect, speed);
	}
	
	public Projectile newProjectile(FixedMatrix2_64F position, Entity target) {
		return new HomingProjectile(effect, speed, position, target); 			
	}
	
	public Projectile use(FixedMatrix2_64F position, Entity target){
		if (ready()){
			cd = maxCd;
			return newProjectile(position, target);
		}
		return null;
	}

}
