package ch13;

import javax.swing.JOptionPane;

class ThreadEx14_01 extends Thread {

	@Override
	public void run() {
		int i = 10;
		
		while (i !=0 && !isInterrupted()) {
			System.out.println(i--);
		}
		
		try {
			Thread.sleep(1000);				// 1초 지연
		} catch (InterruptedException e) {
//			interrupt();		Thread.sleep()에 InterruptedException 예외가 발생하기 때문에 이 코드를 써야만 제대로 동작한다. 
		}
		
		System.out.println("카운트가 종료되었습니다.");
	}
	
}

/**
 * @author zxcv5500
 * 이전 예제에서 for문으로 딜레이 주던 걸 Thread.sleep(1000)으로 변경했을 뿐인 예제. 
 */
class ThreadEx14 {

	public static void main(String[] args) {
		ThreadEx14_01 th1 = new ThreadEx14_01();
		th1.start();
		
		String input = JOptionPane.showInputDialog("아무값이나 입력하세요.");
		System.out.println("입력하신 값은 " + input + "입니다. ");
		th1.interrupt();
		System.out.println("isInterrupted():" + th1.isInterrupted());
	}

}
