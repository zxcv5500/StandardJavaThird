package ch13;

/**
 * @author zxcv5500
 * 두 개의 쓰레드가 작업을 하나씩 나누어서 수행한 실행결과를 보여주는 코드
 */
class ThreadEx05 {
	static long startTime = 0;

	public static void main(String[] args) {
		ThreadEx05_01 th1 = new ThreadEx05_01();
		th1.start();
		
		startTime = System.currentTimeMillis();
		
		for (int i=0; i <500; i++) {
			System.out.printf("%s", new String("-"));
		}
		
		System.out.print("소요시간1 : " + (System.currentTimeMillis() - ThreadEx05.startTime));
	}

}


class ThreadEx05_01 extends Thread {
	public void run() {
		for (int i=0; i < 500; i++) {
			System.out.printf("%s", new String("|"));
		}
		
		System.out.print("소요시간2 : " + (System.currentTimeMillis() - ThreadEx05.startTime));
	}
}