package ch09;

import java.util.Random;

/**
 * @author zxcv5500
 * 같은 종자값을 사용한 랜덤값을 사용하기 때문에 같은 난수가 발생한다.
 */
class RandomEx1 {

	public static void main(String[] args) {
		Random rand = new Random(1);
		Random rand2 = new Random(1);
		
		System.out.println("= rand =");
		for (int i = 0; i < 5; i++)
			System.out.println(i + ":" + rand.nextInt());
		
		System.out.println();
		System.out.println("= rand2 =");
		for (int i = 0; i < 5; i++)
			System.out.println(i + ":" + rand2.nextInt());
	}

}
