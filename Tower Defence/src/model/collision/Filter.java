package model.collision;

public interface Filter<T> {
	public abstract boolean passesFilter(T object);
}
