package ch06;

class MyMath2 {
	long a, b;
	
	// 인스턴스변수 a, b만을 이용해서 작업하므로 매개변수가 필요없다.
	long add() { return a + b; }									// a, b는 인스턴스 변수
	long subtract() { return a - b; }
	long multiply() { return a * b; }
	double divide() { return a / b; }
	
	// 인스턴스변수와 관계없이 매개변수만으로 작업이 가능하다. 
	// 매개 변수는 인스턴스변수 a, b랑은 다른 지역변수다. 혼동하지 말자.
	static long add(long a, long b) { return a + b; }				// a, b는 지역변수(매개변수도 지역변수로 취급된다)
	static long subtract(long a, long b) { return a - b; }
	static long multiply(long a, long b) { return a * b; }
	static double divide(double a, double b) { return a / b; }
	
	
}


/**
 * @author zxcv5500
 * 클래스 변수나 클래스 메서드는 설계도면에 기입한 순간 부터 존재한다.
 * 인스턴스 변수와 인스턴스 메서드는 제품을 만들지 않으면 없는 상태다.
 * 
 * 클래스 변수나 클래스 메서드에서 제품을 변경하고 싶으면 
 * 제품이 만들어진 상태여야 그 제품을 조작할 수 있다.
 */
public class MyMathTest2 {

	public static void main(String[] args) {
		// 클래스 메서드 호출. 인스턴스 생성 없이 호출 가능
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.subtract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200.0, 100.0));
		
		MyMath2 mm = new MyMath2();					//인스턴스를 생성
		mm.a = 200L;
		mm.b = 100L;
		
		//인스턴스메서드는 객체생성 후에만 호출이 가능함.
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
		
	}

}
