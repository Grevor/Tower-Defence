package model;

public class HealthObject extends Entity{
	protected HpObjeckt hpObjeckt;
	

	public HealthObject(HpObjeckt hpObjeckt){
		this.hpObjeckt = new  HpObjeckt(hpObjeckt); 
	}

	@Override
	public boolean exist() {
		// TODO Auto-generated method stub
		return true;
	}

	
}
