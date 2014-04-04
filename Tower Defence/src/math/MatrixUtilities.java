package math;

import org.ejml.data.FixedMatrix2_64F;
import org.ejml.data.FixedMatrix2x2_64F;

public class MatrixUtilities {
	/**
	 * Sets all elements in dst to be equal to src
	 * 
	 * @param src is the source matrix
	 * @param dst is the destination matrix
	 */
	public static void setMatrix2x2(FixedMatrix2x2_64F src, FixedMatrix2x2_64F dst) {
		dst.a11 = src.a11;
		dst.a12 = src.a12;
		dst.a21 = src.a21;
		dst.a22 = src.a22;
	}

	/**
	 * Sets all elements in dst to be equal to src
	 * 
	 * @param src is the source matrix
	 * @param dst is the destination matrix
	 */
	public static void setVector2(FixedMatrix2_64F src, FixedMatrix2_64F dst) {
		dst.a1 = src.a1;
		dst.a2 = src.a2;
	}

	/**
	 * Set a matrix to be a rotation matrix
	 * 
	 * @param angle is the clockwise angle in radians when x-axis point to the left and y-axis point
	 *            down
	 * @param dst is the destination matrix
	 */
	public static void setRotationMatrix(double angle, FixedMatrix2x2_64F dst) {
		//@formatter:off
		dst.a11 = Math.cos(angle); dst.a12 = -Math.sin(angle);
		dst.a21 = Math.sin(angle); dst.a22 = Math.cos(angle);
		//@formatter:on
	}

	public static FixedMatrix2x2_64F createRotationMatrix(double angle) {
		FixedMatrix2x2_64F ret = new FixedMatrix2x2_64F();
		setRotationMatrix(angle, ret);
		return ret;
	}
	
	public static double distanceSquared(FixedMatrix2_64F a, FixedMatrix2_64F b) {
		double x = b.a1-a.a1;
		double y = b.a2-a.a2;
		return x*x+y*y;
	}
	
	public static double distance(FixedMatrix2_64F a, FixedMatrix2_64F b) {
		return Math.sqrt(distanceSquared(a, b));
	}
}
