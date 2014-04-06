package model.collision;

import math.MatrixUtilities;

import org.ejml.data.FixedMatrix2_64F;

public class CircleCollider extends TranslateablePrimitiveCollider implements ReadableCircle {
	private double radius;
	private BoundingBoxInterface boundingBoxInterface;
	
	public CircleCollider(double r) {
		this(0,0,r);
	}
	
	public CircleCollider(double x, double y, double r) {
		super(x,y);
		if (r <0) {
			throw new IllegalArgumentException("Radius must be non-negative.");
		}
		radius = r;
		boundingBoxInterface = new BoundingBoxInterface();
	}
	
	public double getCenterX() {
		return this.position.a1;
	}
	
	public double getCenterY() {
		return this.position.a2;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public FixedMatrix2_64F getCenter(FixedMatrix2_64F dst) {
		if (dst == null)
			dst = new FixedMatrix2_64F();
		MatrixUtilities.setVector2(this.position,  dst);
		return dst;
	}

	@Override
	public ReadableCircle getBoundingCircle() {
		return this;
	}

	@Override
	public ReadableAABB getBoundingBox() {
		return boundingBoxInterface;
	}
	
	private class BoundingBoxInterface implements ReadableAABB {

		@Override
		public double getMinX() {
			return getCenterX() - getRadius();
		}

		@Override
		public double getMaxX() {
			return getCenterX() + getRadius();
		}

		@Override
		public double getMinY() {
			return getCenterY() - getRadius();
		}

		@Override
		public double getMaxY() {
			return getCenterY() + getRadius();
		}
		
	}
	
}
