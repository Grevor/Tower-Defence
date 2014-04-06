package model;


import java.util.LinkedList;
import java.util.List;




import model.Effeckts.Effeckt;
import model.abilities.Ability;
import model.types.ArmorType;


public class Mob extends Unit {

	protected double standardMovmentSpeed;
	protected double curnetMovmentSpeed;
	
	public Mob(double hp){
		this(hp,ArmorType.normal, null);
	}

	public Mob(double hp,ArmorType armorType,LinkedList <Ability> abilities){
		super(hp, armorType, abilities);
	}
	

	@Override
	public void changeMovmentSpeed(double modifire) {
		curnetMovmentSpeed = standardMovmentSpeed * modifire;
	}


	
}
