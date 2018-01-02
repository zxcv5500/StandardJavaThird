package ch16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * @author sharpen
 * URL에 연결하여 그 내용을 읽어오는 예제이다.
 */
class NetworkEx04 {

	public static void main(String[] args) {
		URL url = null;
		BufferedReader input = null;
		String address = "http://www.codechobo.com/sample/hello.html";
		String line = "";
		
		try {
			url = new URL(address);
			
			input = new BufferedReader(new InputStreamReader(url.openStream()));
			
			while ((line = input.readLine()) != null) {
				System.out.println(line);
			}
			input.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
