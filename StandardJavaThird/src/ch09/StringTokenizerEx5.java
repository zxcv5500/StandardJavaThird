package ch09;

import java.util.StringTokenizer;

/**
 * @author zxcv5500
 * String.spilt()과 StringTokenizer의 차이를 다룬 소스코드
 */
class StringTokenizerEx5 {

	public static void main(String[] args) {
		String data = "100,,,200,300";
		
		String[] result = data.split(",");
		StringTokenizer st = new StringTokenizer(data, ",");
		
		for (int i = 0; i < result.length; i++)
			System.out.print(result[i] + "|");
		
		System.out.println("개수:" + result.length);
		
		int i = 0;
		for (;st.hasMoreTokens();i++)
			System.out.print(st.nextToken() + "|");
		
		System.out.println("개수:" + i);
	}

}
