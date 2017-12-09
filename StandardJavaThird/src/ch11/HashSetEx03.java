package ch11;

import java.util.HashSet;

/**
 * @author sharpen
 * 이름과 나이가 같으면 같은 사람으로 인식하려는 의도였으나 그렇게 안됨. 해결은 HashSetEx04 예제코드에서~
 */
class HashSetEx03 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		
		System.out.println(set);
	}
	

}


class Person {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + ":" + age;
	}
}