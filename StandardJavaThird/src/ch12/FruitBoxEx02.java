package ch12;

import java.util.ArrayList;

class Fruit02 implements Eatable {
	public String toString() { return "Fruit"; }
}

class Apple02 extends Fruit02 { 
	public String toString() { return "Apple02";} 	
}
class Grape02 extends Fruit02 { 
	public String toString() { return "Grape02";} 
}

class Toy02 { 
	public String toString() { 		return "Toy02";	}
}

interface Eatable { 
	
}

/**
 * @author sharpen
 * 특정 타입 자신과 자손 클래스들만 대입할 수 있도록 제한된 generic 제네릭 예제.
 * interface도 extends 키워드를 사용하고 만약 두개 이상일 땐 
 * <T extends Fruit02 & Eatable>과 같이 &문자로 표현한다.
 */
class FruitBoxEx02 {

	public static void main(String[] args) {
		FruitBox02<Fruit02> fruitBox = new FruitBox02<>();
		FruitBox02<Apple02> appleBox = new FruitBox02<>();
		FruitBox02<Grape02> grapeBox = new FruitBox02<>();
//		FruitBox02<Grape02> grapeBox = new FruitBox02<Apple02>();			// 에러! 타입 불일치
//		FruitBox02<Toy02> toyBox = new FruitBox02<Toy02>();					// 에러!.
		
		fruitBox.add(new Fruit02());
		fruitBox.add(new Apple02());
		fruitBox.add(new Grape02());
		appleBox.add(new Apple02());
//		appleBox.add(new Grape02());											// grape는 apple의 자손이 아님
		grapeBox.add(new Grape02());
		
		System.out.println("fruitBox-" + fruitBox);
		System.out.println("appleBox-" + appleBox);
		System.out.println("grapeBox-" + grapeBox);
		
	}

}

class FruitBox02<T extends Fruit02 & Eatable> extends Box02<T> {
	
}

class Box02<T> {
	ArrayList<T> list = new ArrayList<>();
	void add(T item) { list.add(item); }
	T get(int i) { return list.get(i); }
	int size() {return list.size(); }
	public String toString() { return list.toString(); }
}
