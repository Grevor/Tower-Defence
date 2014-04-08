package model.abilities;

import java.util.LinkedList;

import model.Effeckts.Effeckt;
import model.projectile.LineProjectile;
import model.projectile.Projectile;

import org.ejml.data.FixedMatrix2_64F;

public class LineAbility extends Ability {
	
	
	
	public LineAbility(double cd, double range, LinkedList<Effeckt> effect, double speed) {
		super(cd, range, effect, speed);
	}


	public Projectile newProjectile(FixedMatrix2_64F position, FixedMatrix2_64F target) {
		//TODO size
		int size = 0;
		return new LineProjectile(effect, speed,size, position, target); 			
	}
	
	
	public Projectile use(FixedMatrix2_64F position, FixedMatrix2_64F target){
		if (ready()){
			cd = maxCd;
			return newProjectile(position, target);
		}
		return null;
	}

}
