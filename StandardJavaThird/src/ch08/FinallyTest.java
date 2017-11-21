package ch08;

/**
 * @author zxcv5500
 * 프로그램이 설치되고 설치에 필요했던 임시 파일들을 지우는 경우
 * 설치 완료나 설치과정 중 예외가 발생한 경우 무조건 처리해야 하는 작업은 finally에서 담당
 * 예) 설치에 필요한 임시 파일 제거 같은 작업. 
 */
class FinallyTest {

	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
			deleteTempFiles();
		} catch (Exception e) {
			e.printStackTrace();
			deleteTempFiles();
		}
	}
	
	static void startInstall() {
		/* 프로그램 설치에 필요한 준비를 하는 코드를 적는다.*/		
	}
	
	static void copyFiles() {
		/* 파일들을 복사하는 코드를 적는다 */
	}
	
	static void deleteTempFiles() {
		/* 임시파일들을 삭제하는 코드를 적는다. */
	}

}
