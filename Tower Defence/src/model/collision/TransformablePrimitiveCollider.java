package model.collision;

import org.ejml.data.FixedMatrix2_64F;

import math.Transform;

public abstract class TransformablePrimitiveCollider implements PrimitiveCollider {
	protected Transform	transform;

	protected TransformablePrimitiveCollider() {
		this(new Transform());
	}
	
	protected TransformablePrimitiveCollider(Transform transform) {
		this.transform = transform;
	}

	protected TransformablePrimitiveCollider(double x, double y) {
		transform = new Transform(
				1, 0, x,
				0, 1, y);
	}

	public Transform getTransform() {
		return this.transform;
	}

	@Override
	public PrimitiveCollider translate(FixedMatrix2_64F translation) {
		this.transform.translate(translation);
		return this;
	}

	@Override
	public PrimitiveCollider transform(Transform transform) {
		this.transform.transformEqual(transform);
		return this;
	}
}
