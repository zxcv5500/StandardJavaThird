package ch13;

/**
 * @author sharpen
 * synchronized를 적용해 임계영역으로 지정해 준 예제 메서드 전체나 소스영역 전체나 범위가 같으므로 이경우 메서드에 적용
 */
class ThreadEx22 {

	public static void main(String[] args) {
		RunnableEx22 r = new RunnableEx22();
		new Thread(r).start();
		new Thread(r).start();
				
	}

}

class Account02 {
	private int balance = 1000;				// private으로 해야 동기화가 의미가 있다.
	
	public int getBalance() {
		return balance;
	}
	
	public synchronized void withdraw(int money) {
		if (balance >= money) {
			try { Thread.sleep(1000); } catch (InterruptedException e) {}
			balance -= money;
		}
	}
}

class RunnableEx22 implements Runnable {
	Account02 acc = new Account02();
	@Override
	public void run() {
		while (acc.getBalance() > 0) {
			// 100, 200, 300중의 한 값을 임의로 선택해서 출금 (withdraw)
			int money = (int) (Math.random() * 3 + 1) * 100;
			acc.withdraw(money);
			System.out.println("balance : " + acc.getBalance());
		}
	}
	
}