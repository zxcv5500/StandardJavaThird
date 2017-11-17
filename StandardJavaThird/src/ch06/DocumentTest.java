package ch06;

/**
 * @author zxcv5500
 * 파일명이 없을 경우 임의 이름 정해주는 경우의 응용을 보여주는 코드
 */
class Document {
	static int count = 0;
	String name;						// 문서명(Document name)
	
	Document() {
		this("제목없음" + ++count);
	}
	
	Document(String name) {
		this.name = name;
		System.out.println("문서 " + this.name + "가 생성되었습니다.");
	}
	
}

public class DocumentTest {

	public static void main(String[] args) {
		Document d1 = new Document();
		Document d2 = new Document("자바.txt");
		Document d3 = new Document();
		Document d4 = new Document();
		System.out.println("생성된 인스턴스 개수 : " + Document.count);
	}

}
