package model.collision;

import java.awt.Point;

public class CollisionUtilities {
	public static boolean collides(Collider A, Collider B) {
		// TODO
		return false;
	}

	/**
	 * Bounding circle test.
	 * 
	 * @param A
	 * @param B
	 * @return true if circle A and circle B have any point in common, else false.
	 */
	public static boolean collides(ReadableCircle A, ReadableCircle B) {
		return Point.distance(A.getCenterX(), A.getCenterY(), B.getCenterX(), B.getCenterY())
		<= A.getRadius() + B.getRadius();
	}

	/**
	 * Bound box test. Tests collision between two Axis Aligned Bounding Boxes. 
	 * 
	 * @param A
	 * @param B
	 * @return true if AABB A and AABB B have any point in common, else false.
	 */
	public static boolean collides(ReadableAABB A, ReadableAABB B) {
		return A.getMinX() < B.getMaxX() &&
				A.getMaxX() > B.getMinX() &&
				A.getMinY() < B.getMaxY() &&
				A.getMaxY() > B.getMinY();
	}

	/**
	 * Check collision between 2 primitive colliders.
	 * 
	 * @param A
	 * @param B
	 * @return true if A and B have any points in common (i.e. if they overlap), else false.
	 */
	public static boolean collides(PrimitiveCollider A, PrimitiveCollider B) {
		// TODO
		return false;
	}

	public static boolean collides(ReadableCircle circle, ReadableAABB box) {
		double circleX = circle.getCenterX();
		double circleY = circle.getCenterY();
		double r = circle.getRadius();
		double xDist = getXDistance(box, circleX);
		double yDist = getYDistance(box, circleY);
		return xDist * xDist + yDist * yDist <= r * r;
	}

	public static double getXDistance(ReadableAABB box, double x) {
		double leftDist = box.getMinX() - x;
		if (leftDist < 0) {
			double rightDist = x - box.getMaxX();
			if (rightDist < 0) {
				return 0;
			}
			return rightDist;
		}
		return leftDist;
	}

	public static double getYDistance(ReadableAABB box, double y) {
		double topDist = box.getMinY() - y;
		if (topDist < 0) {
			double bottomDist = y - box.getMaxY();
			if (bottomDist < 0) {
				return 0;
			}
			return bottomDist;
		}
		return topDist;
	}
}
