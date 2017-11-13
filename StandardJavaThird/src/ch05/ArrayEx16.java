package ch05;

public class ArrayEx16 {

	public static void main(String[] args) {
		
		if (args != null) {		// 입력된 매개변수가 없을 경우를 대비한 방어코드
			System.out.println("매개변수의 개수 : ");
			for (int i = 0; i < args.length; i++) {
				System.out.println("args[" + i + "] = \"" + args[i] + "\"");
			}	
		}
		
	}

}
