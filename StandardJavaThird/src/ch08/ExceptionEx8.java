package ch08;

/**
 * @author sharpen
 * ae.printStackTrace(), ae.getMessage()를 통해 예외 정보를 확인한다.
 */
class ExceptionEx8 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);	// 0으로 나눠서 고의로 ArithmeticException을 발생시킨다.
			System.out.println(4);		// 실행되지 않는다.
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("예외메시지 : " + ae.getMessage());
		}
		System.out.println(6);
	}

}
