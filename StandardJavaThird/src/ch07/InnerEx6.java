package ch07;

/**
 * @author sharpen
 * 단순히 익명 클래스의 사용 예를 보여준다.
 */
public class InnerEx6 {
	Object iv = new Object() { void method() {} };
	static Object cv = new Object() { void method() {} };
	
	void myMethod() {
		Object lv = new Object() { void method() {} };
	}
}
