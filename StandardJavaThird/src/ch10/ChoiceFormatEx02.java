package ch10;

import java.text.ChoiceFormat;

/**
 * @author sharpen
 * 이 전의 예제를 패턴을 사용해서 표시하도록 변형한 예제
 */
class ChoiceFormatEx02 {

	public static void main(String[] args) {
		String pattern = "60#D|70#C|80#B|90#A";
		int[] scores = {91,90,80,88,70,52,60};
		
		ChoiceFormat form = new ChoiceFormat(pattern);
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i] + ":" + form.format(scores[i]));
		}
	}

}
