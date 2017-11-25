package ch09;

import static java.lang.Math.*;
import static java.lang.System.*;

/**
 * @author sharpen
 * jdk1.8부터 새로 추가된 'Exact'가 포함된 Math메서드
 * 정수형간의 연산에서 발생할 수 있는 오버플로우(overflow)를 감지하기 위한 것.
 */
class MathEx2 {

	public static void main(String[] args) {
		int i = Integer.MIN_VALUE;
		
		out.println("i = " + i);
		out.print("-i=" + (-i));
		
		try {
			out.printf("negateExact(%d)= %d%n", 10, negateExact(10));
			out.printf("negateExact(%d)= %d%n", -10, negateExact(-10));
			
			out.printf("negateExact(%d)= %d%n", i, negateExact(i));				// 예외발생
		} catch (ArithmeticException e) {
			// i를 long타입으로 형변환 다음에 negateExact(long a)를 호출
			out.println("오버플로우 발생 예외처리함");
			out.printf("negateExact(%d)= %d%n", (long) i, negateExact((long) i));
		}
		
	}

}
