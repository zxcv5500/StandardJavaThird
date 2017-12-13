package ch13;

class ThreadEx02_01 extends Thread {
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
 * 새로 생성한 쓰레드에서 고의로 예외를 발생시키고 printStackTrace()를 이용해서 예외가 발생한 당시의 호출 스택을 출력하는 예제
 */
class ThreadEx02 {

	public static void main(String[] args) {
		ThreadEx02_01 t1 = new ThreadEx02_01();
		t1.start();
	}

}
