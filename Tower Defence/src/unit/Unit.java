package unit;

import java.awt.Window.Type;
import java.util.LinkedList;

import model.Entity;
import model.HpObjeckt;
import model.Effeckts.Effeckt;
import model.Effeckts.EffecktUppdater;
import model.collision.Collider;

public abstract class Unit extends Entity {



	protected LinkedList <Effeckt> effects;
	protected UnitStats unitStats;
	protected Team team;
	protected Type type;

	public Unit(UnitStats unitStats,HpObjeckt hpObjeckt,Team team, Type type){
		this.unitStats = new UnitStats(unitStats,hpObjeckt);
		this.team = team;
		this.type = type;
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
