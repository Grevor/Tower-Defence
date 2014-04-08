package unit;

import java.util.LinkedList;

import model.Entity;
import model.HealthObject;
import model.HpObjeckt;
import model.Effeckts.Effeckt;
import model.Effeckts.EffecktUppdater;
import model.Effeckts.Effectebul;
import model.abilities.Ability;
import model.collision.Collider;
import model.types.ArmorType;

public abstract class Unit extends Entity {



	protected LinkedList <Effeckt> effects;
	protected UnitStats unitStats;


	public Unit(UnitStats unitStats,HpObjeckt hpObjeckt){
		this.unitStats = new UnitStats(unitStats,hpObjeckt);
	}


	public void update(long time,EffecktUppdater effecktUppdater){
		effecktUppdater.uppdate(unitStats,time,effects);
	}
	
	
	@Override
	public boolean exist() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Collider getCollider() {
		// TODO Auto-generated method stub
		return null;
	}	

}
