package ch14;

/**
 * @author sharpen
 *
 */
@FunctionalInterface
interface MyFunction03 {
	void myFunction();
}


class Outer {
	int val = 10;				// Outer.this.val
	
	class Inner {
		int val = 20;					// this.val
		
		void method(int i) {			// void method(final int i) {
			int val = 30;			// final int val = 30;
			// i = 10;					// 에러1. 상수 값을 변경할 수 없음 
			
			System.out.println(i);
			
			MyFunction03 f = () -> {
				System.out.println("				i   : " + i);
				System.out.println("			val   : " + val);
				System.out.println("		this.val   : " + (++this.val));
				System.out.println("		Outer.this.val : " + (++Outer.this.val));
			};
			
			
			f.myFunction();
			
			/*
			 	MyFunction03 f = (i) -> {		// 에러2. 외부 지역변수와 이름이 중복됨. 이름 같은 건 허용안됨.
				System.out.println("				i   : " + i);
				System.out.println("			val   : " + val);
				System.out.println("		this.val   : " + (++this.val));
				System.out.println("		Outer.this.val : " + (++Outer.this.val));
			};
			*/
			
			
			
		}
	}		//Inner클래스의 끝
}		// Outer클래스의 끝

public class LambdaEx03 {

	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.method(100);
	}

}
