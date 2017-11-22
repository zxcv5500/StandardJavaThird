package ch08;

/**
 * @author sharpen
 * 예제 8-22 예외 되던지기
 * method1의 catch에서 예외처리를 하고 그걸 다시 throw e로 예외를 던진다.
 * 그럼 main에서 호출해서 쓴 곳에서도 결과값으로 e를 전달 받고 메인메소드의 try문에서 catch문으로 e를 전달해서 예외를 처리하게 된다.
 */
class ExceptionEx17 {

	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("main메서드에서 예외가 처리되었습니다.");
		}
	}
	
	
	static void method1() throws Exception {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method메서드에서 예외가 처리되었습니다.");
			throw e;
		}
	}		//method1메서드의 끝

}
