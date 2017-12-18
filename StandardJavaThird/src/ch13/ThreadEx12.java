package ch13;

/**
 * @author sharpen
 * sleep()은 현재 실행 중인 쓰레드에 대해 동작하기 때문에 실제로는 main스레드가 영향을 받는다. 잘못 작성된 예시
 */
class ThreadEx12 {

	public static void main(String[] args) {
		ThreadEx12_01 th1 = new ThreadEx12_01();
		ThreadEx12_02 th2 = new ThreadEx12_02();
		
		th1.start();
		th2.start();
		
		try {
			th1.sleep(2000);				// sleep()은 현재 실행 중인 쓰레드에 대해 동작하기 때문에 실제로는 main스레드가 영향을 받는다
		} catch (InterruptedException e) { }
		
		System.out.print("<<main 종료>>");
		
	}

}

class ThreadEx12_01 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print("-");
		}
		System.out.print("<<th1 종료>>");
	}
}

class ThreadEx12_02 extends Thread {

	@Override
	public void run() {
		for (int i=0; i < 300; i++) {
			System.out.print("|");
		}
		System.out.println("<<th2 종료>>");
	}
	
}
