package ch09;

import java.io.File;
import java.util.Scanner;

/**
 * @author zxcv5500
 * ,를 구분자로 파일의 데이터를 읽어서 처리하는 Scanner코드
 */
class ScannerEx3 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("data3.txt"));
		int cnt = 0;
		int totalSum = 0;
		
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			Scanner sc2 = new Scanner(line).useDelimiter(",");
			int sum = 0;
			
			while (sc2.hasNextInt()) {
				sum += sc2.nextInt();
			}
			
			System.out.println(line + ", sum = " + sum);
			totalSum += sum;
			cnt++;
		}
		System.out.println("Line: " + cnt + ", Total: " + totalSum);
	}

}
