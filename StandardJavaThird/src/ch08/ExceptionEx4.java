package ch08;

/**
 * @author sharpen
 * try catch문의 실행 흐름을 보여주는 코드.
 */
public class ExceptionEx4 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);	// 0으로 나눠서 고의로 ArithmeticException을 발생시킨다.
			System.out.println(4);		// 실행되지 않는다.
		} catch (ArithmeticException e) {
			System.out.println(5);
		}
		System.out.println(6);
	}

}
