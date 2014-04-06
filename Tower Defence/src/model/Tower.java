package model;

import java.util.LinkedList;

import model.abilities.Ability;
import model.types.ArmorType;

public class Tower extends Unit {

	public Tower(double hp){
		this(hp,ArmorType.normal, null);
	}

	public Tower(double hp,ArmorType armorType,LinkedList <Ability> abilities){
		super(hp, armorType, abilities);
	}

	@Override
	public void changeMovmentSpeed(double modifire) {
		return;
	}
	
	
}
