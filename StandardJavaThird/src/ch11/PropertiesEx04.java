package ch11;

import java.util.Properties;

/**
 * @author sharpen
 * 시스템 속성을 가져오는 방법을 보여주는 예제
 */
public class PropertiesEx04 {

	public static void main(String[] args) {
		Properties sysProp = System.getProperties();
		
		System.out.println("java.version : " + sysProp.getProperty("java.version"));
		System.out.println("user.language : " + sysProp.getProperty("user.language"));
		
		sysProp.list(System.out);
				
	}

}
