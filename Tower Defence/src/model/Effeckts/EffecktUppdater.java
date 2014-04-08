package model.Effeckts;


import java.util.LinkedList;
import java.util.ListIterator;

public class EffecktUppdater {

	double movmentSpeed;
	double attackSpeed;
	double hp;
	double attackDamge;
	
	
	/**
	 * applay and uppdates effects on an objeckt
	 * @param effectebul an effecteblu object
	 * @param time of the uppdate
	 * @return ture if the object is dead
	 */
	public boolean uppdate(Effectebul effectebul,Long time, LinkedList <Effeckt> effects){
		movmentSpeed = 0;
		attackSpeed = 0;
		hp = 0;
		attackDamge = 0;
		IterateEffeckts(effectebul, time,effects);
		
		
		if (effectebul.changeHp(hp)){
			return true;
		}
		if (attackSpeed > 0){
		effectebul.changeAttackSpeed(attackSpeed);
		}else {
			effectebul.changeAttackSpeed(0);}		
		if (movmentSpeed > 0){
				effectebul.changeMovmentSpeed(movmentSpeed);
			}else {
				effectebul.changeMovmentSpeed(0);}
		
		if (attackDamge > 0){
			effectebul.changeDamgePercent(attackDamge);
		}else {
			effectebul.changeDamgePercent(0);}
		return false;
	}



	private void IterateEffeckts(Effectebul effectebul, Long time, LinkedList <Effeckt> effects) {
		ListIterator <Effeckt> iterator =  effects.listIterator();
		while (iterator.hasNext()){
			
			Effeckt effect = iterator.next();
			switch (effect.getType()) {
			case DAMAGE:
				hp -= DamgeCalculator.damge(effect.getValue(),effect.getDamgeType(),effectebul.getArmorType());
				break;
			case HEAL:
				if(effectebul.canBeHealed())
				hp += effect.getValue();
				break;
			case ATTACK_SPEED:
				attackSpeed += effect.getValue();
				break;
			case MOVMENT_SPEED:
				movmentSpeed += effect.getValue();
				break;
			case ATTACK_DAMAGE:
				attackDamge += effect.getValue();
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
