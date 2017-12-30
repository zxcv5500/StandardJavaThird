package ch15;

import java.io.IOException;

/**
 * @author sharpen
 * 표준 입출력을 사용한 콘솔에서 입력을 받는 예제.
 * hello를 치고 ^z나 ^d를 입력해보면 실행 결과를 알수 있다. 터미널에서 해당 파일 경로 가서 확인
 */
class StandardIOEx01 {

	public static void main(String[] args) {
		try {
			int input = 0;
			
			while ((input=System.in.read()) != -1) {
				System.out.println("input : " + input + ", (char) input : " + (char) input);
			}
		} catch (IOException e) {	e.printStackTrace();	}
	}

}
