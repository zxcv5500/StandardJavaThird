package ch12;

class NewClass {
	int newField;
	
	int getNewField() {
		return newField;
	}
	
	@Deprecated
	int oldField;
	
	@Deprecated
	int getOldField() {
		return oldField;
	}
}

/**
 * @author sharpen
 * Deprecated 어노테이션 예제
 */
class AnnotationEx02 {
	public static void main(String[] args) {
		NewClass nc = new NewClass();
		nc.oldField =10;						//@Deprecated 가 붙은 대상을 사용
		System.out.println(nc.getOldField());						//@Deprecated 가 붙은 대상을 사용
	}
}