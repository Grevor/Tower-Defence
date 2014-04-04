package model.collision;

import java.util.Iterator;

public interface Collider {
	public abstract Iterator<PrimitiveCollider> getPrimitives();
	public abstract long getCollisionType();
}
