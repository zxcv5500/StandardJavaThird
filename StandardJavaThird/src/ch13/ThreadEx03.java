package ch13;

class ThreadEx03_01 extends Thread {
	public void run() {
		throwException();
	}
	
	public void throwException() {
		try {
			throw new Exception();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

/**
 * @author sharpen
 * 쓰레드가 생성된 게 아니라 단순히 run메소드만 호출을 했을 때의 상황 예제
 */
class ThreadEx03 {

	public static void main(String[] args) {
		ThreadEx03_01 t1 = new ThreadEx03_01();
		t1.run();
	}

}
