package ch09;

/**
 * @author zxcv5500
 * 스트링 클래스의 new 생성자를 이용했을 때String str3 = new String("\"abc\"");와
 * 문자 리터럴을 사용하는 String str1 = "abc"; 경우의 차이를 나타내 준다.
 */
class StringEx1 {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		
		System.out.println("String str1 = \"abc\"");
		System.out.println("String str2 = \"abc\"");
		
		System.out.println("str1 == str2 ? " + (str1 == str2));
		System.out.println("str1.equals(str2) ?" + str1.equals(str2));
		System.out.println();
		
		String str3 = new String("\"abc\"");
		String str4 = new String("\"abc\"");
		
		System.out.println("String str3 = new String(\"abc\");");
		System.out.println("String str4 = new String(\"abc\");");
		
		
		System.out.println("str3 == str4 ? " + (str3 == str4));
		System.out.println("str3.equals(str4) ? " + str3.equals(str4));
		
	}

}
