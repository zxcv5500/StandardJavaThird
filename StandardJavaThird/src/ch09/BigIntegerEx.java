package ch09;

import java.math.BigInteger;

/**
 * @author zxcv5500
 * BigInteger를 이용해서 1! ~ 99! 까지의 팩토리얼값을 출력하는 코드.
 */
class BigIntegerEx {

	public static void main(String[] args) throws Exception {
		// BigInteger big = BigInteger.ONE;
		
		for (int i = 0; i < 50; i++) {			// 1! 부터 99!까지 출력
			System.out.printf("%d!=%s%n", i, calcFactorial(i));
			Thread.sleep(300);
		}
	}
	
	static String calcFactorial(int n) {
		return factorial(BigInteger.valueOf(n)).toString();
	}
	
	static BigInteger factorial(BigInteger n) {
		if (n.equals(BigInteger.ZERO)) {
			return BigInteger.ONE;
		} else {		//  return n * factorial(n.subtract(BigInteger.ONE)));
			return n.multiply(factorial(n.subtract(BigInteger.ONE)));
		}
	}

}
