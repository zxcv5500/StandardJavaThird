package ch08;

/**
 * @author zxcv5500
 * 메소드를 만들고 throws 예약어를 사용해 두면 예외처리를 이 메소드를 사용하려는 호출영역에서 작성해서 관리할 수 있다. 
 */
class ExceptionEx14 {

	public static void main(String[] args) {
		try {
			method1();	
		} catch (Exception e) {
			System.out.println("main메서드에서 예외가 처리되었습니다.");
			e.printStackTrace();
		}
		
	}
	
	static void method1() throws Exception {		// 이 메소드를 사용하려고 호출한 코드 쪽에다 try catch코드를 통해서 예외 처리를 해주면 된다.
		throw new Exception();
	}	// method1의 끝

}
