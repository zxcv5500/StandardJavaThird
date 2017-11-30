package ch10;

import java.util.Calendar;

/**
 * @author zxcv5500
 * 2017년 1월 31일에서 roll()로 달을 1 증가 시켰을 땐 그 달의 마지막 날이 28이므로 영향을 받아 바뀐다.
 * add()도 마찬가지로 이 경우는 날이 변경된다.
 */
class CalendarEx5 {

	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		
		date.set(2017, 0, 31);		// 2017년 1월 31일
		System.out.println(toString(date));
		date.roll(Calendar.MONTH, 1);
		System.out.println(toString(date));		
		
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) +1) + "월 " + date.get(Calendar.DATE) + "일";
	}

}
