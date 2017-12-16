package ch13;

/**
 * @author zxcv5500
 * demon 쓰레드 예제
 */
class ThreadEx10 implements Runnable {
	static boolean autoSave = false;
	
	public static void main(String[] args) {
		Thread t = new Thread(new ThreadEx10());
		t.setDaemon(true);
		t.start();
		
		for (int i=0; i <= 20; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) { }
			System.out.println(i);
			
			if (i==5) {
				autoSave = true;
			}
		}
		
		System.out.println("프로그램을 종료합니다.");
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(3 * 1000);			//	
			} catch (InterruptedException e) {	}
			
			// autoSave 의 값이 true이면 autoSave()를 호출한다.
			if (autoSave) {
				autoSave();
			}
		}
	}
	
	public void autoSave() {
		System.out.println("작업 파일이 자동저장되었습니다.");
	}

}
