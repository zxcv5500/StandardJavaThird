package ch08;

/**
 * @author sharpen
 * 나눗셈에서 0으로는 수를 나눌 수 없기 때문에 ArithmeticException이 발생한다.
 */
class ExceptionEx2 {

	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		
		for (int i = 0; i < 10; i++) {
			result = number / (int) (Math.random() * 10);				// 7번째 라인
			System.out.println(result);
		}
	}

}
