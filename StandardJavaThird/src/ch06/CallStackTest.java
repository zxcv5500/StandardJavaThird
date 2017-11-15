package ch06;

/**
 * 프로그램이 수행되는 동안 호출스택의 변화를 그림과 함께 살펴본다.
 * @author zxcv5500
 *
 */
public class CallStackTest {

	public static void main(String[] args) {
		firstMethod();
	}
	
	
	static void firstMethod() {
		secondMethod();
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()");
	}

}
