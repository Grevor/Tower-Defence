package model;


import model.collision.Collider;
import model.types.ArmorType;
import model.types.DamageType;

public abstract class Mob extends Entity {

	private double hp;
	private double damage;
	private double attackSpeed;
	private double attackSpeedCD;
	private ArmorType armorType;
	private DamageType damageType;
	
	public Mob(double hp, double damage, double attackSpeed){
		this(hp,damage,attackSpeed, ArmorType.normal, DamageType.normal);
	}

	public Mob(double hp, double damage, double attackSpeed, ArmorType armorType, DamageType damageType){
		this.hp = hp;
		this.damage = damage;
		this.attackSpeed = attackSpeed;
		this.armorType = armorType;
		this.damageType = damageType;	
	}
	
	//returns the dmage of an attack, returns 0 if the attack isent ready 
	public boolean attack(){
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
