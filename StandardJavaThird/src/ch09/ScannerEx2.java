package ch09;

import java.io.File;
import java.util.Scanner;

/**
 * @author zxcv5500
 * data2.txt파일로 부터 데이터를 읽어 합과 평균을 구하는 예제. 경로가 다르면 경로를 지정해 줘야 한다.
 */
class ScannerEx2 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("D:\\GithubEclipseRepo\\StandardJavaThird\\StandardJavaThird\\src\\ch09\\data2.txt"));
		int sum = 0;
		int cnt = 0;
		
		while (sc.hasNextInt()) {
			sum += sc.nextInt();
			cnt++;
		}
		
		System.out.println("sum=" + sum);
		System.out.println("average=" + (double) sum/cnt);
	}

}
