package ch09;

class Card {
	String kind;
	int number;
	
	Card() {
		this("SPADE", 1);
	}
	
	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
}

/**
 * @author sharpen
 * 사용하는 클래스에서 toString() 메서드를 오버라이드해서 사용하지 않는다면 실행결과와 같이 클래스 이름.해쉬코드 결과를 얻게 된다.
 */
class CardToString {

	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
