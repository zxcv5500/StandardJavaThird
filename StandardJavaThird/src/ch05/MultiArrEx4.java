package ch05;

import java.util.Scanner;

/**
 * 영단어를 보여주고 단어의 뜻을 맞춰주는 예제
 * @author zxcv5500
 *
 */
public class MultiArrEx4 {

	public static void main(String[] args) {
		String[][] words = {
				{"chair", "의자" },				//words[0][0], words[0][1]
				{"computer", "컴퓨터" },		//words[1][0], words[1][1]
				{"integar", "정수"}
		};
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i=0; i < words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]);
			
			String tmp = scanner.nextLine();
			
			if (tmp.equals(words[i][1])) {
				System.out.printf("정답입니다. %n%n");
			} else {
				System.out.printf("틀렸습니다. 정답은 %s입니다. %n%n", words[i][1]);
			}
		}	// for 끝
	}	// main 끝

}
