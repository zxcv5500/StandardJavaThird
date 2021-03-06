package ch09;

class Point implements Cloneable {		// Cloneable 인터페이스를 구현한다.
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x=" + x + ", y=" + y;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 * clone()메소드 오버라이딩
	 * 1.5부터 추가된 공변 반환타입 적용 코드
	 * 조상 메소드의 반환타입을  자식 클래스타입으로 반환하도록 허용한다. 
	 */
	public Point clone() {
		Object obj = null;
		try {
			obj = super.clone();		// clone()은 반드시 예외처리를 해주어야 한다.
		} catch (CloneNotSupportedException e) {
			
		}
		
		return (Point) obj;
	}
}

class CloneEx1 {

	public static void main(String[] args) {
		Point original = new Point(3, 5);
		Point copy = (Point) original.clone();			// 복제(clone)해서 새로운 객체를 생성
		System.out.println(original);
		System.out.println(copy);
	}

}
