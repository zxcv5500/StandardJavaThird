package ch06;

class Tv04 {
	// Tv의 속성(멤버 변수)
	String color;			// 색상
	boolean power;			// 전원 상태(on/off)
	int channel;			// 채널
	
	// Tv의 기능(메서드)
	void power() { power = !power;}
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}

public class TvTest4 {

	public static void main(String[] args) {
		Tv04[] tvArr = new Tv04[3];		// 길이가 3인 Tv객체 배열
		
		// Tv객체를 생성해서 Tv객체 배열의 각 요소에 저장
		for (int i=0; i < tvArr.length; i++) {
			tvArr[i] = new Tv04();
			tvArr[i].channel = i + 10; // tvArr[i]의 channel에 i + 10을 저장
		}
		
		for (int i =0; i < tvArr.length; i++) {
			tvArr[i].channelUp();				// tvArr[i]의 메서드를 호출. 채널이 1증가
			System.out.printf("tvArr [%d].channel=%d%n", i, tvArr[i].channel);			
		}
	}		// main의 끝

}
