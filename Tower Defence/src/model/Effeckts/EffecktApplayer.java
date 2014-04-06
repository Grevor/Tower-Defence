package model.Effeckts;


import java.util.ListIterator;

public class EffecktApplayer {

	double movmentSpeed;
	double attackSpeed;
	double hp;
	
	
	
	/**
	 * applay and uppdates effects on an objeckt
	 * @param effectebul an effecteblu object
	 * @param time of the uppdate
	 * @return ture if the object is dead
	 */
	public boolean uppdate(Effectebul effectebul,Long time){
		movmentSpeed = 0;
		attackSpeed = 0;
		hp = 0;

		IterateEffeckts(effectebul, time);
		
		
		if (effectebul.changeHp(hp)){
			return true;
		}
		effectebul.changeAttackSpeed(attackSpeed);
		effectebul.changeMovmentSpeed(movmentSpeed);
		return false;
	}



	private void IterateEffeckts(Effectebul effectebul, Long time) {
		ListIterator <Effeckt> iterator =  effectebul.getEffects().listIterator();
		while (iterator.hasNext()){
			
			Effeckt effect = iterator.next();
			switch (effect.getType()) {
			case DAMAGE:
				hp -= effect.getValue();
				break;
			case HEAL:
				hp += effect.getValue();
				break;
			case ATTACK_SPEED:
				attackSpeed -= effect.getValue();
				break;
			case MOVMENT_SPEED:
				movmentSpeed -= effect.getValue();
				break;
			default:
				throw new IllegalArgumentException("invalid effeckt " + effect.getType());
			}
				if (effect.uppdate(time) == false){
					iterator.remove();
				}
			
			
		}
	}
	
	
}
