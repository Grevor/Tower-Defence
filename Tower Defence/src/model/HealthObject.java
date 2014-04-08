package model;

import model.collision.Collider;

public class HealthObject extends Entity{
	protected HpObjeckt hpObjeckt;
	

	public HealthObject(HpObjeckt hpObjeckt){
		this.hpObjeckt = new  HpObjeckt(hpObjeckt); 
	}
	
	@Override
	public Collider getCollider() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public boolean exist() {
		// TODO Auto-generated method stub
		return true;
	}

	
}
