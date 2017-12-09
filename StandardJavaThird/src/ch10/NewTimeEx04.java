package ch10;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * @author sharpen
 * Period는 날짜간의 차이
 * Duration은 시간 간의 차이를 구할때 쓰인다.
 */
class NewTimeEx04 {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(2014, 1, 1);
		LocalDate date2 = LocalDate.of(2015, 12, 31);
		
		Period pe = Period.between(date1, date2);
		
		System.out.println("date1 = " + date1);
		System.out.println("date2 = " + date2);
		System.out.println("pe= " + pe);
		
		System.out.println("YEAR=" +pe.get(ChronoUnit.YEARS));
		System.out.println("MONTH= " + pe.get(ChronoUnit.MONTHS));
		System.out.println("DAY= " + pe.get(ChronoUnit.DAYS));
		
		LocalTime time1 = LocalTime.of(0, 0, 0);
		LocalTime time2 = LocalTime.of(12, 34, 56);
		
		Duration du = Duration.between(time1, time2);
		
		System.out.println("time1=" + time1);
		System.out.println("time2=" + time2);
		System.out.println("du=" + du);
		
		LocalTime tmpTime = LocalTime.of(0, 0).plusSeconds(du.getSeconds());
		
		System.out.println("HOUR=" +  tmpTime.getHour());
		System.out.println("MINUTE=" + tmpTime.getMinute());
		System.out.println("SECOND=" + tmpTime.getSecond());
		System.out.println("NANO=" + tmpTime.getNano());
	}

}
