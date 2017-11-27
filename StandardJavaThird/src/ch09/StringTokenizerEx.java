package ch09;

import java.util.StringTokenizer;

/**
 * @author zxcv5500
 * ,를 구분자로 StringTokenizer를 생성해서 문자열(source)를 나누어 출력하는 예제
 */
class StringTokenizerEx {

	public static void main(String[] args) {
		String source = "100,200,300,400";
		StringTokenizer st = new StringTokenizer(source, ",");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
