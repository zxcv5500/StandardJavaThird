package ch13;

import java.util.Iterator;
import java.util.Map;

/**
 * @author zxcv5500
 * 데몬쓰레드2번째 예제
 * 프로그램을 실행하면, JVM은 가비지컬렉션, 이벤트처리, 그래픽 처리와 같이 
 * 프로그램이 실행되는데 필요한 보조작업을 수행하는 데몬 쓰레드들을 
 * 자동적으로 생성해서 실행시킨다.
 * 그리고 이들은 main쓰레드 그룹, system쓰레드 그룹에 속한다. 
 */
class ThreadEx11 {

	public static void main(String[] args) throws Exception {
		ThreadEx11_01 t1 = new ThreadEx11_01("Thread1");
		ThreadEx11_02 t2 = new ThreadEx11_02("Thread2");
		t1.start();
		t2.start();
	}

}

class ThreadEx11_01 extends Thread {
	ThreadEx11_01(String name) {
		super(name);
	}
	
	public void run() {
		try {
			sleep(5 * 1000);			// 5초 동안 기다린다.
		} catch (InterruptedException e) {}
	}
}


class ThreadEx11_02 extends Thread {
	public ThreadEx11_02(String name) {
		super(name);
	}
	
	public void run( ) {
		Map map = getAllStackTraces();
		Iterator it = map.keySet().iterator();
		
		int x = 0;
		while (it.hasNext()) {
			Object obj = it.next();
			Thread t = (Thread) obj;
			StackTraceElement[] ste = (StackTraceElement[]) (map.get(obj));
			
			System.out.println("[" + ++x + "] name : " + t.getName()
			+ ", group : " + t.getThreadGroup().getName()
			+ ", demon : " + t.isDaemon());
			
			for (int i=0; i < ste.length; i++) {
				System.out.println(ste[i]);
			}
			
			System.out.println();
		}
	}
}
