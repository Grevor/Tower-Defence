package model.abilities;

import java.util.List;

import org.ejml.data.FixedMatrix2_64F;

import model.Entity;
import model.Effeckts.Effeckt;
import model.abilities.projectile.HomingProjectile;
import model.abilities.projectile.Projectile;

public class HomingAbility extends Ability {

	public HomingAbility(double cd, double range, List<Effeckt> effect,double speed) {
		super(cd, range, effect, speed);
	}

	@Override
	public Projectile newProjectile(FixedMatrix2_64F position, Entity target) {
		return new HomingProjectile(effect, speed, position, target); 			
	}

}
