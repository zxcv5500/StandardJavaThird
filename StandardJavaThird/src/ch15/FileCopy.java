package ch15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author sharpen
 * FileInputStream과 FileOutputStream을 이용해서 FileCopy.java파일의 내용을 FileCopy.bak로 복사하는 일을 한다.
 * cmd 창 명령 예시
 * java FileCopy FileCopy.java FileCopy.bak
 */
class FileCopy {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(args[0]);
			FileOutputStream fos = new FileOutputStream(args[1]);
			
			int data = 0;
			
			while ((data = fis.read()) != -1) {
				fos.write(data);						// void write(int b)
			}
			
			fis.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
