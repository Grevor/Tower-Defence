package model.collision;

public class AxisAlignedRectangularCollider extends TranslateablePrimitiveCollider {
	private double	halfWidth, halfHeight;

	public AxisAlignedRectangularCollider(double x, double y, double width, double height) {
		super(x, y);
		setWidth(width);
		setHeight(height);
	}
	
	public void setWidth(double w) {
		if (w < 0)
			throw new IllegalArgumentException("Negative halfWidth not allowed.");
		halfWidth = w/2;
	}
	
	public void setHeight(double h) {
		if (h < 0)
			throw new IllegalArgumentException("Negative halfHeight not allowed.");
		halfHeight = h/2;
	}
	
	public void setDimensions(double w, double h) {
		setWidth(w);
		setHeight(h);
	}
	
	public static boolean collides(AxisAlignedRectangularCollider A, AxisAlignedRectangularCollider B) {
		return A.position.a1 - A.halfWidth < B.position.a1 + B.halfWidth &&
				A.position.a1 + A.halfWidth > B.position.a1 - B.halfWidth &&
				A.position.a2 - A.halfHeight < B.position.a2 + B.halfHeight &&
				A.position.a2 + A.halfHeight > B.position.a2 - B.halfHeight;
	}

}
