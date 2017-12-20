package ch13;

import java.util.ArrayList;

class Customer02 implements Runnable {
	private Table02 table;
	private String food;
	
	Customer02(Table02 table, String food) {
		this.table = table;
		this.food = food;
	}

	@Override
	public void run() {
		while(true) {
			try { Thread.sleep(10);	} catch (InterruptedException e) {}
			String name = Thread.currentThread().getName();
			
			if (eatFood()) {
				System.out.println(name + " ate a " + food);
			} else {
				System.out.println(name + " failed to eat. : (");
			}
		}
	}
	
	public boolean eatFood() {		return table.remove(food);	}	
	
}

class Cook02 implements Runnable {
	private Table02 table;
	
	Cook02(Table02 table) { this.table = table;}

	@Override
	public void run() {
		while (true) {
			int idx = (int) (Math.random() * table.dishNum());
			table.add(table.dishNames[idx]);
			try { Thread.sleep(100); } catch (InterruptedException e) { }
		}
	}
	
	
}

class Table02 {
	String[] dishNames = { "donut", "donut", "burger" };
	final int MAX_FOOD = 6;
	
	private ArrayList<String> dishes = new ArrayList<>();
	
	public synchronized void add(String dish) {				// synchronized를 추가.
		if (dishes.size() >= MAX_FOOD)
			return;
		dishes.add(dish);
		System.out.println("Dishes : " + dishes.toString());
	}
	
	public boolean remove(String dishName) {
		synchronized(this) {
			while(dishes.size() == 0) {
				String name = Thread.currentThread().getName();
				System.out.println(name + " is waiting.");
				try { Thread.sleep(500); } catch (InterruptedException e) { }
			}
			
			for (int i = 0; i < dishes.size(); i++) {
				if (dishName.equals(dishes.get(i))) {
					dishes.remove(i);
					return true;
				}
			}
		}
		
		return false;
	}
	
	public int dishNum() {
		return dishNames.length;
	}
}

/**
 * @author sharpen
 * Table02를 공유하는 객체간에 lock점유로 인해서 오동작하는 코드.
 */
class ThreadWaitEx02 {

	public static void main(String[] args) throws Exception {
		Table02 table = new Table02();			// 여러 쓰레드가 공유하는 객체
		
		new Thread(new Cook02(table), "COOK1").start();
		new Thread(new Customer02(table, "donut"), "CUST1");
		new Thread(new Customer02(table, "burger"), "CUST2");
		
		Thread.sleep(5000);
		System.exit(0);
	}

}
