package math;

import org.ejml.data.FixedMatrix2_64F;
import org.ejml.data.FixedMatrix2x2_64F;

/**
 * Represents an affine transform
 * 
 * @author David
 */
public class Transform {
	private FixedMatrix2x2_64F	linearTransformation;
	private FixedMatrix2_64F	translation;

	public Transform() {
		this(
				1, 0, 0,
				0, 1, 0);
	}

	public Transform(double m11, double m12, double m13, double m21, double m22, double m23) {
		linearTransformation = new FixedMatrix2x2_64F(m11, m12, m21, m22);
		translation = new FixedMatrix2_64F(m13, m23);
	}
	
	public Transform(double x, double y, double rot) {
		linearTransformation = MatrixUtilities.createRotationMatrix(rot);
		translation = new FixedMatrix2_64F(x,y);
	}

	
	public Transform linearTransform(FixedMatrix2x2_64F matrix) {
		MatrixUtilities.safeMult(matrix, linearTransformation, linearTransformation);
		MatrixUtilities.safeMult(matrix, translation, translation);
		return this;
	}
	
	public Transform translate(FixedMatrix2_64F transl) {
		translation.a1 += transl.a1;
		translation.a2 += transl.a2;
		return this;
	}
	
	/**
	 * this = A * this
	 * 
	 * @param A
	 * @return this
	 */
	public Transform transformEqual(Transform A) {
		this.linearTransform(A.linearTransformation);
		this.translate(A.translation);
		return this;
	}

	/**
	 * this = A
	 * 
	 * @param A
	 * @return this
	 */
	public Transform setTransform(Transform A) {
		MatrixUtilities.setMatrix2x2(A.linearTransformation, this.linearTransformation);
		MatrixUtilities.setVector2(A.translation, this.translation);
		return this;
	}
	
/*	*//**
	 * Gets the translation of this Transform.
	 * @param dst is the destination vector. May be null in which case a new vector is created.
	 * @return the destination vector.
	 *//*
	public FixedMatrix2_64F getTranslation(FixedMatrix2_64F dst) {
		if (dst == null)
			dst = new FixedMatrix2_64F();
		MatrixUtilities.setVector2(translation, dst);
		return dst;
	}*/

	public static FixedMatrix2_64F mult(Transform transform, FixedMatrix2_64F src, FixedMatrix2_64F dst) {
		dst = MatrixUtilities.safeMult(transform.linearTransformation, src, dst);
		MatrixUtilities.add(transform.translation, dst, dst);
		return dst;
	}
}
