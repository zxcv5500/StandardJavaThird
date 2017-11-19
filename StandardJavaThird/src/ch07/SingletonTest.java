package ch07;

/**
 * @author zxcv5500
 * 싱글톤 패턴. 
 */
final class Singleton {
	private static Singleton s = new Singleton();		// getInstance()에서 사용될 수있도록 인스턴스가
														// 미리 생성되어 있어야 하므로 static이어야 한다.
	
	private Singleton() {
		// ...
	}
	
	public static Singleton getInstance() {
		if (s==null) {
			s = new Singleton();
		}
		return s;
	}
	
	//...
	
}


public class SingletonTest {

	public static void main(String[] args) {
//		Singleton s = new Singleton();				// 에러! Singleton클래스는 private 접근 제어자라서 다른 클래스에서 접근할 수 없다.
		Singleton s = Singleton.getInstance();
	}

}
