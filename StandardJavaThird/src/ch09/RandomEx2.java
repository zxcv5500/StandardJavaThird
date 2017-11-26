package ch09;

import java.util.Random;

/**
 * @author zxcv5500
 * 0~9 사이의 난수를 발생시키고 각 숫자의 빈도를 센다음 #으로 가로 그래프를 그리는 예제이다.
 */
class RandomEx2 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] number = new int[100];
		int[] counter = new int[10];
		
		for (int i =0; i < number.length; i++ ) {
//			System.out.print(number[i] = (int) (Math.random() *10));
//			0 <= x <10 범위의 정수 x를 반환한다.
			System.out.print(number[i] = rand.nextInt(10));
		}
		
		System.out.println();
		
		for (int i = 0; i < number.length; i++) {
			counter[number[i]]++;
		}
		
		for (int i = 0; i < counter.length; i++) {
			System.out.println(i + "의 개수 : " + printGraph('#', counter[i]) + " " + counter[i]);
		}
	}
	
	public static String printGraph(char ch, int value) {
		char[] bar = new char[value];
		
		for (int i = 0; i < bar.length; i++) {
			bar[i] = ch;
		}
		
		return new String(bar);
	}

}
