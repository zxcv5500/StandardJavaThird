package ch15;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author zxcv5500
 * DataOutputStreamEx03에서 작성된 파일을 읽어서 값을 찍어보는 예제
 */
class DataInputStreamEx02 {

	public static void main(String[] args) {
		int sum = 0;
		int score = 0;
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream("score.dat");
			dis = new DataInputStream(fis);
			
			while (true) {
				score = dis.readInt();
				System.out.println(score);
				sum += score;
			}
		} catch (EOFException e) {
			System.out.println("정수의 총합은 " + sum + "입니다.");
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if(dis != null)				// dis가 null인지 확인한다.
					dis.close();			// dis를 닫는다.
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
	}

}
