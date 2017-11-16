package ch06;

/**
 * @author zxcv5500
 * 아무런 조건도 없이 계속 호출하기 때문에 무한 호출에 빠지고 stackoverflow가 발생하게 된다
 */
public class MainTest {

	public static void main(String[] args) {
		main(null);				// 재귀호출. 자기 자신을 다시 호출한다.
	}

}
