package ch13;

import javax.swing.JOptionPane;

/**
 * @author zxcv5500
 * 싱글스레드에서 사용자의 입력을 받는 경우 입력되기 전까지 다른 작업이 대기한다는 것을 보여주는 예제 
 */
class ThreadEx06 {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 " + input + "입니다.");
		
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);			// 1초 시간을 지연시킨다.
			} catch (Exception e) {}
		}
	}

}
