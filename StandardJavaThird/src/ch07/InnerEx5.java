package ch07;

class Outer05 {
	int value = 10;			// Outer.this.value
	
	class Inner {
		int value = 20;		// this.value
		
		void method1() {
			int value = 30;
			System.out.println("	value : " + value);
			System.out.println("	this.value : " + this.value);
			System.out.println("Outer.this.value : " + Outer05.this.value);
		}
	}		// Inner클래스의 끝
}		// Outer클래스의 끝



/**
 * @author sharpen
 * 내부 클래스와 외부 클래스에 선언된 변수의 이름이 같을 때 변수 앞에 this 또는 외부클래스명.this.을 붙여서 서로 구분할 수 있다는 것을 보여준다
 */
public class InnerEx5 {

	public static void main(String[] args) {
		Outer05 outer = new Outer05();
		Outer05.Inner inner = outer.new Inner();
		inner.method1();
	}

}
