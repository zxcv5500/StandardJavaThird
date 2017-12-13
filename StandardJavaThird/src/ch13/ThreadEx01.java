package ch13;

class ThreadEx01_01 extends Thread {

	@Override
	public void run() {
		for(int i =0; i < 7; i++) {
			System.out.println(getName());			// 조상인 Thread의 getName()을 호출
		}
	}
	
}

class ThreadEx01_02 implements Runnable {

	@Override
	public void run() {
		for (int i=0; i < 4; i++) {
			// Thread.CurrentThread() - 현재 실행 중인 Thread를 반환
			System.out.println(Thread.currentThread().getName());
		}
	}
	
}

/**
 * @author sharpen
 *  프로세스 안의 쓰레드를 각각의 방법으로 생성해서 사용하는 법을 보여주는 소스 코드
 */
class ThreadEx01 {

	public static void main(String[] args) {
		ThreadEx01_01 t1 = new ThreadEx01_01();
		
		Runnable r = new ThreadEx01_02();
		Thread t2 = new Thread(r);				// 생성자 Thread(Runnable target)
		
		t1.start();
		t2.start();

	}

}


