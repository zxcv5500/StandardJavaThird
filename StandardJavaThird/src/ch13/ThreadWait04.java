package ch13;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class Customer04 implements Runnable {
	private Table04 table;
	private String food;
	
	Customer04(Table04 table, String food) {
		this.table = table;
		this.food = food;
	}
	
	@Override
	public void run() {
		while (true) {
			try { Thread.sleep(100); } catch (Exception e) {			}
			String name = Thread.currentThread().getName();
			
			table.remove(food);
			System.out.println(name + " ate a " + food);
		}
	}
	
}

class Cook04 implements Runnable {
	private Table04 table;
	
	Cook04(Table04 table) { this.table = table; }

	@Override
	public void run() {
		while (true) {
			int idx = (int) (Math.random()* table.dishName());
			table.add(table.dishNames[idx]);
			try { Thread.sleep(10); } catch (InterruptedException e) { }
		 }
	}
	
	
}


class Table04 {
	String[] dishNames = { "donut", "donut", "burger" };
	final int MAX_FOOD = 6;
	private ArrayList<String> dishes = new ArrayList<>();
	
	private ReentrantLock lock = new ReentrantLock();
	private Condition forCook = lock.newCondition();
	private Condition forCust = lock.newCondition();
	
	
	public void add(String dish) {
		lock.lock();
		
		try {
			while(dishes.size() >= MAX_FOOD) {
				String name = Thread.currentThread().getName();
				System.out.println(name + " is waiting");
				try {
					forCook.await();							// wait(); COOK쓰레드를 기다리게 한다.
					Thread.sleep(500);
				} catch (InterruptedException e) { }
			}
			
			dishes.add(dish);
			forCust.signal(); 									// notify(); 기다리고 있는 CUST를 깨우기 위함
			System.out.println("Dishes : " + dishes.toString());
		} finally {
			lock.unlock();
		}
	}
	
	public void remove(String dishName) {
		lock.lock();											// synchronized(this)
		String name = Thread.currentThread().getName();
		
		try {
			while (dishes.size() == 0) {
				System.out.println(name + " is waiting.");
				try {
					forCust.await();							//wait(); CUST쓰레드를 기다리게 한다.
					Thread.sleep(500);
				} catch (InterruptedException e) { }
			}
			
			while (true) {
				for (int i=0; i < dishes.size(); i++) {
					if (dishName.equals(dishes.get(i))) {
						dishes.remove(i);
						forCook.signal();						// notify(); 잠자고 있는 COOK을 깨움
						return;
					}
				}
				
				try {
					System.out.println(name + " is waiting.");
					forCust.await();							// CUST쓰레드를 기다리게 한다.
					Thread.sleep(500);
				} catch (InterruptedException ex) {
					
				}
			}
		} finally {
			lock.unlock();
		}
	}
	
	public int dishName() { return dishNames.length; }
	
}

/**
 * @author sharpen
 * Condition을 사용해서 기아현상이나 경쟁 상태가 확실히 개선된 코드
 */
class ThreadWait04 {

	public static void main(String[] args) throws Exception {
		Table04 table = new Table04();
		
		new Thread(new Cook04(table), "COOK1").start();
		new Thread(new Customer04(table, "donut"), "CUST1").start();
		new Thread(new Customer04(table, "burget"), "CUST2").start();
		
		Thread.sleep(2000);
		System.exit(0);
	}

}
