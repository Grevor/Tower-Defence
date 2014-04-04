package model;

import model.collision.Collider;

import org.ejml.data.FixedMatrix2_64F;

public abstract class Entity {
	protected FixedMatrix2_64F position;
	
	public FixedMatrix2_64F getPositionVector() {
		return position;
	}
	
	public abstract Collider getCollider();
	
}
