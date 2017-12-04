package ch10;

import java.text.MessageFormat;

/**
 * @author sharpen
 * 반복문을 사용해 하나 이상의 데이터 집합을 출력하는 예제
 */
class MessageFormatEx02 {

	public static void main(String[] args) {
		String tableName = "CUST_INFO";
		String msg = "INSERT INTO " + tableName + " VALUES (''{0}'',''{1}'', {2}, ''{3}'');";
		
		Object[][] arguments = {
				{"이자바","02-1234-5678", "27", "07-09"},
				{"김프로","032-333-1234", "33", "10-07"},
				
		};
		
		for (int i = 0; i < arguments.length; i++) {
			String result = MessageFormat.format(msg, arguments[i]);
			System.out.println(result);
		}
	}

}
