package ch09;

import java.util.Scanner;

/**
 * @author zxcv5500
 * 화면으로 부터 라인단위로 입력받아서 입력받은 내용을 공백을 구분자로 나눠서 출력하는 예제.
 */
class ScannerEx1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] argArr = null;
		
		while(true) {
			String prompt = ">>";
			System.out.print(prompt);
			
			// 화면으로부터 라인단위로 입력받는다.
			String input = scanner.nextLine();
			
			input = input.trim();						// 입력 받은 값에서 불필요한 앞뒤 공백을 제거한다.
			argArr = input.split(" +");					// 입력받은 내용을 공백을 구분자로 자른다.
			
			String command = argArr[0].trim();
			
			if ("".equals(command)) continue;
			
			// 명령어를 소문자로 바꾼다.
			command = command.toLowerCase();
			
			// q 또는 Q를 입력하면 실행종료한다.
			if (command.equals("q")) {
				System.exit(0);
			} else {
				for (int i = 0; i < argArr.length; i++) {
					System.out.println(argArr[i]);
				}
			}
					
		}		// while(true)
	}		// main

}
