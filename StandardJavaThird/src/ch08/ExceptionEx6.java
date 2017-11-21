package ch08;

/**
 * @author sharpen
 * ExceptionEx5 코드에서 예외처리클래스 부분만 최상위 클래스(Exception)로 바꿔본 코드. 실행 결과는 같다.
 * 이경우는 모든 예외를 Exception클래스가 다 잡아내서 이곳에서 처리된다.
 */
class ExceptionEx6 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);	// 0으로 나눠서 고의로 ArithmeticException을 발생시킨다.
			System.out.println(4);		// 실행되지 않는다.
		} catch (Exception e) {
			System.out.println(5);
		}
		System.out.println(6);
	}

}
