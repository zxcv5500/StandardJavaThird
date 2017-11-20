package ch07;

interface Movable {
	void move(int x, int y);
}

interface Attackable {
	void attack(Unit u);
}

interface Fightable extends Movable, Attackable {
	
}

class Unit {
	int currentHP;							// 유닛의 체력
	int x;									// 유닛의 위치(x 좌표)
	int y;									// 유닛의 위치(y 좌표)
	
}

class Fighter extends Unit implements Fightable {
	public void move(int x, int y) {
		/* 내용 생략 */
	}
	
	public void attack(Unit u) { /* 내용 생략 */ }
}


/**
 * @author sharpen
 * interface의 메소드는 public abstract가 생략된 것이므로 구현하는 쪽에선 접근제어자를 조상보다 큰 범위로 줘야만하기 때문에 구현체에서 public메소드로 구현된다.
 */
class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if (f instanceof Unit) {
			System.out.println("f는 Unit클래스의 자손입니다.");
		}
		if (f instanceof Fightable) {
			System.out.println("f는 Fightable 인터페이스를 구현했니다.");
		}
		if (f instanceof Movable) {
			System.out.println("f는 movable 인터페이스를 구현했습니다.");
		}
		if (f instanceof Attackable) {
			System.out.println("f는 Attackable 인터페이스를 구현했습니다.");
		}
		
	}

}
