package ch06;

/**
 * @author zxcv5500
 * 재귀호출-팩토리얼 구현을 재귀메소드로 구현한 코드.
 * 
 */
public class FactorialTest {

	public static void main(String[] args) {
		int result = factorial(4);				// int result = FactorialTest.factorial(4);
		
		System.out.println(result);
	}
	
	static int factorial(int n) {
		int result = 0;
		
		if (n <= 0 || n > 12) return -1;		// 매개변수 n의 유효성 검사를 추가 매개 변수 n의 상한을 12로 정한 이유는
												// int의 최대값(약20억)보다 크기 때문이다.
		if ( n == 1) {
			result =1;
		} else {
			result = n * factorial(n-1);		//다시 메서드 자신을 호출한다.
		}
		
		return result;
	}

}
