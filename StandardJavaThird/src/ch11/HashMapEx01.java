package ch11;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author zxcv5500
 * HashMap을 생성하고 사용자ID와 비밀번호를 키와 값의 쌍으로 저장한 다음 입력된 사용자ID를 키로 HashMap에서 검색해서 비교하는 로직 예제
 */
class HashMapEx01 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		
		Scanner s = new Scanner(System.in);					// 화면으로부터 라인단위로 입력받는다.
		
		while(true) {
			System.out.println("id와 password를 입력해 주세요.");
			System.out.print("id : ");
			String id = s.nextLine().trim();
			System.out.println();
			
			System.out.print("password : ");
			String password = s.nextLine().trim();
			System.out.println();
			
			if (!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다."
						+ "다시 입력해주세요.");
				continue;
			} else {
				if (!(map.get(id)).equals(password)) {
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
				} else {
					System.out.println("id와 비밀번호가 일치합니다.");
					break;
				}
			}
		}
	}

}
