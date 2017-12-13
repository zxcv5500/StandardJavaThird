package ch12;

class Parent {
	void parentMethod() {
		
	}
}

/**
 * @author sharpen
 * 어노테이션의 사용 예제. 일부러 에러 나는 상태로 반영함
 */
class Child extends Parent {
	@Override				// 컴파일러에게 이 메서드는 조상에 있는 메서드를 오버라이드 하는 것이라고 표시해 준다.
							// 그럼 컴파일러는 조상에 그 메서드가 있는지 체크하고 없으면 에러를 띄워준다.
	void parentmethod() {						// 조상 메서드의 이름을 잘못 적음. m -> M 
		
	}
}
