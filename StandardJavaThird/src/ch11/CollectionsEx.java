package ch11;

import static java.util.Collections.addAll;
import static java.util.Collections.binarySearch;
import static java.util.Collections.copy;
import static java.util.Collections.disjoint;
import static java.util.Collections.enumeration;
import static java.util.Collections.fill;
import static java.util.Collections.list;
import static java.util.Collections.max;
import static java.util.Collections.min;
import static java.util.Collections.nCopies;
import static java.util.Collections.replaceAll;
import static java.util.Collections.reverseOrder;
import static java.util.Collections.rotate;
import static java.util.Collections.shuffle;
import static java.util.Collections.sort;
import static java.util.Collections.swap;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * @author sharpen
 * 소개 하지 않은 메서드들의 사용 예제
 */
class CollectionsEx {

	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println(list);
		
		addAll(list, 1,2,3,4,5);
		System.out.println(list);
		
		rotate(list, 2);					// 오른쪽으로 두 칸씩 이동
		System.out.println(list);
		
		swap(list, 0, 2);					// 첫번째와 세번째를 교환
		System.out.println(list);
		
		shuffle(list);						// 저장된 요소의 위치를 임의(랜덤)하게 변경한다.
		System.out.println(list);
		
		sort(list);							// 정렬
		System.out.println(list);
		
		sort(list, reverseOrder());			// 역순 정렬 reverse(list);와 동일
		System.out.println(list);
		
		int idx = binarySearch(list, 3);	// 3이 저장된 위치(index)를 반환
		System.out.println("index of 3 = " + idx);
		
		System.out.println("max=" + max(list));
		System.out.println("min=" + min(list));
		System.out.println("min=" + max(list, reverseOrder()));
		
		fill(list, 9);						// list를 9로 채운다
		System.out.println("list=" + list);
		
		// list와 같은 크기의 새로운 list를 생성하고 2로 채운다. 단 결과는 변경불가
		List newList = nCopies(list.size(), 2);
		System.out.println("newList=" + newList);
		
		System.out.println(disjoint(list, newList));			// 공통 요소가 없으면 true
		
		copy(list, newList);
		System.out.println("newList= " + newList);
		System.out.println("list=" + list);
		
		replaceAll(list, 2, 1);
		System.out.println("list=" + list);
		
		Enumeration e = enumeration(list);
		ArrayList list2 = list(e);
		
		System.out.println("list2=" + list2);
		
		
		
	}

}
