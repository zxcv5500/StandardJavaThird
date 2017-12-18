package ch13;

class RunImplEx16 implements Runnable {
	boolean suspended = false;
	boolean stopped = false;

	@Override
	public void run() {
		while (!stopped) {
			if (!suspended) {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) { }			
			}
		}
		System.out.println(Thread.currentThread().getName() + "- stopped");
	}
	
	public void suspend() { suspended = true; }
	public void resume() { suspended = false; }
	public void stop() { stopped = true; }
	
}

/**
 * @author zxcv5500
 * boolean 타입의 두 변수를 인스턴스 변수로 선언하고, 이 변수를 사용해서 반복문과 조건문의 조건식을 작성해서 제어하는 예제
 */
class ThreadEx16 {

	public static void main(String[] args) {
		RunImplEx16 r1 = new RunImplEx16();
		RunImplEx16 r2 = new RunImplEx16();
		RunImplEx16 r3 = new RunImplEx16();
		Thread th1 = new Thread(r1, "*");
		Thread th2 = new Thread(r2, "**");
		Thread th3 = new Thread(r3, "***");
		
		th1.start();
		th2.start();
		th3.start();
		
		try {
			Thread.sleep(2000);
			r1.suspend();					// th1.suspend()이 아님에 주의
			Thread.sleep(2000);
			r2.suspend();
			Thread.sleep(3000);
			r1.resume();
			Thread.sleep(3000);
			r1.stop();
			r2.stop();
			Thread.sleep(2000);
			r3.stop();
		} catch (InterruptedException e) {}
	}

}
