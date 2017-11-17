package ch06;



/**
 * @author zxcv5500
 * 초기화 블럭(initialization block)
 * 
 * 클래스 초기화블럭 static { } 
 * 	-> 클래스가 메모리에 처음 로딩될 때 한번만 수행
 * 
 * 
 * 인스턴스 초기화 블럭 { } 
 *  -> 생성자 처럼 제품이 하나 만들어 질때 마다 수행된다.
 *  생성자보다 먼저 초기화 동작을 함.
 *  모든 생성자들에서 공통으로 초기화 하는 작업이 있다면 중복제거를 위해 여기에 코드를 빼내는 게 맞음. 
 */
public class BlockTest {
	static {
		System.out.println(" static { } ");
	}
	
	{
		System.out.println("{  }");
	}
	
	public BlockTest() {
		System.out.println("생성자");
	}
	
	public static void main(String[] args) {
		System.out.println("BlockTest bt = new BlockTest();");
		BlockTest bt = new BlockTest();
		
		System.out.println("Blocktest bt2 = new BlockTest();");
		BlockTest bt2 = new BlockTest();
	}

}
