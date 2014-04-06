package model;


import java.util.List;

import model.Effeckts.Effectebul;
import model.abilities.Ability;
import model.types.ArmorType;


public abstract class Mob extends HealtObject implements Effectebul {

	private ArmorType armorType;
	private List <Ability> abilities;
	
	public Mob(double hp){
		this(hp,ArmorType.normal, null);
	}

	public Mob(double hp,ArmorType armorType,List <Ability> abilities){
		this.hp = hp;
		this.armorType = armorType;
		this.abilities = abilities;
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
	
}
