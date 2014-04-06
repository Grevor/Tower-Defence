package model.collision;

import math.Transform;

import org.ejml.data.FixedMatrix2_64F;

public interface PrimitiveCollider {
	public PrimitiveCollider translate(FixedMatrix2_64F translation);
	public PrimitiveCollider transform(Transform transform);
	public ReadableCircle getBoundingCircle();
	public ReadableAABB getBoundingBox();
}
