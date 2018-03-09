package ch14;

@FunctionalInterface
interface MyFunction02 {
	void myMethod();		// public abstract void myMethod();
}

public class LambdaEx02 {

	public static void main(String[] args) {
		MyFunction02 f = () -> {};				// MyFunction02 f = ( MyFunction) () {} );
		Object obj = (MyFunction02) ( ()->{} );			// Object타입으로 형변환이 생략됨. Object obj = (Object) (MyFunction02) ( ()->{} );
		String str = ((Object) (MyFunction02) (()->{})).toString();
		
		System.out.println(f);
		System.out.println(obj);
		System.out.println(str);
		
//		System.out.println(()->{});				// 에러. 람다식은 Object타입으로 형변환 안됨. 실행 시키려면 이부분 주석으로 막고 실행하면 됨.
		System.out.println(  (MyFunction02) ( ()->{} )  );
//		System.out.println(  (MyFunction02) ( ()->{} ).toString()  );				// 에러
		System.out.println(  ((Object) (MyFunction02) (()->{})).toString() );
		
	}

}
