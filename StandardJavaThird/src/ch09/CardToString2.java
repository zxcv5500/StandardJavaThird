package ch09;

class Card2 {
	String kind;
	int number;
	
	Card2() {
		this("SPADE", 1);				//Card(String kind, int number)를 호출
	}
	
	Card2(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * 클래스의 toString() 메소드를 오버라이딩해서 출력 내용을 변경해서 사용한다.
	 */
	public String toString() {
		// Card2인스턴스의 kind와 number를 문자열로 반환한다.
		return "kind : " + kind + ", number : " + number;
	}
}

class CardToString2 {

	public static void main(String[] args) {
		Card2 c1 = new Card2();
		Card2 c2 = new Card2("HEART", 10);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
