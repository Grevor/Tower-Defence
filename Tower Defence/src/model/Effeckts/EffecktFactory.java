package model.Effeckts;

import model.types.DamageType;
import model.types.EffecktType;

public class EffecktFactory {
	
	
	public static Effeckt movmentDecrese(double percentDecrese, double area){
		return new Effeckt(EffecktType.MOVMENT_SPEED, area, null, -percentDecrese);
	}
	
	public static Effeckt movmentIncrese(double percentIncrese, double area){
		return new Effeckt(EffecktType.MOVMENT_SPEED, area, null, percentIncrese);
	}
	
	public static Effeckt damge(double damge, double area, DamageType damgeType){
		return new Effeckt(EffecktType.DAMAGE, area, damgeType, -damge);
	}
	
	public static Effeckt heal(double heal, double area){
		return new Effeckt(EffecktType.HEAL, area, null, heal);
	}

	public static Effeckt AttackSpeedDecrese(double percentDecrese, double area){
		return new Effeckt(EffecktType.ATTACK_SPEED, area, null, -percentDecrese);
	}
	
	public static Effeckt AttackSpeedIncrese(double percentIncrese, double area){
		return new Effeckt(EffecktType.ATTACK_SPEED, area, null, percentIncrese);
	}
	
	public static Effeckt DamgePercentDecrese(double percentDecrese, double area){
		return new Effeckt(EffecktType.ATTACK_DAMAGE, area, null, -percentDecrese);
	}
	
	public static Effeckt DamgePercentIncrese(double percentIncrese, double area){
		return new Effeckt(EffecktType.ATTACK_DAMAGE, area, null, percentIncrese);
	}
}
