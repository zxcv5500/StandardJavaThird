package ch09;

import java.util.StringJoiner;

/**
 * @author sharpen
 * 문자열 인코딩 예제를 보여준다.
 */
class StringEx5 {

	public static void main(String[] args) throws Exception {
		String str = "가나다";				// "가" , "가나"로 바꿔서 대입해보면 이해에 도움이 된다.
		byte[] bArr = str.getBytes("UTF-8");
		byte[] bArr2 = str.getBytes("CP949");
		
		System.out.println("UTF-8 : " + joinByteArr(bArr));
		System.out.println("CP949 : " + joinByteArr(bArr2));
		
		System.out.println("UTF-8 : " + new String(bArr, "UTF-8"));
		System.out.println("CP949 : " + new String(bArr2, "CP949"));
		
	}
	
	
	static String joinByteArr(byte[] bArr) {
		StringJoiner sj = new StringJoiner(":", "[", "]");
		
		for (byte b : bArr)
			sj.add(String.format("%02x", b));
		return sj.toString();
	}

}
