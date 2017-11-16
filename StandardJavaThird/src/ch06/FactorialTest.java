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
		
		if ( n == 1) {
			result =1;
		} else {
			result = n * factorial(n-1);		//다시 메서드 자신을 호출한다.
		}
		
		return result;
	}

}
