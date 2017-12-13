package ch13;

/**
 * @author zxcv5500
 * 쓰레드 그룹과 쓰레드를 생성하고 main.list()를 호출해서 main쓰레드 그룹의 정보를 출력하는 예제
 */
class ThreadEx09 {

	public static void main(String[] args) {
		ThreadGroup main = Thread.currentThread().getThreadGroup();
		ThreadGroup grp1 = new ThreadGroup("Group1");
		ThreadGroup grp2 = new ThreadGroup("Group2");
		
		// ThreadGroup(ThreadGroup parent, String name)
		ThreadGroup subGrp1 = new ThreadGroup(grp1, "SubGroup1");
		
		grp1.setMaxPriority(3);			// 쓰레드 그룹 grp1의 최대우선순위를 3으로 변경.
		
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(1000);			// 쓰레드를 1초간 멈추게 한다.
				} catch (InterruptedException e) { }
			}
		};
		
		// Thread(ThreadGroup tg, Runnable r, String name)
		new Thread(grp1, r, "th1").start();
		new Thread(subGrp1, r, "th2").start();
		new Thread(grp2, r, "th3").start();
		
		System.out.println(">> List of ThreadGroup : " + main.getName()
		+ ", Activite ThreadGroup : " + main.activeGroupCount()
		+ ", Activite Thread : " + main.activeGroupCount());
		main.list();
		
	}

}
