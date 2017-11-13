package ch05;

public class ArrayEx14 {

	public static void main(String[] args) {
		String src = "ABCDE";
		
		System.out.println("문자열 길이 체크 src.length() : " + src.length());
		for (int i=0; i < src.length(); i++) {
			char ch = src.charAt(i);		// src의 i번째 문자를 ch에 저장
			System.out.println("src.charAt(" + i + "):" + ch);
		}
		
		char[] chArr = src.toCharArray();		// String을 char[]로 변환
		
		System.out.println(chArr);		// char 배열 (char[])을 출력
	}

}
