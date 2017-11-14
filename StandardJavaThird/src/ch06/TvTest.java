package ch06;

class Tv {
	// Tv의 속성(멤버변수)
	String color;			// 색상
	boolean power;			// 전원상태(on/off)
	int channel;			// 채널
	
	// Tv의 기능(메서드)
	void power() { power = !power; }	// Tv를 켜거나 끄는 기능을 하는 메서드
	void channelUp() { ++channel; }		// Tv의 채널을 높이는 기능을 하는 메서드
	void channelDown() { --channel; }	// Tv의 채널을 낮추는 기능을 하는 메서드
}



/**
 * Tv클래스로부터 인스턴스를 생성하고 
 * 인스턴스의 속성(channel)과 메서드(channelDown())를 사용하는 방법을 보여주는 코드
 * @author zxcv5500
 *
 */
public class TvTest {

	public static void main(String[] args) {
		Tv t;					// Tv인스턴스를 참조하기 위한 변수 t를 선언
		t = new Tv();			// Tv인스턴스를 생성한다.
		t.channel = 7;			// Tv인스턴스의 멤버변수 channel의 값을 7로 한다.
		t.channelDown();		// Tv인스턴스의 메서드 channelDown()을 호출한다.
		System.out.println("현재 채널은 " + t.channel + "입니다.");
	}

}
