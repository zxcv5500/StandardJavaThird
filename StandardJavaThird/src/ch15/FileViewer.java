package ch15;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author sharpen
 * 커맨드라인으로부터 입력 받은 파일의 내용을 읽어서 그대로 화면에 출력하는 간단한 예제
 */
class FileViewer {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(args[0]);
		int data = 0;
		
		while ((data = fis.read()) != -1 ) {
			char c = (char) data;
			System.out.print(c);
		}
	}

}
