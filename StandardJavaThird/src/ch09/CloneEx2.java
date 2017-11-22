package ch09;

import java.util.Arrays;

/**
 * @author sharpen
 * clone()을 이용해서 배열을 복사하는 예제이다.
 */
class CloneEx2 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		// 배열 arr을 복제해서 같은 내용의 새로운 배열을 만든다.
		int[] arrClone = arr.clone();
		arrClone[0] = 6;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
	}

}
