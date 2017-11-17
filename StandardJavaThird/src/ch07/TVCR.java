package ch07;

class Tv02 {
	boolean power;					// 전원상태(on/off)
	int channel;					//  채널
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}

class VCR {
	boolean power;			//전원상태(on/off)
	int counter = 0;
	void power() { power = !power; }
	void play() { /* 내용 생략 */ }
	void stop() { /* 내용 생략 */ }
	void rew() { /* 내용 생략 */ }
	void ff() { /* 내용 생략 */ }
}

/**
 * @author zxcv5500
 * 단일 상속만 허용하는 자바의 특성을 극복하기 위해서 
 * 상속을 받은 클래스에서 다른 클래스를 포함해서 코드를 사용하는 방법을 보여준다.
 */
public class TVCR extends Tv02 {
	VCR vcr = new VCR();			// VCR클래스를 포함시켜서 사용한다.
	int counter = vcr.counter;
	
	void play() {
		vcr.play();
	}
	
	void stop() {
		vcr.stop();
	}
	
	void rew() {
		vcr.rew();
	}
	
	void ff() {
		vcr.ff();
	}
}
