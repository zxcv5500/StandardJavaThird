package ch15;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author zxcv5500
 * DataOutputStreamEx01에서 만든 sample.dat 파일에서 데이터를 읽어오는 소스
 */
class DataInputStreamEx01 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("sample.dat");
			DataInputStream dis = new DataInputStream(fis);
			
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readBoolean());
			dis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
