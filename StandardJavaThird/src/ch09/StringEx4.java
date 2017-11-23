package ch09;

import java.util.StringJoiner;

/**
 * @author sharpen
 * String.join()메서드와 StringJoiner클래스의 사용
 */
class StringEx4 {

	public static void main(String[] args) {
		String animals = "dog,cat,bear";
		String[] arr = animals.split(",");
		
		System.out.println(String.join("-", arr));
		
		StringJoiner sj = new StringJoiner("/", "[", "]");
		for (String s : arr) {
			sj.add(s);
		}
		
		System.out.println(sj.toString());
	}

}
