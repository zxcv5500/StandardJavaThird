package ch07;

class A3 {
	void methodA3() {
		I3 i3 = InstanceManager.getInstance();					// 제3의 클래스의 메서드를 통해서 인터페이스 I를 구현한 클래스의 인스턴스를 얻어온다.
		i3.methodB3();
		System.out.println(i3.toString());		
	}
}

interface I3 {
	public abstract void methodB3();
}

class B3 implements I3 {

	@Override
	public void methodB3() {
		System.out.println("methodB3 in B3");		
	}

	public String toString() {
		return "class B3";
	}
}

class InstanceManager {
	public static I3 getInstance() {
		return new B3();
	}
}

/**
 * @author sharpen
 * 인스턴스를 직접 생성하지 않고, getInstance()라는 메서드를 통해 제공받는다.
 * 이렇게 하면, 나중에 다른 클래스의 인스턴스로 변경되어도 A3클래스의 변경없이
 * getInstance()메소드만 변경하면 된다는 장점이 생긴다.
 */
class InterfaceTest3 {

	public static void main(String[] args) {
		A3 a3 = new A3();
		a3.methodA3();
	}

}
