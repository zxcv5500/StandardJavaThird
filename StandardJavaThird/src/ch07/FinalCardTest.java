package ch07;

class Card07 {
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int height = 250;
	
	Card07(String kind, int num) {
		KIND = kind;			// 매개변수로 넘겨받은 값으로 
		NUMBER = num;			// KIND와 NUMBER를 초기화한다.
	}
	
	Card07() {
		this("HEART", 1);
	}
	
	public String toString() {
		return KIND + " " + NUMBER;
	}
	
}

/**
 * @author zxcv5500
 * 
  final class FinalTest {				// 조상이 될 수 없는 클래스
  	final int MAX_SIZE = 10;			// 값을 변경할 수 없는 멤버변수( 상수 )
  	
  	final void getMaxSize() {			// 오버라이딩할 수 없는 메서드( 변경불가 )			
  		final int LV = MAX_SIZE;		// 값을 변경할 수 없는 지역변수(상수 )
  		return MAX_SIZE;
  	}
   }
  
 */
public class FinalCardTest {

	public static void main(String[] args) {
		Card07 c = new Card07("HEART", 10);
		// c.NUMBER = 5;							// 에러!!! cannot assign a value to final variable NUMBER
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);

	}

}
