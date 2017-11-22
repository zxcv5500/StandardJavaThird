package ch09;



/**
 * @author sharpen
 * String이나 Date 클래스는 각각의 목적에 맞는 정보를 표시하도록 toString()메소드를 오버라이딩 해두고 사용한다.
 */
class ToStringTest {

	public static void main(String[] args) {
		String str = new String("KOREA");
		java.util.Date today = new java.util.Date();
		
		System.out.println(str);
		System.out.println(str.toString());
		System.out.println(today);
		System.out.println(today.toString());
	}

}
