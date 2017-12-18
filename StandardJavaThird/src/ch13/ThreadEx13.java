package ch13;

import javax.swing.JOptionPane;

class ThreadEx13 {

	public static void main(String[] args) {
		ThreadEx13_01 th1 = new ThreadEx13_01();
		th1.start();
		
		String input = JOptionPane.showInputDialog("아무값이나 입력하세요.");
		System.out.println("입력하신 값은 : " + input + "입니다.");
		th1.interrupt();				// interrupt()를 호출하면, interrupted 상태가 true가 된다.
		System.out.println("isInterrupted() : " + th1.isInterrupted());
		
	}
}


/**
 * @author sharpen
 * 이전 예제와 달리 interrupt에 의해 카운트다운이 중간에 멈추었다.
 */
class ThreadEx13_01 extends Thread {

	@Override
	public void run() {
		int i = 10;
		
		
		while (i != 0 && !isInterrupted()) {
			System.out.println(i--);
			for (long x=0; x<2500000000L; x++);		//시간 지
		}
		
		System.out.println("카운트가 종료되었습니다.");
	}
	
}