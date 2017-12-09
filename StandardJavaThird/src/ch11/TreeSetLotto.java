package ch11;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author zxcv5500
 * Set을 이용한 로또프로그램
 */
class TreeSetLotto {

	public static void main(String[] args) {
		Set set = new TreeSet();
		
		for (int i = 0; set.size() < 6; i++) {
			int num = (int) (Math.random()*45) + 1;
			set.add(num);											// set.add(new Integer(num));
		}
		
		System.out.println(set);
	}

}
