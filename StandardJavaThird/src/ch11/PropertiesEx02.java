package ch11;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author zxcv5500
 * 외부파일(input.txt)로 부터 데이터를 입력받아서 계산결과를 보여주는 에제이다.
 */
class PropertiesEx02 {

	public static void main(String[] args) {
		// commandline에서 inputfile을 지정해 주지 않으면 프로그램을 종료한다.
		if (args.length != 1) {
			System.out.println("USAGE: java propertiesEx02 INPUTFILENAME");
			System.exit(0);
		}
		
		Properties prop = new Properties();
		
		String inputFile = args[0];
		
		try {
			prop.load(new FileInputStream(inputFile));
		} catch (IOException e) {
			System.out.println("지정된 파일을 찾을 수 없습니다.");
			System.exit(0);
		}
		
		String name = prop.getProperty("name");
		String[] data = prop.getProperty("data").split(",");
		int max = 0;
		int min = 0;
		int sum = 0;
		
		for (int i = 0; i < data.length; i++) {
			int intValue = Integer.parseInt(data[i]);
			if (i==0) max = min = intValue;
			
			if (max < intValue) 
				max = intValue;
			else if (min > intValue)
				min = intValue;
			
			sum += intValue;
		}
		
		
		System.out.println("이름 : " + name);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (sum * 100.0 / data.length)/100);
	}
	
}
