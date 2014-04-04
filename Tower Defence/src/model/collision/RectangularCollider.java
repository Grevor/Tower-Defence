package model.collision;

import math.Transform;

public class RectangularCollider extends TransformablePrimitiveCollider {
	private double width, height;
	
	/**
	 * 
	 * @param x center x
	 * @param y center y
	 * @param width
	 * @param height
	 * @param rotation
	 */
	public RectangularCollider(double x, double y, double width, double height, double rotation) {
		super(new Transform(x,y,rotation));
		this.width = width;
		this.height = height;
	}

}
