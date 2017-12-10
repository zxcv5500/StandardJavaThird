package ch11;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author sharpen
 * 문자열 배열에 담긴 문자열을 하나씩 읽어서 HashMap에 키로 저장하고 값으로 1을 지정한 후 같은 값이면 1씩 증가시켜 갯수를 세는 예제.
 */
class HashMapEx04 {

	public static void main(String[] args) {
		String[] data = { "A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D" };
		
		HashMap map = new HashMap();
		
		for (int i = 0; i < data.length; i++) {
			if (map.containsKey(data[i])) {
				Integer value = (Integer) map.get(data[i]);
				map.put(data[i], new Integer(value.intValue() + 1));
			} else {
				map.put(data[i], new Integer(1));
			}
		}
		
		Iterator it = map.entrySet().iterator();
		
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			int value = ((Integer) entry.getValue()).intValue();
			System.out.println(entry.getKey() + " : " +printBar('#', value) + " " + value);
		}
	}

	public static String printBar(char ch, int value) {
		char[] bar = new char[value];
		
		for (int i=0; i < bar.length; i++) {
			bar[i] = ch;
		}
		return new String(bar);
	}

}
