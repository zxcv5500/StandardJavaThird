package ch08;

/**
 * @author sharpen
 * 컴파일러가 예외처리를 확인하지 않는 RuntimeException 클래스들을 'unchecked예외'라 부르고
 * 예외처리를 확인하는 Exception클래스들은 'checked예외'라고 부른다.
 */
public class ExceptionEx11 {

	public static void main(String[] args) {
		throw new RuntimeException();
	}

}
