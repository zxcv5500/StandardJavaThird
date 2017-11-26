package ch09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zxcv5500
 * data 배열에 담긴 문자열배열에 담긴 문자열 중에 지정한 정규식과 일치하는 문자열을 출력하는 예제이다.
 */
class RegularEx1 {

	public static void main(String[] args) {
		String[] data = {"bat", "baby", "bonus", "cA", "ca", "co", "c.", 
				"c0", "car", "combat", "count", "date", "disc" };
		
		Pattern p = Pattern.compile("c[a-z]*");				// c로 시작하는 소문자 영단어
		
		for (int i = 0; i < data.length; i++) {
			Matcher m = p.matcher(data[i]);
			if(m.matches())
				System.out.print(data[i] + ", ");
		}
		
	}
	
}
