package poly.noinheri;

public class Pig{
	
	private int hp;
	private int atk;
	private int dep;
	
	//피 30, 공격 1, 방어 10
	public Pig() {
		this.hp = 30;
		this.atk = 1;
		this.dep = 10;		

	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDep() {
		return dep;
	}

	public void setDep(int dep) {
		this.dep = dep;
	}
	