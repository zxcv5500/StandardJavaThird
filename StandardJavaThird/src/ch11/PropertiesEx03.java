package ch11;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author sharpen
 * 이전 예제와는 반대로Properties값을 파일에 저장하는 법을 보여주는 예제.
 */
public class PropertiesEx03 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		
		prop.setProperty("timeout", "30");
		prop.setProperty("language", "한글");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
		
		
		try {
			prop.store(new FileOutputStream("output.txt"), "Properties Example");
			
			prop.storeToXML(new FileOutputStream("output.xml"), "Properties Example");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
