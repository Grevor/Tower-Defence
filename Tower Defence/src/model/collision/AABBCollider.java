package model.collision;

public class AABBCollider extends TranslateablePrimitiveCollider implements ReadableAABB {
	private double	halfWidth, halfHeight;
	private BoundingCircleInterface boundingCircleInterface; 

	public AABBCollider(double centerX, double centerY, double width, double height) {
		super(centerX, centerY);
		setWidth(width);
		setHeight(height);
		boundingCircleInterface = new BoundingCircleInterface();
	}
	
	public double getMinX() {
		return getCenterX() - halfWidth;
	}
	
	public double getMaxX() {
		return getCenterX() + halfWidth;
	}
	
	public double getMinY() {
		return getCenterY() - halfHeight;
	}
	
	public double getMaxY() {
		return getCenterY() + halfHeight;
	}
	
	public double getCenterX() {
		return this.position.a1;
	}
	
	public double getCenterY() {
		return this.position.a2;
	}
	
	public void setWidth(double w) {
		if (w < 0)
			throw new IllegalArgumentException("Negative width not allowed.");
		halfWidth = w/2;
		boundingCircleInterface.invalidate();
	}
	
	public void setHeight(double h) {
		if (h < 0)
			throw new IllegalArgumentException("Negative height not allowed.");
		halfHeight = h/2;
		boundingCircleInterface.invalidate();
	}
	
	public void setDimensions(double w, double h) {
		setWidth(w);
		setHeight(h);
	}

	@Override
	public ReadableCircle getBoundingCircle() {
		return boundingCircleInterface;
	}

	@Override
	public ReadableAABB getBoundingBox() {
		return this;
	}
	
	private class BoundingCircleInterface implements ReadableCircle {
		double radius = -1;
		
		@Override
		public double getCenterX() {
			return AABBCollider.this.getCenterX();
		}

		@Override
		public double getCenterY() {
			return AABBCollider.this.getCenterY();
		}

		@Override
		public double getRadius() {
			if (radius < 0) {
				radius = Math.sqrt(halfWidth*halfWidth + halfHeight*halfHeight);
			}
			return radius;
		}
		
		private void invalidate() {
			radius = -1;
		}
		
	}

}
