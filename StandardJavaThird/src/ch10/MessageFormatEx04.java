package ch10;

import java.io.File;
import java.text.MessageFormat;
import java.util.Scanner;

/**
 * @author sharpen
 * 파일로 데이터를 입력받아 처리하는 예제로 바꿈.
 */
class MessageFormatEx04 {

	public static void main(String[] args) throws Exception {
		String tableName = "CUST_INFO";
		String fileName = "data4.txt";
		String msg = "INSERT INTO " + tableName + " VALUES ({0}, {1}, {2}, {3});";
		Scanner s = new Scanner(new File(fileName));			// TODO : data4.txt파일이 존재 안해서 에러발생 나중에 다시 보자.
		
		String pattern = "{0},{1},{2},{3}";
		MessageFormat mf = new MessageFormat(pattern);
		
		while (s.hasNextLine()) {
			String line = s.nextLine();
			Object[] objs = mf.parse(line);
			System.out.println(MessageFormat.format(msg, objs));
		}
		
		s.close();
	}

}
