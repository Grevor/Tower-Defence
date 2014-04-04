package model.collision;

import math.MatrixUtilities;

import org.ejml.data.FixedMatrix2_64F;

public class CircleCollider extends TranslateablePrimitiveCollider {
	double radius;
	
	public CircleCollider(double r) {
		this(0,0,r);
	}
	
	public CircleCollider(double x, double y, double r) {
		super(x,y);
		radius = r;
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
	
	public static boolean collides(CircleCollider A, CircleCollider B) {
		double distance = MatrixUtilities.distance(A.position, B.position);
		return distance <= A.getRadius() + B.getRadius();
	}
	
}
