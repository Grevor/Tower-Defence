package model.Effeckts;

import java.util.List;





public class EffecktApplayer {

	double movmentSpeed;
	double attackSpeed;
	double hp;
	
	public boolean apply(Effectebul effectebul){
		movmentSpeed = 0;
		attackSpeed = 0;
		hp = 0;
		List <Effeckt> effects = effectebul.getEffects();	
		while (effects != null){
			Effeckt effect = effects.get(0);
			switch (effect.getType()) {
			case Damage:
				hp -= effect.getValue();
				break;
			case Heal:
				hp += effect.getValue();
				break;
			case attackSpeed:
				attackSpeed -= effect.getValue();
				break;
			case MovmentSpeedChange:
				movmentSpeed -= effect.getValue();
				break;
			default:
				break;
			}
		}
		
		
		if (effectebul.changeHp(hp)){
			return true;
		}
		effectebul.changeAttackSpeed(attackSpeed);
		effectebul.changeMovmentSpeed(movmentSpeed);
		return false;
	}
	
	
}
