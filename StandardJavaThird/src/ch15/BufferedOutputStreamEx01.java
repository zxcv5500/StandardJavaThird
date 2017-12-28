package ch15;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author sharpen
 * 123.txt파일에 1~9까지 출력하는 코드. 보조스트림을 close하지 않으면 버퍼에 담긴 데이터는 출력되지 않는다.
 */
class BufferedOutputStreamEx01 {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("123.txt");
			// BufferedOutputStream의 버퍼크기를 5로 한다.
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
			// 파일 123.txt에 1부터 9까지 출력한다.
			for (int i='1'; i <= '9'; i++) {
				bos.write(i);
			}
			//bos.close();					// 버퍼에 담긴 모든 데이터를 출력하고 닫으려면 아래 한줄 코드를 주석으로 막고 이 부분을 주석을 풀어준다.
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
