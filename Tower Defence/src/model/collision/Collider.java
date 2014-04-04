package model.collision;

import java.util.Iterator;

public interface Collider {
	public abstract Iterator<PrimitiveCollider> getPrimitives();
	/**
	 * Gets the collision type of this Collider.
	 * @see model.collision.CollisionTypes
	 * @return 
	 */
	public abstract long getCollisionType();
	/**
	 * Checks if a Collider may have changed physical appearance. Used for performance reasons.
	 * @return true if this Collider changed between previous and the current frame.
	 */
	public abstract boolean hasChanged();
}
