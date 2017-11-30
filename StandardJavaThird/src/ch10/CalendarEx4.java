package ch10;

import java.util.Calendar;

/**
 * @author sharpen
 * add와 roll을 통해 지정한 필드의 값을 증감 시킬 수 있다.
 * roll은 다른 필드에 영향을 미치지 않는다.
 * 단. 일 필드가 말일 일때 roll메서드로 월 필드를 변경하면 일 필드(Calendar.DATE)에 영향을 미칠 수 있다.)
 */
class CalendarEx4 {

	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		
		date.set(2017, 7, 31);			// 2017년 8월 31일
		
		System.out.println(toString(date));
		System.out.println("= 1일 후 =");
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));
		
		System.out.println("= 6달 전 =");
		date.add(Calendar.MONTH, -6);
		System.out.println(toString(date));
		
		System.out.println("= 31일 후(roll) =");
		date.roll(Calendar.DATE, 31);
		System.out.println(toString(date));
		
		System.out.println("= 31일 후(add) =");
		date.add(Calendar.DATE, 31);
		System.out.println(toString(date));
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) +1) + "월 " + date.get(Calendar.DATE) + "일";
	}

}
