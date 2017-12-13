package ch13;

import javax.swing.JOptionPane;

class ThreadEx07_01 extends Thread {
	public void run() {
		for (int i=10; i > 0; i--) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch (Exception e) {		 }
		}
	}
}

/**
 * @author zxcv5500
 * 이전 예제와 달리 입력 받는 부분과 화면에 숫자를 출력하는 부분을 두 개의 쓰레드로 나누어 처리했다.
 * 그렇기 때문에 사용자가 입력을 마치지 않아도 화면에 숫자가 출력되는 것을 알 수 있다.
 */
class ThreadEx07 {

	public static void main(String[] args) {
		ThreadEx07_01 th1 = new ThreadEx07_01();
		th1.start();
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
		System.out.println("입력하신 값은 " + input + "입니다.");
	}

}
