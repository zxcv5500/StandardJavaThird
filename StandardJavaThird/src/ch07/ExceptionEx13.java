package ch07;

/**
 * @author zxcv5500
 * 호출한 메소드method1() 에서 예외를 처리하였다.
 */
class ExceptionEx13 {

	public static void main(String[] args) {
		method1();
	}

	static void method1() {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method1메서드에서 예외가 처리되었습니다.");
			e.printStackTrace();
		}
	}
}
