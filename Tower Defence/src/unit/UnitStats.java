package unit;

import java.util.LinkedList;

import model.HealthObject;
import model.HpObjeckt;
import model.Effeckts.Effectebul;
import model.abilities.Ability;
import model.types.ArmorType;
import model.types.DamageType;

public class UnitStats extends HealthObject implements Effectebul {

	protected double movmentSpeed;
	protected double curnetMovmentSpeed;
	protected UnitType unitType;
	protected ArmorType armorType;
	protected LinkedList <Ability> abilities;
	protected double coldwonReduction;
	protected double damgeModifire;
	private double size;


	public UnitStats(UnitStats unitStats,HpObjeckt hpObjeckt){
		this(unitStats.movmentSpeed,unitStats.unitType,unitStats.armorType,unitStats.abilities,unitStats.coldwonReduction,unitStats.size,hpObjeckt);
	}

	@SuppressWarnings("unchecked")
	public UnitStats(double movmentSpeed, UnitType unitType ,ArmorType armorType,
			LinkedList <Ability> abilities, double coldwonReduction,double size,HpObjeckt hpObjeckt){
		super(hpObjeckt);
		this.movmentSpeed = movmentSpeed;
		this.unitType = unitType;
		this.armorType = armorType;
		this.abilities = (LinkedList<Ability>) abilities.clone();
		this.coldwonReduction = coldwonReduction;
		this.size = size;

	}

	public LinkedList <Ability> getAbilities(){
		return abilities;
	}

	@Override
	public void changeAttackSpeed(double modifire) {
		coldwonReduction = modifire;
	}

	public double getSize(){
		return size;
	}

	@Override
	public void changeDamgePercent(double modifire) {
		damgeModifire = modifire;
	}

	@Override
	public void changeMovmentSpeed(double modifire) {
		curnetMovmentSpeed = movmentSpeed * modifire;
	}

	@Override
	public boolean canBeHealed(){
		return hpObjeckt.canBeHealed();
	}

	@Override
	public boolean changeHp(double modifire) {
		return hpObjeckt.changeHp(modifire);
	}

	@Override
	public ArmorType getArmorType() {
		return armorType;
	}
}
