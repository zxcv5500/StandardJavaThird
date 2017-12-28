package ch15;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author zxcv5500
 * 파일에 점수 배열을 읽어서 출력한 예제 소스
 */
class DataOutputStreamEx03 {

	public static void main(String[] args) {
		int[] score = { 100, 90, 95, 85, 50 };
		
		try {
			FileOutputStream fos = new FileOutputStream("score.dat");
			DataOutputStream dos = new DataOutputStream(fos);
			
			for (int i = 0; i < score.length; i++) {
				dos.writeInt(score[i]);
			}
			dos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
