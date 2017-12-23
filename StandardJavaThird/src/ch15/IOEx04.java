package ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author sharpen
 * 이전 예제의 문제점을 수정한 예제
 */
class IOEx04 {

	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		
		byte[] temp = new byte[4];
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		try {
			while (input.available() > 0) {
				int len = input.read(temp);					// 읽어 온 데이터의 개수를 반환한다. temp는 temp 배열 갯수[4]만큼 채워진다. input의 position값은 그만큼 변화된다. 
				output.write(temp,0, len);
			}
		} catch (IOException e) {		}

		outSrc = output.toByteArray();
		
		System.out.println("Input Source : " + Arrays.toString(inSrc));
		System.out.println("temp : " + Arrays.toString(temp));
		System.out.println("Output Source : " + Arrays.toString(outSrc));
		
	}

}
