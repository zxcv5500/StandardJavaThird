package ch13;

class ThreadEx17_01 implements Runnable {
	boolean suspended = false;
	boolean stopped = false;
	
	Thread th;
	
	ThreadEx17_01(String name) {
		th = new Thread(this, name);		// Thread(Runnable r, String name)
	}

	@Override
	public void run() {
		while (!stopped) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) { }
		}
		
		System.out.println(Thread.currentThread().getName() + " - stopped");
	}
	
	public void suspend() { suspended = true; }
	public void resume() { suspended = false; }
	public void stop() { stopped = true; }
	public void start() { th.start(); }
}

/**
 * @author zxcv5500
 * 이전의 예제를 좀 더 객체 지향적으로 보완한 코드. 이전 코드(ThreadEx16)와 비교해 보자
 */
class ThreadEx17 {

	public static void main(String[] args) {
		ThreadEx17_01 th1 = new ThreadEx17_01("*");
		ThreadEx17_01 th2 = new ThreadEx17_01("**");
		ThreadEx17_01 th3 = new ThreadEx17_01("***");
		th1.start();
		th2.start();
		th3.start();
		
		try {
			Thread.sleep(2000);
			th1.suspend();
			Thread.sleep(2000);
			th2.suspend();
			Thread.sleep(3000);
			th1.resume();
			Thread.sleep(3000);
			th1.stop();
			th2.stop();
			Thread.sleep(2000);
			th3.stop();
		} catch (InterruptedException e) { }
	}

}


