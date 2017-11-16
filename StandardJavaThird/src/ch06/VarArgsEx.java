package ch06;

/**
 * @author zxcv5500
 * 가변인자 코딩 코드
 */
public class VarArgsEx {

	public static void main(String[] args) {
		String[] strArr = { "100", "200", "300" };
		
		System.out.println(concatenate("", "100", "200", "300"));
		System.out.println(concatenate("-", strArr));
		System.out.println(concatenate(",", new String[] {"1", "2", "3"}));
		System.out.println("[" + concatenate(",", new String[0]) + "]");
		System.out.println("[" + concatenate(",") + "]");
		
	}

	/**
	 * @param delim
	 * @param args
	 * @return
	 * 
	 * 매개변수로 입력된 문자열에 구분자를 사이에 포함시켜 결함해서 반환한다.
	 */
	static String concatenate(String delim, String... args) {
		String result = "";
		
		for (String str : args) {
			result += str + delim;			
		}
		
		return result;
	}
	/*
	static String concatenate(String... args) {
		return concatenate("", args);
	}
	*/
}
