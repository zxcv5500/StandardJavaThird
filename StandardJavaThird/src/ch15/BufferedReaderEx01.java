package ch15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author sharpen
 * BufferedReaderEx01.java 파일출력에서 ;를 포함한 라인만 보여주는 코드 
 */
class BufferedReaderEx01 {

	public static void main(String[] args) {
		System.out.println(File.separator);					// 사용되는 OS(unix or window and the other)의 파일 경로 구분자를 출력해 본다. 확인작업 / or \인지 출력해 본다.
		
		try {
			FileReader fr = new FileReader("." + File.separator + "src" + File.separator + "ch15" + File.separator +"BufferedReaderEx01.java");
			BufferedReader br = new BufferedReader(fr);
			
			String line = "";
			for (int i=1; (line = br.readLine()) != null; i++) {
				// ";"를 포함한 라인을 출력한다.
				if (line.indexOf(";") != -1)
					System.out.println(i + ":" + line);
			}
			br.close();
			
		} catch (IOException e) {		}
	}

}
