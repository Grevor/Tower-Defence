package model.collision;

import math.Transform;

import org.ejml.data.FixedMatrix2_64F;

/**
 * Base class for primitive colliders which does not care about rotation and scaling.
 * Examples of such colliders are circle-colliders and axis-aligned-colliders
 * @author David
 *
 */
public abstract class TranslateablePrimitiveCollider implements PrimitiveCollider {
	protected FixedMatrix2_64F position;
	
	protected TranslateablePrimitiveCollider(double x, double y) {
		position = new FixedMatrix2_64F(x,y);
	}
	
	public PrimitiveCollider translate(FixedMatrix2_64F translation) {
		position.a1 += translation.a1;
		position.a2 += translation.a2;
		return this;
	}

	@Override
	public PrimitiveCollider transform(Transform transform) {
		Transform.mult(transform, position, position);
		return this;
	}
}
