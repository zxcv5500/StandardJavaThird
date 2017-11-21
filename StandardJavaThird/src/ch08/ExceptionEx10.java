package ch08;

class ExceptionEx10 {

	public static void main(String[] args) {
		throw new Exception();			// Exception을 고의로 발생시킨다. 
										// 예외처리가 되어 있어야 할 곳에 예외처리가 되어있지 않다는 에러 메시지가 뜸
	}

}
