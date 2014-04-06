package model;

import java.util.LinkedList;

import model.Effeckts.Effeckt;
import model.Effeckts.Effectebul;
import model.abilities.Ability;
import model.types.ArmorType;

public abstract class Unit extends HealtObject implements Effectebul {

	 
	protected UnitType unitType;
	protected ArmorType armorType;
	protected LinkedList <Ability> abilities;
	protected LinkedList <Effeckt> effects;
	protected double coldwonReduction;
	protected double damgeModifire;
	private double size;
	
	
	public Unit(double hp,ArmorType armorType,LinkedList <Ability> abilities){
		this.hp = hp;
		this.armorType = armorType;
		this.abilities = abilities;
	}
	
	
	@Override
	public LinkedList<Effeckt> getEffects() {
		return effects;
	}

	@Override
	public void addEffect(Effeckt effect) {
		effects.add(effect);
		
	}
	
	public LinkedList <Ability> getAbilities(){
		return abilities;
	}
	
	
	//returns the dmage of an attack, returns 0 if the attack isent ready 
	public boolean useAbility(){
		//TODO
		return false;
	}
	
	//damge the  mob return true if the mob is dead
	public boolean damage(double damage){
		hp -= damage;
		return this.isDead();
	}
	
	public boolean isDead(){
	 return hp > 0;
	}


	@Override
	public void changeAttackSpeed(double modifire) {
		coldwonReduction = modifire;
	}

	@Override
	public boolean changeHp(double modifire) {
		hp += modifire;
		if (isDead()){
			return true;
		}
		else if (hp > maxHp){
			hp = maxHp;
		}
		return false;
	}

	
	
	@Override
	public boolean exist() {
		return !isDead();
	}
	
	
	public double getSize(){
		return size;
	}
	
	@Override
	public void changeDamgePercent(double modifire) {
		damgeModifire = modifire;
	}
	
}
