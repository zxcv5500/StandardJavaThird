package ch16;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

/**
 * @author sharpen
 * 이전 예제와 유사한데 텍스트 데이터가 아닌 이진 데이터를 읽어서 파일에 저장한다는 것만 다르다.
 */
class NetworkEx05 {

	public static void main(String[] args) {
		URL url = null;
		InputStream in = null;
		FileOutputStream out = null;
		String address = "http://www.codechobo.com/book/src/javajungsuk3_src.zip";
		
		int ch = 0;
		
		try {
			url = new URL(address);
			in = url.openStream();
			out = new FileOutputStream("javajungsuk3_src.zip");
			
			while ((ch=in.read()) != -1) {
				out.write(ch);
			}
			in.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
