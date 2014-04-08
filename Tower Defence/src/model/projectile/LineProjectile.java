package model.projectile;

import java.util.LinkedList;

import org.ejml.data.FixedMatrix2_64F;

import model.Effeckts.Effeckt;
import model.collision.Collider;

public class LineProjectile  extends Projectile  {

	FixedMatrix2_64F target;
	
	public LineProjectile(LinkedList<Effeckt> effeckts, double speed,double size, FixedMatrix2_64F position, FixedMatrix2_64F target) {
		super(effeckts, speed,size,position);
		this.target = target;
	}

	@Override
	public void update(Long time) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exist() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Collider getCollider() {
		// TODO Auto-generated method stub
		return null;
	}

}
