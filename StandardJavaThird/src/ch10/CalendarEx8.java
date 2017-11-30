package ch10;

/**
 * @author zxcv5500
 * 년과 월 정도의 계산이라면 Calendar를 이용하지 않고 이처럼 간단히 처리해도 좋다.
 */
class CalendarEx8 {

	public static void main(String[] args) {
		String date1 = "201508";
		String date2 = "201405";
		
		// 년과 월을 substring으로 잘라서 정수로 변환한다.
		int month1 = Integer.parseInt(date1.substring(0,4)) * 12 + 
				Integer.parseInt(date1.substring(4));
		int month2 = Integer.parseInt(date2.substring(0,4)) * 12 + 
				Integer.parseInt(date2.substring(4));
		
		System.out.println(date1.substring(0,4));		// 0 위치부터 3까지
		System.out.println(date1.substring(4));			// 4인덱스부터 끝까지
		System.out.println(date1 + "과 " + date2 + "의 차이는 " + Math.abs(month1-month2) + "개월 입니다.");
		
	}

}
