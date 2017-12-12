package ch12;

import java.util.ArrayList;


class Fruit03 implements Eatable {
	public String toString() { return "Fruit03"; }
}

class Apple03 extends Fruit03 { 
	public String toString() { return "Apple03";} 	
}

class Grape03 extends Fruit03 { 
	public String toString() { return "Grape03";} 
}

class Juice {
	String name;
	
	Juice(String name) {this.name = name + "Juice"; }
	public String toString() { return name; }
}

class Juicer {
	static Juice makeJuice(FruitBox03<? extends Fruit03> box) {
		String tmp = "";
		
		for (Fruit03 f : box.getList())
			tmp += f + " ";
		return new Juice(tmp);
	}
}

/**
 * @author sharpen
 * 제네릭스 상한선 제한 와일드 카드 사용 예제
 */
class FruitBoxEx03 {	
	public static void main(String[] args) {
		FruitBox03<Fruit03> fruitBox = new FruitBox03<>();
		FruitBox03<Apple03> appleBox = new FruitBox03<>();
		FruitBox03<Grape03> grapeBox = new FruitBox03<>();
		
		fruitBox.add(new Apple03());
		fruitBox.add(new Grape03());
		appleBox.add(new Apple03());
		appleBox.add(new Apple03());
		grapeBox.add(new Grape03());
		grapeBox.add(new Grape03());
		grapeBox.add(new Grape03());
		
		
		System.out.println(Juicer.makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));
		System.out.println(Juicer.makeJuice(grapeBox));
	}

}


class FruitBox03<T extends Fruit03> extends Box03<T> {
	
}

class Box03<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item); }
	T get(int i) { return list.get(i); }
	ArrayList<T> getList() { return list; }
	int size() { return list.size(); }
	public String toString() { return list.toString(); }
}


