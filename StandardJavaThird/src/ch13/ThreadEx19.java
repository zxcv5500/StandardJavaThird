package ch13;

class ThreadEx19_01 extends Thread {

	@Override
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print(new String("-"));
		}
	}
	
}

class ThreadEx19_02 extends Thread {

	@Override
	public void run() {
		for (int i=0; i < 300; i++) {
			System.out.print(new String("|"));
		}
	}
	
}


/**
 * @author sharpen
 * join()을 사용해서 다른 쓰레드의 작업을 기다리도록 하는 예제.
 */
class ThreadEx19 {
	static long startTime = 0;
	
	public static void main(String[] args) {
		ThreadEx19_01 th1 = new ThreadEx19_01();
		ThreadEx19_02 th2 = new ThreadEx19_02();
		
		th1.start();
		th2.start();
		startTime = System.currentTimeMillis();
		
		try {
			th1.join();					// main 쓰레드가 th1의 작업이 끝날 때까지 기다린다.
			th2.join();					// main 쓰레드가 th2의 작업이 끝날 때까지 기다린다.
		} catch (InterruptedException e) {		}
		
		System.out.print("소요시간 : " + (System.currentTimeMillis() - ThreadEx19.startTime));
	}

}
