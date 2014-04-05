package model.collision;

import java.util.ArrayList;
import java.util.Iterator;

public class CollisionEngine<T extends ObjectWithCollider> {
	private CollisionMap	collisionMap;
	private ArrayList<T>	colliderObjects;

	public CollisionEngine(double width, double height, double resolution) {
		// TODO
	}

	/**
	 * Adds the given collider object to this collision engine given that its collider does not
	 * collide with anything else which is already inside the collision engine.
	 * 
	 * @param colliderObject
	 * @return true if the object was added, else false.
	 */
	public boolean addCollidingObjectAtExactPosition(T colliderObject) {
		// TODO
		return false;
	}

	public Iterator<T> getCollidingObjects(Collider collider) {
		// TODO
		return null;
	}

	public Iterator<T> getCollidingObjectsFiltered(Collider collider, Filter<T> filter) {
		// TODO
		return null;
	}
}
