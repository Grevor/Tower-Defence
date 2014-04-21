package model;

import org.ejml.data.FixedMatrix2_64F;

import phyzix.collision.Collider;
import phyzix.collision.ObjectWithCollider;

public abstract class Entity {
	protected FixedMatrix2_64F position;
	
	public FixedMatrix2_64F getPositionVector() {
		return position;
	}
	
	public abstract boolean exist();
	
}
