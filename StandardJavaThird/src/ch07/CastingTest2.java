package ch07;

/**
 * @author zxcv5500
 * 초기화를 처음부터 조상타입으로 해놓고 자식타입으로 형변환 하려고 하면 에러가 발생한다.
 */
public class CastingTest2 {

	public static void main(String[] args) {
		Car car = new Car();				// 조상 타입의 참조변수로 초기화 했다.
		Car car2 = null;
		FireEngine fe = null;
		
		car.drive();
		fe = (FireEngine) car;				// 그런데 조상으로 처음부터 초기화해놓고 무턱대고 
											// 자식참조변수로 형변환해서 바꾸려 들었기 때문에 에러가 발생한다.
		fe.drive();
		car2 = fe;
		car2.drive();
	}

}
