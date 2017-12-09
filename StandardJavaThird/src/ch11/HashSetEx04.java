package ch11;

import java.util.HashSet;

/**
 * @author sharpen
 * equals와 hashcode를 이용한 구분코드
 */
class HashSetEx04 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new Person02("David", 10));
		set.add(new Person02("David", 10));

		System.out.println(set);
	}

}

class Person02 {
	String name;
	int age;
	
	Person02(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Person02) {
			Person02 tmp = (Person02) obj;
			return name.equals(tmp.name) && age == tmp.age;
		}
		return false;
	}
	
	
	public int hashCode() {
		return (name+age).hashCode();
	}
	
	public String toString() {
		return name + ":" + age;
	}
}
