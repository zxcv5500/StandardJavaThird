package ch06;

class Data1 {
	int value;
}

class Data2 {
	int value;
	
	public Data2(int x) {									// 매개변수가 있는 생성자.
		value = x;
	}
}

/**
 * @author zxcv5500
 * 생성자 학습 코드
 */
public class ConstructorTest {

	public static void main(String[] args) {
		Data1 d1 = new Data1();
		Data2 d2 = new Data2();								// compile error 발생! Data2 d2 = new Data2(10);로 작성하거나
															// 기본생성자를 오버로딩 해준다.
	}

}
