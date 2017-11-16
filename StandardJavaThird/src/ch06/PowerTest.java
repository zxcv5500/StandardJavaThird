package ch06;

/**
 * @author zxcv5500
 * x의 제곱을 구하는 코드를 재귀함수 사용하는 형태로 표현했다.
 */
public class PowerTest {

	public static void main(String[] args) {
		int x = 2;
		int n = 5;
		long result = 0;
		
		for (int i = 1; i <= n ; i++) {
			result += power(x, i);
		}
		
		System.out.println(result);
	}
	
	static long power(int x, int n) {
		if (n==1) return x;
		return x * power(x, n-1);
	}

}
