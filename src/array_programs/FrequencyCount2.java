package array_programs;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount2 {
	public static void main(String[] args) {
		int[] a = { -1, 2, 3, 2, 3, 4, 3, 6, 5, 4, 6, 4, 8, 8, 5, 6, 3, 2 };
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		for (int i : a) {
			if (m.containsKey(i)) {
				m.put(i, m.get(i) + 1);
			} else {
				m.put(i, 1);
			}
		}

		for (Map.Entry<Integer, Integer> e : m.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}
}
