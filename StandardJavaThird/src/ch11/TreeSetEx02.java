package ch11;

import java.util.TreeSet;

/**
 * @author zxcv5500
 * TreeSet의 headSet()과 tailSet() 메서드를 사용하면 지정된 기준값 보다 큰값이나 작은 값의 객체들을 얻을 수 있다.
 */
class TreeSetEx02 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		int[] score = {80, 95, 50, 35, 45, 65, 10, 100 };
		
		for (int i=0; i < score.length; i++) {
			set.add(new Integer(score[i]));
		}
		
		System.out.println("50보다 작은 값 : " + set.headSet(new Integer(50)));
		System.out.println("50보다 큰 값 : " + set.tailSet(new Integer(50)));
	}

}
