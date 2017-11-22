package ch09;

/**
 * @author sharpen
 * 모든 클래스의 조상인 Object 클래스 - equals() 메소드
 * 
 */
class EqualsEx1 {

	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if (v1.equals(v2)) {
			System.out.println("v1과 v2는 같습니다.");
		} else {
			System.out.println("v1과 v2는 다릅니다.");
		}
		
		v2 = v1;
		
		if (v1.equals(v2)) {
			System.out.println("v1과 v2는 같습니다.");
		} else {
			System.out.println("v1과 v2는 다릅니다.");
		}
	}

}

class Value {
	int value;
	
	Value(int value) {
		this.value = value;
	}
}
