package ch09;

import java.util.StringTokenizer;

/**
 * @author zxcv5500
 * 문자열(source)에 포함된 데이터가 두가지 종류의 구분자로 나뉘어져 있을 때 
 * 두개의 StringTokenizer와 이중반복문을 사용해서 처리하는 방법을 보여주는 예제
 */
class StringTokenizerEx3 {

	public static void main(String[] args) {
		String source = "1,김천재,100,100,100|2,박수재,95,80,90|3,이자바,80,90,90";
		StringTokenizer st = new StringTokenizer(source, "|");
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			
			StringTokenizer st2 = new StringTokenizer(token, ",");
			while(st2.hasMoreTokens()) {
				System.out.println(st2.nextToken());
			}
			System.out.println("-------------");
		}
	}

}
