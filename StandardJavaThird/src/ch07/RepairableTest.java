package ch07;

/**
 * @author sharpen
 * interface 다형성의 유용한 예제 중 하나. repairable 인터페이스를 구현한 클래스만SCV가 수리할 수 있다는 것을 보여주는 예시.
 */
interface Repairable {}

class Unit02 {
	int hitPoint;
	final int MAX_HP;
	
	Unit02(int hp) {
		MAX_HP = hp;
	}
	
	// ...
}

class GroundUnit extends Unit02 {
	GroundUnit(int hp) {
		super(hp);
	}
}

class AirUnit extends Unit02 {
	AirUnit(int hp) {
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable {
	Tank() {
		super(150);						// Tank의 HP는 150이다.
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Tank";
	}
}

class Dropship extends AirUnit implements Repairable {
	public Dropship() {
		super(125);						// Dropship의 HP는 125이다.
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Dropship";
	}
	
	//...
}

class Marine extends GroundUnit {
	Marine() {
		super(40);
		hitPoint = MAX_HP;
	}
	
	//...
}

class SCV extends GroundUnit implements Repairable {
	SCV() {
		super(60);
		hitPoint = MAX_HP;
	}
	
	
	void repair(Repairable r) {
		if (r instanceof Unit02) {
			Unit02 u = (Unit02) r;
			while (u.hitPoint != u.MAX_HP) {
				/* Unit02의 HP를 증가시킨다. */
				u.hitPoint++;
			}
			
			System.out.println(u.toString() + "의 수리가 끝났습니다.");
		}
	}
}


class RepairableTest {

	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		
		Marine marine = new Marine();
		SCV scv = new SCV();
		
		scv.repair(tank);									// SCV가 수리하도록 합니다.
		scv.repair(dropship);
//		scv.repair(marine);									// 에러! repair(Repairable) in SCV cannot be applied to (Marine)
	}

}
