package ch13;


class ThreadEx18_01 implements Runnable {
	boolean suspended = false;
	boolean stopped = false;
	
	Thread th;
	
	ThreadEx18_01(String name) {
		th = new Thread(this, name);			// Thread(Runnable r, String name)
	}

	@Override
	public void run() {
		String name = th.getName();
		
		while(!stopped) {
			if(!suspended) {
				System.out.println(name);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println(name + " - interrupted");
				}
			} else {
				Thread.yield();
			}
		}
		System.out.println(name + " - stopped");
	}
	
	public void suspend() {
		suspended = true;
		th.interrupt();
		System.out.println(th.getName() + "- interrupt() by suspend");
	}
	
	public void resume() {
		suspended = false;
	}
	
	public void stop() {
		stopped = true;
		th.interrupt();
		System.out.println(th.getName() + "- interrupt() by stop()");
	}
	
	public void start() {
		th.start();
	}
		
}

/**
 * @author sharpen
 * 이전 예제에 yield()와 interrupt()를 추가해서 예제의 효율성과 응답성을 향상시켰다.
 */
class ThreadEx18 {

	public static void main(String[] args) {
		ThreadEx18_01 th1 = new ThreadEx18_01("*");
		ThreadEx18_01 th2 = new ThreadEx18_01("**");
		ThreadEx18_01 th3 = new ThreadEx18_01("***");
		
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
		} catch (InterruptedException e) {		}
	}

}
