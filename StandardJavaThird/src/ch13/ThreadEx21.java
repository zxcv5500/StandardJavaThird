package ch13;


/**
 * @author sharpen
 * 은행의 잔고를 확인해서 출금하는 예제를 쓰레드를 사용해서 표현했다. 그런데 잔고가 음수(-)가 되기도 한다. 문제있는 예제
 */
public class ThreadEx21 {

	public static void main(String[] args) {
		RunnableEx21 r = new RunnableEx21();
		new Thread(r).start();						// ThreadGroup에 의해 참조되므로 gc대상이 아니다.
		new Thread(r).start();						// ThreadGroup에 의해 참조되므로 gc대상이 아니다.
				
	}

}

class Account {
	private int balance = 1000;
	
	public int getBalance() {
		return balance;
	}
	
	public /* synchronized */ void withdraw(int money) {					// 메소드에 임계영역을 다는 경
		//synchronized(this) {				// 임계 블록 설정하는 경우
			if (balance >= money) {
				try { Thread.sleep(1000); } catch (InterruptedException e){}
				balance -= money;
			}
		//}
		
	}
}

class RunnableEx21 implements Runnable {
	Account acc = new Account();

	@Override
	public void run() {
		while(acc.getBalance() > 0) {
			// 100, 200, 300중의 한 값을 임의로 선택해서 출금(withdraw)
			int money = (int) (Math.random() * 3 + 1) * 100;
			acc.withdraw(money);
			System.out.println("balance : " + acc.getBalance());
		}
	}
	
}
