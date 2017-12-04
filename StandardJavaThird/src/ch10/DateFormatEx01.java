package ch10;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author sharpen
 * 자주 사용될 만한 패턴을 만들어서 다양한 형식으로 예제가 실행된 날짜와 시간을 출력
 */
class DateFormatEx01 {

	public static void main(String[] args) {
		Date today = new Date();
		
		SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
		SimpleDateFormat sdf5, sdf6, sdf7, sdf8, sdf9;
		
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");						// 2017-12-04
		sdf2 = new SimpleDateFormat("''yy년 MMM dd일 E요일");			// '17년 12월 04일 월요일
		sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");			// 2017-12-04 12:44:27.054
		sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");			// 2017-12-04 12:44:27 오후
		
		sdf5 = new SimpleDateFormat("오늘은 올 해의 D번째 날 입니다.");
		sdf6 = new SimpleDateFormat("오늘은 이 달의 d번째 날 입니다.");
		sdf7 = new SimpleDateFormat("오늘은 올 해의 w번째 주 입니다");
		sdf8 = new SimpleDateFormat("오늘은 이 달의 W번째 주 입니다.");
		sdf9 = new SimpleDateFormat("오늘은 이 달의 F번째 E요일입니다.");
		
		
		System.out.println(sdf1.format(today));
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
		System.out.println();
		
		System.out.println(sdf5.format(today));
		System.out.println(sdf6.format(today));
		System.out.println(sdf7.format(today));
		System.out.println(sdf8.format(today));
		System.out.println(sdf9.format(today));
		
		
		
		
		
		
		
	}

}
