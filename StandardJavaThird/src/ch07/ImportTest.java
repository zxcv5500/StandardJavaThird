package ch07;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zxcv5500
 * 임포트 학습 코드
 * 현재 날짜와 시간을 지정된 형식에 맞춰 출력하는 예제이다.
 */
public class ImportTest {

	public static void main(String[] args) {
		Date today = new Date();
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy/mm/dd");
		SimpleDateFormat time = new java.text.SimpleDateFormat("hh:mm:ss a");		// 만약 import문이 없으면 시시콜콜 경로를 다 적어준다. 
																					// 임포트문이 있으니 생략 가능하다.
		
		System.out.println("오늘 날짜는 " + date.format(today));
		System.out.println("현재 시간은 " + time.format(today));
		
	}

}
