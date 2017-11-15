package ch06;

class Data02 { int x; }

/**
 * @author zxcv5500
 * 참조형 매개변수 현상 확인 코드
 */
public class ReferenceParamEx {

	public static void main(String[] args) {
		Data02 d = new Data02();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x " + d.x);
		
		
	}
	
	static void change(Data02 d) {		//참조형 매개변수
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}

}
