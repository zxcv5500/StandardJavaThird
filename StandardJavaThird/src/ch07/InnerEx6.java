package ch07;

/**
 * @author sharpen
 * 단순히 익명 클래스의 사용 예를 보여준다.
 */
public class InnerEx6 {
	Object iv = new Object() { void method() {} };				//new Object() { void method() {} } 부분처럼 대입하는 곳에서 클래스를 바로 작성하는 부분이 익명클래스 부분인 듯.
	static Object cv = new Object() { void method() {} };
	
	void myMethod() {
		Object lv = new Object() { void method() {} };
	}
}
