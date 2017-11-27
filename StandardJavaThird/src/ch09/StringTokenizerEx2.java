package ch09;

import java.util.StringTokenizer;

/**
 * @author zxcv5500
 * 구분자도 토큰으로 간주되도록 하였다.
 */
class StringTokenizerEx2 {

	public static void main(String[] args) {
		String expression = "x=100*(200+300)/2";
		StringTokenizer st = new StringTokenizer(expression, "+-*/=()", true);
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
