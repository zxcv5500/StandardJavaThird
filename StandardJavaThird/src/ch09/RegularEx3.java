package ch09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zxcv5500
 * 정규식의 일부를 묶어 그룹화할 수 있음을 보여주는 코드
 */
class RegularEx3 {

	public static void main(String[] args) {
		String source = "HP:011-1111-1111, HOME:02-999-9999";
		String pattern = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(source);
		
		int i = 0;
//		System.out.println("m.find() 는 패턴이 일치하는 게 있으면 boolean형으로 결과 반환 : " + m.find());
		while(m.find()) {
			System.out.println( ++i + ": " + m.group() + " -> " + m.group(1) + ", " + m.group(2) + ", " + m.group(3));
			System.out.println("m.group()은 패턴 전체 : " + m.group());
			System.out.println("m.group(1)은 첫 ()괄호 안의 패턴 : " + m.group(1));
			System.out.println("m.group(2)는 두번째 ()괄호 안의 패턴 : " + m.group(2));
			System.out.println("m.group(3)는 세번째 ()괄호 안의 패턴 : " + m.group(3));
		}
	}

}
