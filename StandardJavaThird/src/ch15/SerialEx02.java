package ch15;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * @author zxcv5500
 * 이전예제에서 생성한 UserInfo.ser파일에서 역직렬화 하는 예제이다.
 */
class SerialEx02 {

	public static void main(String[] args) {
		try {
			String fileName = "UserInfo.ser";
			FileInputStream fis = new FileInputStream(fileName);
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			ObjectInputStream in = new ObjectInputStream(bis);
			
			// 객체를 읽을 때는 출력한 순서와 일치해야 한다.
			UserInfo u1 = (UserInfo) in.readObject();
			UserInfo u2 = (UserInfo) in.readObject();
			ArrayList list = (ArrayList) in.readObject();
			
			System.out.println(u1);
			System.out.println(u2);
			System.out.println(list);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
