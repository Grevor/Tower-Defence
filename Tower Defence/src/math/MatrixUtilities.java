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
	
	/**
	 * Convenience method for vector addition. 
	 * <br> dst = src1 + src2
	 * <br> All arguments may be the same vector object e.g.
	 * <br> a = a + a
	 * @param src1 may not be null
	 * @param src2 may not be null
	 * @param dst may be null (in which case a new vector is created)
	 * @return dst
	 */
	public static FixedMatrix2_64F add(FixedMatrix2_64F src1, FixedMatrix2_64F src2, FixedMatrix2_64F dst) {
		if (dst == null)
			dst = new FixedMatrix2_64F();
		dst.a1 = src1.a1 + src2.a2;
		dst.a2 = src1.a2 + src2.a2;
		return dst;
	}
	
    /**
     * Convenience method for matrix-matrix multiplication.<br>
     * <br>
     * dst = matrix1 * matrix2 <br>
     * 
     * @param matrix1 The left matrix in the multiplication operation. Not modified.
     * @param matrix2 The right matrix in the multiplication operation. Not modified.
     * @param dst May be the same as either source matrix, or null (in which case a new matrix is created)
     * @return dst
     */
    public static FixedMatrix2x2_64F safeMult( FixedMatrix2x2_64F matrix1 , FixedMatrix2x2_64F matrix2 , FixedMatrix2x2_64F dst) {
    	if (dst == null)
			dst = new FixedMatrix2x2_64F();
    	double tempX; 
    	tempX = matrix1.a11*matrix2.a11 + matrix1.a12*matrix2.a21;
        dst.a12 = matrix1.a11*matrix2.a12 + matrix1.a12*matrix2.a22;
        dst.a11 = tempX;
        tempX = matrix1.a21*matrix2.a11 + matrix1.a22*matrix2.a21;
        dst.a22 = matrix1.a21*matrix2.a12 + matrix1.a22*matrix2.a22;
        dst.a21 = tempX;
        return dst;
    }
	
	/**
	 * Convenience method for matrix-vector multiplication.
	 * @param matrix
	 * @param vector != null
	 * @param dst May be the same as source vector, or null (in which case a new vector is created) 
	 * @return dst
	 */
	public static FixedMatrix2_64F safeMult(FixedMatrix2x2_64F matrix, FixedMatrix2_64F vector, FixedMatrix2_64F dst) {
		if (dst == null)
			dst = new FixedMatrix2_64F();
		double tempX = matrix.a11*vector.a1 + matrix.a12*vector.a2;
		dst.a2 = matrix.a21*vector.a1 + matrix.a22*vector.a2;
		dst.a1 = tempX;
		return dst;
	}
}
