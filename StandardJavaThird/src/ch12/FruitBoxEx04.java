package ch12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Fruit04 {
	String name;
	int weight;
	
	Fruit04(String name, int weigth) {
		this.name = name;
		this.weight = weigth;
	}
	
	public String toString() {
		return name + "(" + weight + ")";
	}
}

class Apple04 extends Fruit04 {
	Apple04(String name, int weight) {
		super(name, weight);
	}
}

class Grape04 extends Fruit04 {
	Grape04(String name, int weight) {
		super(name, weight);
	}
}


// 과일들을 비교하는 클래스들 생성
class AppleComp implements Comparator<Apple04> {

	@Override
	public int compare(Apple04 t1, Apple04 t2) {
		return t2.weight - t1.weight;
	}
	
}

class GrapeComp implements Comparator<Grape04> {

	@Override
	public int compare(Grape04 t1, Grape04 t2) {
		
		return t2.weight - t1.weight;
	}
	
}

class FruitComp implements Comparator<Fruit04> {

	@Override
	public int compare(Fruit04 t1, Fruit04 t2) {
		
		return t2.weight - t1.weight;
	}
	
}


/**
 * @author sharpen
 * 와일드 카드의 하한을 제한하는 제네릭스
 */
class FruitBoxEx04 {

	public static void main(String[] args) {
		FruitBox04<Apple04> appleBox = new FruitBox04<Apple04>();
		FruitBox04<Grape04> grapeBox = new FruitBox04<Grape04>();
		
		appleBox.add(new Apple04("GreenApple", 300));
		appleBox.add(new Apple04("GreenApple", 100));
		appleBox.add(new Apple04("GreenApple", 200));
		
		grapeBox.add(new Grape04("GreenGrape", 400));
		grapeBox.add(new Grape04("GreenGrape", 300));
		grapeBox.add(new Grape04("GreenGrape", 200));
		
		Collections.sort(appleBox.getList(), new AppleComp());
		Collections.sort(grapeBox.getList(), new GrapeComp());
		
		System.out.println(appleBox);
		System.out.println(grapeBox);
		System.out.println();
		
		Collections.sort(appleBox.getList(), new FruitComp());
		Collections.sort(grapeBox.getList(), new FruitComp());
		System.out.println(appleBox);
		System.out.println(grapeBox);
	}

}


class FruitBox04<T extends Fruit04> extends Box04<T> { }

class Box04<T> {
	ArrayList<T> list = new ArrayList<>();
	
	void add(T item) {
		list.add(item);
	}
	
	T get (int i) {
		return list.get(i);
	}
	
	ArrayList<T> getList() { return list; }
	
	int size() {
		return list.size();
	}
	
	public String toString() {
		return list.toString();
	}
}

