package ch10;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * @author sharpen
 * java.time패키지를 사용해서 날짜 및 시간을 표현하는 예제
 */
class NewTimeEx01 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalTime now = LocalTime.now();
		
		LocalDate birthDate = LocalDate.of(1999, 12, 31);				// 1999년 12월 31일
		LocalTime birthTime = LocalTime.of(23, 59, 59);					// 23시 59분 59초
		
		System.out.println("today=" + today);
		System.out.println("now="+ now);
		System.out.println("birthDate=" + birthDate);					// 1999-12-31
		System.out.println("birthTime=" + birthTime);					// 23:59:59
		
		System.out.println(birthDate.withYear(2000));					// 2000-12-31
		System.out.println(birthDate.plusDays(1));						// 2000-01-01
		System.out.println(birthDate.plus(1, ChronoUnit.DAYS));			// 2000-01-01
		
		// 23:59:59 -> 23:00
		System.out.println(birthTime.truncatedTo(ChronoUnit.HOURS));
		
		// 특정 ChronoFiled의 범위를 알아내는 방법
		System.out.println(ChronoField.CLOCK_HOUR_OF_DAY.range());
		System.out.println(ChronoField.HOUR_OF_DAY.range());
		
		
	}

}
