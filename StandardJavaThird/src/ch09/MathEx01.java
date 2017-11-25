package ch09;

import static java.lang.Math.*;
import static java.lang.System.*;

/**
 * @author sharpen
 * 반올림 메소드 rint는 round랑 기능은 같은데 반환이 double이다
 * 그리고 반올림시. 소수점 첫자리를 기준으로 반올림 하기 때문에
 * 두번째나 세번째등 임의의 자리수 올림은 100 곱하고 100.0실수로 나눠주는 작업과 같이한다.
 * 세번째 자리인 경우 1000 곱하고 1000.0으로 나눠주는 작업
 */
class MathEx01 {

	public static void main(String[] args) {
		double val = 90.7552;
		out.println("round(" + val + ")=" + round(val));					// 반올림 항상 소수점 첫째 자리에서 반올림한다.
		
		val *= 100;
		out.println("round(" + val + ")=" + round(val));					// 반올림
		
		out.println("round(" + val + ") / 100 = " + round(val)/ 100);		// 반올림
		out.println();
		
		//* 양수 반올림, 올림, 버
		out.printf("ceil(%3.1f)=%3.1f%n", 1.1, ceil(1.1));					// 올림
		out.printf("floor(%3.1f)=%3.1f%n", 1.5, floor(1.5));				// 버림
		out.printf("round(%3.1f)=%d%n", 1.1, round(1.1));					// 반올림
		out.printf("round(%3.1f)=%d%n", 1.5, round(1.5));					// 반올림
		out.printf("rint(%3.1f)=%f%n", 1.5, rint(1.5));						// 반올림 - 반환값이 더블로 반환된다.
		//*/
		
		//* 음수 반올림, 올림, 버
		out.printf("round(%3.1f)=%d%n", -1.5, round(-1.5));					// 반올림
		out.printf("rint(%3.1f)=%f%n", -1.5, rint(-1.5));					// 반올림 - 반환값이 더블로 반환됨 실수의 반올림은 0.4이하일 때 반올림이 된다.
//		out.printf("rint(%3.1f)=%f%n", -1.4, rint(-1.4));
		out.printf("ceil(%3.1f)=%f%n", -1.5, ceil(-1.5));					// 올림
		out.printf("floor(%3.1f)=%f%n", -1.5, floor(-1.5));					// 버림
		//*/
		
		
	}

}
