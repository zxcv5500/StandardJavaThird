package ch08;

/**
 * @author sharpen
 * main -> method1 -> method2순으로 호출을 했는데 exception을 전달만 해주기 때문에 어느곳에서라도 예외처리를 직접해줘야 한다.
 */
class ExceptionEx12 {

	public static void main(String[] args) throws Exception {
		method1();					// 같은 클래스내의 static 멤버이므로 객체생성없이 직접호출 가능.		
	}
	
	static void method1() throws Exception {
		method2();
	}
	
	static void method2() throws Exception {
		throw new Exception();
	}

}
