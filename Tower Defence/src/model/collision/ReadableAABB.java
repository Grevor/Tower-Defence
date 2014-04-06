package model.collision;

/**
 * Interface for 2-dimensional Axis Aligned Bounding Box 
 * @author David
 *
 */
public interface ReadableAABB {
	public double getMinX();
	public double getMaxX();
	public double getMinY();
	public double getMaxY();
}
