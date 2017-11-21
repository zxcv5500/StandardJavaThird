package ch08;

/**
 * @author sharpen
 * Exception하위 클래스로 catch문에 조건문을 걸어두면 순서대로 나열된 catch문의 예외 클래스 조건에 맞게 예외처리를 할 수 있다.
 */
public class ExceptionEx7 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);	// 0으로 나눠서 고의로 ArithmeticException을 발생시킨다.
			System.out.println(4);		// 실행되지 않는다.
		} catch (ArithmeticException ae) {
			if (ae instanceof ArithmeticException) {
				System.out.println("true");
			}
			System.out.println("ArithmeticException");
		} catch (Exception e) {
			System.out.println("Exception");
		}
		System.out.println(6);
	}

	
}
