package ch09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zxcv5500
 * 패턴에 일치하는 곳을 찾으면 start와 end 위치를 알 수 있고,
 * 그 부분을 다른 문자열로 바꿀 수 있다.
 */
class RegularEx4 {

	public static void main(String[] args) {
		String source = "A broken hand works, but not a broken heart.";
		String pattern = "broken";
		StringBuffer sb = new StringBuffer();
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(source);
		System.out.println("source : " + source);
		
		int i = 0;
		
		while (m.find()) {
			System.out.println( ++i + "번째 매칭 : " + m.start() + "~" + m.end());
				// broken을 drunken으로 치환하며 sb에 저장한다.
			m.appendReplacement(sb, "drunken");
		}
		
		m.appendTail(sb);
		System.out.println("Replacement count : " + i);
		System.out.println("result : " + sb.toString());
	}

}
