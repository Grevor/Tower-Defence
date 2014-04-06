package model.Effeckts;

import java.util.LinkedList;

public interface Effectebul {

	/**
	 * @param change Movment Speed whit modifire % 
	 */
	public void changeMovmentSpeed(double modifire);
	/**
	 * @param  @param change Attack Speed whit modifire %
	 */
	public void changeAttackSpeed(double modifire);
	/**
	 * @param change Hp whit modifire (negativ is damage, posetiv is heal)
	 * @return true if objeckts is dead
	 */
	public boolean changeHp(double modifire);
	/**
	 * @return get all the effeckts on objeckt
	 */
	public LinkedList<Effeckt> getEffects();
	/**
	 * @param effect add an effect on objeckts
	 */
	public void addEffect(Effeckt effect);
}
