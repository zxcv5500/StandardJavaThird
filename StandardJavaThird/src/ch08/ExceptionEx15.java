package ch08;

import java.io.File;

/**
 * @author zxcv5500
 * java ExceptionEx15 "test.txt" 이런 식으로 terminal 창에 입력하면 입력내용에 따라 예외처리 모듈이 동작하게 된다.
 */
class ExceptionEx15 {

	public static void main(String[] args) {
		// command line에서 입력받은 값을 이름으로 갖는 파일을 생성한다.
		File f = createFile(args[0]);
		System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다.");

	}

	static File createFile(String fileName) {
		try {
			if (fileName == null || fileName.equals("")) 
				throw new Exception("파일이 유효하지 않습니다.");
		} catch (Exception e) {
			// fileName이 부적절한 경우, 파일 이름을 '제목없음.txt'로 한다.
			fileName = "제목없음.txt";
		} finally {
			File f = new File(fileName);		// File클래스의 객체를 만든다.
			createNewFile(f);
			return f;
		}
	}		// createFile메서드의 끝
	
	static void createNewFile(File f) {
		try {
			f.createNewFile();
		} catch (Exception e) { }
	}
}
