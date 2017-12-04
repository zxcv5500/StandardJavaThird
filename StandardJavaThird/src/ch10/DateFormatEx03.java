package ch10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author sharpen
 * 날짜 데이터 출력 형식을 변환하는 예제
 */
class DateFormatEx03 {

	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			Date d = df.parse("2017년 12월 04일");
			System.out.println(df2.format(d));
		} catch (Exception e) {}
		
	}

}
