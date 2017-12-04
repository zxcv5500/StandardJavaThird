package ch10;

import java.text.MessageFormat;

/**
 * @author sharpen
 * 가정통신문 처럼 보내는 사람이나 번호만 다르고 내용은 같을 때 쓰는 예제
 */
class MessageFormatEx01 {

	public static void main(String[] args) {
		String msg = "Name: {0} \nTel: {1} \nAge:{2} \nBirthDay:{3}";
		
		Object[] arguments = {
				"이자바", "02-1234-5678", "27", "07-09"
		};
		
		String result = MessageFormat.format(msg, arguments);
		System.out.println(result);
	}

}
