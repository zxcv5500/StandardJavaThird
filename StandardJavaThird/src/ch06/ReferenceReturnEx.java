package ch06;

class Data03 { int x; }


/**
 * @author zxcv5500
 * copy 메서드는 새로운 객체를 생성한 다음에, 매개변수로 넘겨받은 객체에 저장된 값을 복사해서 반환한다.
 */
public class ReferenceReturnEx {

	public static void main(String[] args) {
		Data03 d = new Data03();
		d.x = 10;
		
		Data03 d2 = copy(d);
		System.out.println("d.x = " + d.x);
		System.out.println("d2.x = " + d2.x);
		
	}
	
	static Data03 copy(Data03 d) {
		Data03 tmp = new Data03();
		tmp.x = d.x;
		
		return tmp;
	}

}
