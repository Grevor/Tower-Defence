package model.Effeckts;

import model.types.ArmorType;
import model.types.DamageType;

public class DamgeCalculator {

	
	
	public static double damge (double damge,DamageType damageType, ArmorType armorType){
		switch (damageType){
		case NORMAL:
			return damge * normalDamge(armorType);
		case MAGIC:
			return damge * magicDamge(armorType);
		default:
			throw new IllegalArgumentException("Invalid damge type" + damageType);
		}
	}
	
	
	
	public static double normalDamge (ArmorType armorType){
		switch (armorType) {
		case NORMAL:
			return 1;
		case NOARMOR:
			return 1.3;
		default:
			throw new IllegalArgumentException("Invalid armmor type" + armorType);
		}
	}
	
	public static double magicDamge (ArmorType armorType){
		switch (armorType) {
		case NORMAL:
			return 1;
		case NOARMOR:
			return 0.7;
		default:
			throw new IllegalArgumentException("Invalid armmor type" + armorType);
		}
	}
	
	
	
	
	
}
