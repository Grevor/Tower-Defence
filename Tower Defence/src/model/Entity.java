package model;

import model.collision.Collider;
import model.collision.ObjectWithCollider;

import org.ejml.data.FixedMatrix2_64F;

public abstract class Entity implements ObjectWithCollider {
	protected FixedMatrix2_64F position;
	
	public FixedMatrix2_64F getPositionVector() {
		return position;
	}
	
	public abstract Collider getCollider();
	
}
