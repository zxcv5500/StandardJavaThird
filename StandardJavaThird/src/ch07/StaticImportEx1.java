package ch07;

import static java.lang.System.out;
import static java.lang.Math.*;

/**
 * @author zxcv5500
 * static import문을 사용하면 static멤버를 호출할 때 클래스 이름을 생략할 수 있다.
 */
public class StaticImportEx1 {

	public static void main(String[] args) {
		// System.out.println(Math.random());
		out.println(random());
		
		// System.out.println("Math.PI : " + Math.PI);
		out.println("Math.PI : " + PI);
	}

}
