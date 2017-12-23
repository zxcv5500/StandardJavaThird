package ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author sharpen
 * 10개의 byte 배열의 값을 입력한 후, 임시temp배열의 크기 4개씩 읽어서 output스트림으로 temp의 값들을 outSrc byte[]배열로 출력시킨다.
 */
class IOEx03 {

	public static void main(String[] args) {
		byte[] inSrc = { 0,1,2,3,4,5,6,7,8,9 };
		byte[] outSrc = null;
		
		byte[] temp = new byte[4];					// 이전 예제와 배열의 크기가 다르다.
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		System.out.println("Input Source : " + Arrays.toString(inSrc));
		
		try {
			while (input.available() > 0) {
				input.read(temp);
				output.write(temp);
				System.out.println("temp : " + Arrays.toString(temp));
				
				outSrc = output.toByteArray();
				printArrays(temp, outSrc);
			}
		} catch(IOException e) { }
	}
	
	static void printArrays(byte[] temp, byte[] outSrc) {
		System.out.println("temp : " + Arrays.toString(temp));
		System.out.println("Output Source : " + Arrays.toString(outSrc));
	}

}
