package model;

public class HpObjeckt {

	protected double hp;
	protected double maxHp;
	protected double lifeReg;
	protected boolean canBeHealed;


	public HpObjeckt(HpObjeckt hpObjeckt){
		this(hpObjeckt.hp, hpObjeckt.maxHp,hpObjeckt.lifeReg,hpObjeckt.canBeHealed);
	}
	
	public HpObjeckt(double maxHp,double lifeReg,boolean canBeHealed){
		this(maxHp,maxHp,lifeReg,canBeHealed);

	}	

	public HpObjeckt(double hp, double maxHp,double lifeReg,boolean canBeHealed){
		this.maxHp = maxHp;
		this.hp = hp;
		this.lifeReg = lifeReg;
		this.canBeHealed = canBeHealed;

	}

	public boolean changeHp(double modifire) {
		if (canBeHealed || modifire < 0){
			hp += modifire;
			if (isDead()){
				return true;
			}
			else if (hp > maxHp){
				hp = maxHp;
			}
		}
		return false;

	}


	protected void update(long time){
		changeHp((time * lifeReg)/1000);
	}


	public boolean isDead(){
		return hp > 0;
	}

	public boolean canBeHealed(){
		return canBeHealed;
	}

}
