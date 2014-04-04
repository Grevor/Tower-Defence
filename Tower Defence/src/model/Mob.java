package model;


import model.Types.ArmorType;
import model.Types.DamgeType;
import model.collision.Collider;

public class Mob extends Entity{

	private double hp;
	private double damge;
	private double attackSpeed;
	private double attackSpeedCd;
	private ArmorType armorType;
	private DamgeType damgeType;
	
	
	public Mob(double hp, double damge, double attackSpeed){
		this(hp,damge,attackSpeed, ArmorType.normal, DamgeType.normal);
	}

	public Mob(double hp, double damge, double attackSpeed, ArmorType armorTpye, DamgeType damgeType){
		this.hp = hp;
		this.damge = damge;
		this.attackSpeed = attackSpeed;
		this.armorType = armorTpye;
		this.damgeType = damgeType;	
	}
	
	
	//returns the dmage of an attack, returns 0 if the attack isent ready 
		public boolean attack(){
			//TODO
		return false;
		}
	
	
	//damge the  mob return true if the mob is dead
	public boolean damge(double damge){
		hp -= damge;
		return this.isDead();
	}
	
	
	
	public boolean isDead(){
	 return hp > 0;
	}

	@Override
	public Collider getCollider() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
