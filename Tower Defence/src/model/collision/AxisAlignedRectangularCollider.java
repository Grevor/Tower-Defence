package model.collision;

public class AxisAlignedRectangularCollider extends TranslateablePrimitiveCollider {
	private double	width, height;

	public AxisAlignedRectangularCollider(double x, double y, double width, double height) {
		super(x, y);
		setWidth(width);
		setHeight(height);
	}
	
	public void setWidth(double w) {
		if (w < 0)
			throw new IllegalArgumentException("Negative width not allowed.");
		width = w;
	}
	
	public void setHeight(double h) {
		if (h < 0)
			throw new IllegalArgumentException("Negative height not allowed.");
		height = h;
	}
	
	public void setDimensions(double w, double h) {
		setWidth(w);
		setHeight(h);
	}
	
	public static boolean collides(AxisAlignedRectangularCollider A, AxisAlignedRectangularCollider B) {
		return A.position.a1 < B.position.a1 + B.width &&
				A.position.a1 + A.width > B.position.a1 &&
				A.position.a2 < B.position.a2 + B.height &&
				A.position.a2 + A.height > B.position.a2;
	}

}
